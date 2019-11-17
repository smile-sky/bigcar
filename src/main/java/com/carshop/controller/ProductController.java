package com.carshop.controller;

import com.carshop.dao.ProductDao;
import com.carshop.domain.Product;
import com.carshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    //（买家）商品按商品品牌跟型号查询
    @RequestMapping("/queryproduct")
    public String queryproduct(String pinpai, String type, Model model){
        List<Product> product = productService.queryproduct(pinpai, type);
        model.addAttribute("product", product);
       String a;
       if (product!=null){
           a = "Product/productM";
       }else a="error";
       return a;
    }



    //卖家根据商品ID查询
    @RequestMapping("/selectproductid")
    public String selectproductid(Integer product_id, Model d) {
        Product rows = productService.selectproductid(product_id);
        String a;
        if (rows!=null){
            d.addAttribute("product", rows);
            a = "reviseProduct";
        }
        else a="error";
        return a;
    }

    //商品上架
    @RequestMapping("/insertproduct")
    public String insertproduct(Product product){
        int rows=productService.insertproduct(product);
        String a;
        if (product!=null){
            a="success";
        }
        else a="error";
        return a;
    }


    //商品删除
    @RequestMapping("/deleteproduct")
    public String deleteproduct(int product_id,Model model){
        int rows=productService.deleteproduct(product_id);


        model.addAttribute("ID",product_id);
        String a;
        if (model!=null){
            a="success";
        }
        else a="error";
        return a;
    }


    //商品修改
    @RequestMapping("/updateproduct")
    public String updateproduct(Product product){
   int rows=productService.updateproduct(product);
        String a;
        if (product!=null){
            a = "redirect:/product/queryproduct";
        }
        else a="error";
        return a;
    }

    @RequestMapping("/stopproduct")
    public String stopprotuct(Integer product_id) {
        Integer rows = productService.stopproduct(product_id);
        String a;
        if (rows != null) {
            a = "redirect:/product/queryproduct";
        } else a = "error";
        return a;
    }

    @RequestMapping("/startproduct")
    public String startprotuct(Integer product_id) {
        Integer rows = productService.startproduct(product_id);
        String a;
        if (rows != null) {
            a = "redirect:/product/queryproduct";
        } else a = "error";
        return a;
    }


}
