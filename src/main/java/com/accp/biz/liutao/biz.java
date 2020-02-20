package com.accp.biz.liutao;

import com.accp.dao.liutao.classMapper;
import com.accp.dao.liutao.mrecordMapper;
import com.accp.dao.liutao.pickcarMapper;
import com.accp.pojo.*;
import com.accp.pojo.liutao.class1;
import com.accp.pojo.liutao.mrecord;
import com.accp.pojo.liutao.pickcar;
import com.accp.pojo.liutao.projecttype;
import com.accp.pojo.liutao.vehicle;
import com.accp.vo.liutao.carInfo;
import com.accp.vo.liutao.minfo;
import com.accp.vo.liutao.vehicleInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.List;

@SuppressWarnings("ALL")
@Service
public class biz {

    @Autowired
    private com.accp.dao.liutao.vehicleMapper vehicleMapper;

    @Autowired
    private com.accp.dao.liutao.projecttypeMapper projecttypeMapper;

    @Autowired
    private pickcarMapper pickcarMapper;

    @Autowired
    private mrecordMapper mrecordMapper;

    @Autowired
    private classMapper classMapper;


    //@Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = true)
    public List<vehicle> queryCarNo(){
        return vehicleMapper.queryCarNo();
    }

    public List<carInfo> queryCarInfo(String carno){
        return vehicleMapper.queryCarInfo(carno);
    }

    public List<carInfo> queryPickInfo(String carno){
        return vehicleMapper.queryPickInfo(carno);
    }

    public List<projecttype> queryProjectType(){
        return projecttypeMapper.queryProjectType();
    }

    public List<minfo> queryMainInfoBypno(String pno){
        return vehicleMapper.queryMainInfoBypno(pno);
    }

    public int addXcar(pickcar pickcar){
        return pickcarMapper.addXcar(pickcar);
    }

    public List<vehicleInfo> queryVehicleInfo(String carNo,String id){
        return pickcarMapper.queryVehicleInfo(carNo,id);
    }

    public String QueryMrecordNo(){
        String mrecordNo = mrecordMapper.QueryMrecordNo();
        String date = LocalDate.now().toString().replace("-", "");
        if(mrecordNo==null){
            return date+"0001";
        }else {
             int d= Integer.parseInt(mrecordNo.substring(mrecordNo.length()-4,mrecordNo.length()))+1;
            return date+new DecimalFormat("0000").format(d);
        }
    }

    public List<vehicle> queryVehiclecp(String vtext){
        return vehicleMapper.queryVehiclecp("%"+vtext+"%");
    }

    public String queryPickCar(String carno){
        List<mrecord> mrecords = mrecordMapper.queryPickCar(carno);
        if(mrecords.size()==0){
            return"ok";
        }
        return "false";
    }

    public List<class1> queryArtisan(){
        return classMapper.queryArtisan();
    }

    public List<vehicleInfo> queryAllm(){
        return mrecordMapper.queryAllm();
    }

    public int comAccp(String eno){
        return mrecordMapper.comAccp(eno);
    }




}
