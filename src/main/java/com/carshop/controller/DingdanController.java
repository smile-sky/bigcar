package com.carshop.controller;

import com.carshop.domain.Dingdan;
import com.carshop.service.DingdanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/dingdan")
public class DingdanController {
    //@Qualifier("dingdanService")
    @Autowired
    private DingdanService dingdanService;

    /**
     * 查询所有订单
     * @param model
     * @return
     */
    @RequestMapping("/queryAllDingdan")
    public String query(Model model){
      List<Dingdan> dingdans=dingdanService.queryDingdan();
      model.addAttribute("dingdan",dingdans);
      String a;
      if (dingdans != null) {

          a = "success";
      } else {
          a = "error";
      }
      return a;
  }

    /**
     * 根据订单ID查询订单信息
     * @param dingdanId
     * @param model
     * @return
     */
  @RequestMapping("/queryByIdDingdan")
  public String queryOne(Integer dingdanId,Model model){
        Dingdan dingdan=dingdanService.getDingdan(dingdanId);
        model.addAttribute("dingdan",dingdan);
      String a;
      if (dingdan != null) {
          a = "success";
      } else {
          a = "error";
      }
      return a;
  }

    /**
     *
     * 添加订单
     * @return
     */
  @RequestMapping("/insertDingdan")
  public String insertDing(Dingdan dingdan){
   int row=dingdanService.insertDingdan(dingdan);
   String a;
      if (dingdan!= null) {
          a = "success";
      } else {
          a = "error";
      }
      return a;
  }

    /**
     *删除订单
     * @return
     */
  @RequestMapping("/deleteDingdan")
  public String deleteDingdan(int dingdanId,Model model){
        int rows=dingdanService.deleteDingdan(dingdanId);
        model.addAttribute("dingdan",dingdanId);
        String a;
        if(model!=null){
            a="success";
        }else {
            a="error";
        }
        return a;
  }

    /**
     *
     * 更新订单
     * @return
     */
  @RequestMapping("/updateDingdan")
  public String updateDingdan(Dingdan dingdan){
        int rows=dingdanService.updateDingdan(dingdan);
      String a;
      if (dingdan!= null) {
          a = "success";
      } else {
          a = "error";
      }
      return a;
  }

}
