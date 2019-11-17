package com.carshop.controller;

import com.carshop.dao.SellerDao;
import com.carshop.domain.Admin;
import com.carshop.domain.Seller;
import com.carshop.domain.User;
import com.carshop.service.AdminService;
import com.carshop.service.SellerService;
import com.carshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/seller")
public class SellerController {
    //@Qualifier("sellerService")
    @Autowired
    private SellerService sellerService;

    @Autowired
    private UserService userService;

    @Autowired
    private AdminService adminService;

    //卖家登录的方法
    @RequestMapping("/SellerLogin")
    public String login(String username, String password,Integer lei, HttpServletRequest session) {
        String a;
        if(lei==0){
            Admin admin=adminService.login(username,password);
            if (admin!=null){
                a="admin";
                session.setAttribute("admin",admin);
            }else a="error";
            return a;
        }
        if(lei==1){
            User user=userService.login(username,password);
            if (user!=null){
                a="success";
                session.setAttribute("user",user);
            }else a="error";
            return a;
        }
        if(lei==2){
            Seller seller=sellerService.login(username,password);
            if (seller!=null){
                a="success";
                session.setAttribute("seller",seller);
            }else a="error";
            return a;
        }
        return null;
    }


   // 查询所有
    @RequestMapping("/sellerselect")
    public String select(String username,String phone,Model d){
      List<Seller> sellers=sellerService.queryseller(username,phone);
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
  public String select1(Integer sellerid, Model d) {
      Seller seller = sellerService.selectseller(sellerid);
      String a;
      if (seller != null) {
          a = "reviseSeller";
          d.addAttribute("seller", seller);
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
  public String deleteseller(int sellerid, Model model){
        int rows=sellerService.deleteseller(sellerid);
        model.addAttribute("seller",sellerid);
        String a;
        if(model!=null){
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
