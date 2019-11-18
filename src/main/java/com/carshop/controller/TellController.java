package com.carshop.controller;


import com.carshop.domain.Tell;
import com.carshop.domain.User;
import com.carshop.service.TellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/tell")
public class TellController {
    @Autowired
    private TellService tellService;

    @RequestMapping("/querytell")
    public String querytell(Integer user_id, Integer product_id, Model d) {
        List<Tell> rows = tellService.querytell(user_id, product_id);
        String a;

        if (user_id!= null) {
            d.addAttribute("tell", rows);
            a = "tell/tellU";
        } else {
            a = "error";
        }
        return a;
    }

    @RequestMapping("/inserttell")
    public String inserttell(Tell tell, HttpSession s) {
        Integer rows=tellService.inserttell(tell);
        User r = (User) s.getAttribute("user");
        Integer y = r.getUser_id();
        String s1 = y.toString();
        String a;
        if (tell!= null) {
            a = "redirect:/tell/querytell?user_id=" + s1 + "";
            /* a = "../../user";*/
        } else {
            a = "error";
        }
        return a;
    }

    @RequestMapping("/deletetell")
    public String deletetell(Integer tell_id, HttpSession session) {
        Integer rows=tellService.deletetell(tell_id);
        User r = (User) session.getAttribute("user");
        Integer y = r.getUser_id();
        String s1 = y.toString();
        String a;
        if (tell_id!= null) {
            a = "redirect:/tell/querytell?user_id=" + s1 + "";
        } else {
            a = "error";
        }
        return a;
    }
}
