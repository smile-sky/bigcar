package com.carshop.controller;


import com.carshop.domain.Tell;
import com.carshop.service.TellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/tell")
public class TellController {
    @Autowired
    private TellService tellService;

    @RequestMapping("/querytell")
    public String querytell(Integer user_id){
        List<Tell> rows=tellService.querytell(user_id);
        String a;
        if (user_id!= null) {
            a = "success";
        } else {
            a = "error";
        }
        return a;
    }

    @RequestMapping("/inserttell")
    public String inserttell(Tell tell){
        Integer rows=tellService.inserttell(tell);
        String a;
        if (tell!= null) {
            a = "success";
        } else {
            a = "error";
        }
        return a;
    }

    @RequestMapping("/deletetell")
    public String deletetell(Integer tell_id){
        Integer rows=tellService.deletetell(tell_id);
        String a;
        if (tell_id!= null) {
            a = "success";
        } else {
            a = "error";
        }
        return a;
    }
}
