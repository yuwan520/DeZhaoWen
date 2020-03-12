package com.accp.biz.liutao;

import com.accp.dao.liutao.*;
import com.accp.pojo.liutao.*;
import com.accp.vo.liutao.carInfo;
import com.accp.vo.liutao.cominfo;
import com.accp.vo.liutao.minfo;
import com.accp.vo.liutao.vehicleInfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    @Autowired
    private CompletionMapper completionMapper;

    @Autowired
    private PcstatusMapper pcstatusMapper;


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

    public PageInfo<vehicleInfo> queryAllm(Integer num,Integer size,cominfo cominfo){
        PageHelper.startPage(num,size);
        return new PageInfo<vehicleInfo>(mrecordMapper.queryAllm(cominfo));
    }

    public int comAccp(String eno){
        return mrecordMapper.comAccp(eno);
    }

    public int completion(Completion completion){
        if(completion.getQualified()==0){
            //合格，修改接车状态
            mrecordMapper.comAccp(completion.getEno());
        }
        return mrecordMapper.completion(completion);
    }

    public String queryReWork(String eno){
        return completionMapper.queryReWork(eno);
    }

    public int updateQualified(String eno){
        return completionMapper.updateQualified(eno);
    }

    public int updateHgQualified(String eno){
        mrecordMapper.comAccp(eno);
        return completionMapper.updateHgQualified(eno);
    }

    public List<Pcstatus> qAllS(){
        return pcstatusMapper.qAllS();
    }








}
