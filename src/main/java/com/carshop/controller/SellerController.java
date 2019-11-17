package com.carshop.controller;

import com.carshop.dao.SellerDao;
import com.carshop.domain.Seller;
import com.carshop.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/seller")
public class SellerController {
    //@Qualifier("sellerService")
    @Autowired
    private SellerService sellerService;

   // 查询所有
    @RequestMapping("/sellerselect")
    public String select(String username, String phone, Model d) {
        List<Seller> sellers = sellerService.queryseller(username, phone);
      d.addAttribute("sellerse",sellers);
      String a;
      if (sellers != null) {

          a = "seller/sellerM";
      } else {
          a = "error";
      }
      return a;
  }

  // 按条件（用户名）查询
  @RequestMapping("/sellerselect1")
  public String select1(Integer sellerid, Model b) {
      Seller seller = sellerService.selectseller(sellerid);
        b.addAttribute("seller",seller);
      String a;
      if (seller != null) {
          a = "reviseSeller";
      } else {
          a = "error";
      }
      return a;
  }


    @RequestMapping("/insertseller")
  public String insertseller(Seller seller){
   int row=sellerService.insertseller(seller);
   String a;
      if (seller!= null) {
          a = "success";
      } else {
          a = "error";
      }
      return a;
  }


  @RequestMapping("/deleteseller")
  public String deleteseller(Integer sellerid, Model model) {
      Integer rows = sellerService.deleteseller(sellerid);
        model.addAttribute("seller",sellerid);
        String a;
      if (rows != null) {
          a = "redirect:/seller/sellerselect";
        }else {
            a="error";
        }
        return a;
  }

  @RequestMapping("/updateseller")
  public String updateseller(Seller seller){
        int rows=sellerService.updateseller(seller);
      String a;
      if (seller!= null) {
          a = "redirect:/seller/sellerselect";
      } else {
          a = "error";
      }
      return a;
  }

}
