package com.carshop.controller;

import com.carshop.domain.Collect;
import com.carshop.domain.Dingdan;
import com.carshop.domain.Product;
import com.carshop.domain.User;
import com.carshop.service.CollectService;
import com.carshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/collect")
public class CollectController {
    //@Qualifier("collectService")
    @Autowired
    private CollectService collectService;

    @Autowired
    private ProductService productService;

    /**
     * 查询所有收藏表信息
     * @param model
     * @return
     */
    @RequestMapping("/queryAllCollect")
    public String query(Model model){
      List<Collect> collects=collectService.queryCollect();
      model.addAttribute("collect",collects);
      String a;
      if (collects != null) {

          a = "success";
      } else {
          a = "error";
      }
      return a;
  }


    /**
     * 根据收藏表ID查询收藏表信息
     * @param user_id
     * @param model
     * @return
     */
  @RequestMapping("/queryByIdCollect")
  public String queryOneCollect(Integer user_id, Model model) {
      List<Collect> collect = collectService.getCollect(user_id);
        model.addAttribute("collect",collect);
      String a;
      if (collect != null) {
          a = "collect/collectU";
      } else {
          a = "error";
      }
      return a;
  }

    /**
     *
     * 添加收藏表
     * @return
     */
  @RequestMapping("/insertCollect")
  public String insertDing(Integer product_id, HttpSession session) {
      Collect collect = new Collect();
      User user = (User) session.getAttribute("user");
      collect.setUser_id(user.getUser_id());
      Product product = productService.selectproductid(product_id);
      collect.setPinpai(product.getPinpai());
      collect.setPrice(product.getPrice());
      collect.setType(product.getType());
      collect.setProduct_id(product_id);
   int row=collectService.insertCollect(collect);
   String a;
      if (collect!= null) {
          a = "redirect:/product/selectproductid1?product_id=" + product_id + "";
      } else {
          a = "error";
      }
      return a;
  }


    /**
     *删除收藏表
     * @return
     */
  @RequestMapping("/deleteCollect")
  public String deleteCollect(int collectId, Model model, HttpSession session) {
        int rows=collectService.deleteCollect(collectId);
      User user = (User) session.getAttribute("user");
      Integer x = user.getUser_id();
      String y = x.toString();
        model.addAttribute("collect",collectId);
        String a;
        if(model!=null){
            a = "redirect:/collect/queryByIdCollect?user_id=" + y + "";
        }else {
            a="error";
        }
        return a;
  }

    /**
     *
     * 更新收藏表
     * @return
     */
  @RequestMapping("/updateCollect")
  public String updateCollect(Collect collect){
        int rows=collectService.updateCollect(collect);
      String a;
      if (collect!= null) {
          a = "success";
      } else {
          a = "error";
      }
      return a;
  }

}
