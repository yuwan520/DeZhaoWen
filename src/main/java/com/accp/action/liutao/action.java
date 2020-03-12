package com.accp.action.liutao;

import com.accp.biz.liutao.biz;
import com.accp.pojo.liutao.*;
import com.accp.vo.liutao.carInfo;
import com.accp.vo.liutao.cominfo;
import com.accp.vo.liutao.minfo;
import com.accp.vo.liutao.vehicleInfo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SuppressWarnings("ALL")
@RestController
@RequestMapping("/api/cars")
public class action {

    @Autowired
    private biz biz;

    @GetMapping("carno")
    public List<vehicle> queryCarNo(){
        return biz.queryCarNo();
    }

    @GetMapping("carinfo/{carno}")
    public List<carInfo> queryCarInfo(@PathVariable String carno){
        return biz.queryCarInfo(carno);
    }

    @GetMapping("pickinfo/{carno}")
    public List<carInfo> queryPickInfo(@PathVariable String carno){
        return biz.queryPickInfo(carno);
    }

    @GetMapping("ptype")
    public List<projecttype> queryProjectType(){
        return biz.queryProjectType();
    }

    @GetMapping("minfo/{pno}")
    public List<minfo> queryMainInfoBypno(@PathVariable String pno){
        return biz.queryMainInfoBypno(pno);
    }

    @PostMapping("addcar")
    public String addXcar(@RequestBody pickcar pickcar){
        return biz.addXcar(pickcar)>0?"ok":"false";
    }

    @GetMapping("vehicle/{carNo}/{id}")
    public List<vehicleInfo> queryVehicleInfo(@PathVariable String carNo,@PathVariable String id){
        return biz.queryVehicleInfo(carNo,id);
    }

    @GetMapping("mNo")
    public String QueryMrecordNo(){
        return biz.QueryMrecordNo();
    }

    @GetMapping("vcp/{info}")
    public List<vehicle> queryVehiclecp(@PathVariable String info){
        return biz.queryVehiclecp(info);
    }

    @GetMapping("pcar/{carno}")
    public String queryPickCar(@PathVariable String carno){
        return biz.queryPickCar(carno);
    }

    @GetMapping("art")
    public List<class1> queryArtisan(){
        return biz.queryArtisan();
    }

    @PostMapping("allm/{num}/{size}")
    public PageInfo<vehicleInfo> queryAllm(@PathVariable Integer num,@PathVariable Integer size, @RequestBody cominfo cominfo){
        return biz.queryAllm(num,size,cominfo);
    }

    @PostMapping("accp/{eno}")
    public int comAccp(@PathVariable String eno){
        return biz.comAccp(eno);
    }

    @PostMapping("comp")
    public int completion(@RequestBody Completion completion){
        return biz.completion(completion);
    }

    @GetMapping("rwk/{eno}")
    public String queryReWork(@PathVariable String eno){
        if(biz.queryReWork(eno)==null){
            return "0";
        }
        return biz.queryReWork(eno);
    }

    @PostMapping("upqd/{eno}")
    public int updateQualified(@PathVariable String eno){
        return biz.updateQualified(eno);
    }

    @PostMapping("hgqud/{eno}")
    public int updateHgQualified(@PathVariable String eno){
        return biz.updateHgQualified(eno);
    }

    @GetMapping("qas")
    public List<Pcstatus> qAllS(){
        return biz.qAllS();
    }




}
