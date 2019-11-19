package com.carshop.controller;

import com.carshop.domain.*;
import com.carshop.service.DingdanService;
import com.carshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/dingdan")
public class DingdanController {
    //@Qualifier("dingdanService")
    @Autowired
    private DingdanService dingdanService;

    @Autowired
    private ProductService productService;

    /**
     * 查询所有订单
     * @param model
     * @return
     */
    @RequestMapping("/queryAllDingdan")
    public String query(Integer product_id, Integer user_id, Model model) {
        List<Dingdan> dingdans = dingdanService.queryDingdan(product_id, user_id);
      model.addAttribute("dingdan",dingdans);
      String a;
      if (dingdans != null) {

          a = "dingdan/dingdanM";
      } else {
          a = "error";
      }
        return a;
    }

    @RequestMapping("/userqueryAllDingdan")
    public String userquery(Integer product_id, Integer user_id, Model model) {
        List<Dingdan> dingdans = dingdanService.queryDingdan(product_id, user_id);
        model.addAttribute("dingdan", dingdans);
        String a;
        if (dingdans != null) {

            a = "dingdan/dingdanU";
        } else {
            a = "error";
        }
        return a;
    }


    /**
     * 根据订单ID查询订单信息
     * @param dingdan_id
     * @param model
     * @return
     */
  @RequestMapping("/queryByIdDingdan")
  public String queryOne(Integer dingdan_id, Model model) {
      Dingdan dingdan = dingdanService.getDingdan(dingdan_id);
        model.addAttribute("dingdan",dingdan);
      String a;
      if (dingdan != null) {
          a = "reviseDingdan";
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
  public String insertDing(Integer product_id, HttpSession session, Model model) {

      User user = (User) session.getAttribute("user");
      Dingdan dingdan = new Dingdan();
      dingdan.setUser_id(user.getUser_id());
      dingdan.setProduct_id(product_id);
      Integer row = dingdanService.insertDingdan(dingdan);
      model.addAttribute("row", row);

      //添加订单的同时添加积分记录,这里首先要获取到商品ID去查询到商品的价格
      //Product product = productService.selectproduct(dingdan.getDingdan_id());

      //在这里将商品的价格和用户的ID添加到积分表里面去
      //Num num = dingdanService.insertNum(dingdan.getUser_id(), product.getPrice());


   String a;
      if (row != null) {
          a = "redirect:/product/selectproductid1?product_id=" + product_id + "";
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
            a = "redirect:/dingdan/queryAllDingdan";
        } else {
            a = "error";
        }
      return a;
  }


    /**
     * 查询所有订单(卖家)
     *
     * @param model
     * @return
     */
    @RequestMapping("/queryAllDingdan1")
    public String query1(Model model, Integer sellerid) {

        List<Dingdan> dingdans = dingdanService.queryDingdan1(sellerid);
        model.addAttribute("dingdan", dingdans);
        String a;
        if (dingdans != null) {

            a = "dingdan/dingdanS";
        } else {
            a = "error";
        }
        return a;
    }

    /**
     *
     * 更新订单
     * @return
     */
  @RequestMapping("/updateDingdan")
  public String updateDingdan(Integer dingdan_id) {
      Integer rows = dingdanService.updateDingdan(dingdan_id);
      String a;
      if (rows != null) {
          a = "redirect:/dingdan/queryAllDingdan";
      } else {
          a = "error";
      }
      return a;
  }

    @RequestMapping("/userupdateDingdan")
    public String userupdateDingdan(Integer dingdan_id) {
        Integer rows = dingdanService.updateDingdan(dingdan_id);
        String a;
        if (rows != null) {
            a = "redirect:/dingdan/userqueryAllDingdan";
        } else {
            a = "error";
        }
        return a;
    }

    @RequestMapping("selectuseridandstatu")
    public String selectuseridandstatu(Integer user_id, Integer statu, Model d) {
        String a;
        List<Dingdan> dingdans = dingdanService.selectuseridandstatu(user_id, statu);
        if (dingdans != null) {
            d.addAttribute("dingdan", dingdans);
            a = "pinglun/pinglunU";

        } else a = "error";
        return a;
    }

}
