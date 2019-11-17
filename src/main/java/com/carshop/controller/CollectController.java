package com.carshop.controller;

import com.carshop.domain.Collect;
import com.carshop.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/collect")
public class CollectController {
    //@Qualifier("collectService")
    @Autowired
    private CollectService collectService;

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
     * @param collectId
     * @param model
     * @return
     */
  @RequestMapping("/queryByIdCollect")
  public String queryOneCollect(Integer collectId,Model model){
      Collect collect=collectService.getCollect(collectId);
        model.addAttribute("collect",collect);
      String a;
      if (collect != null) {
          a = "success";
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
  public String insertDing(Collect collect){
   int row=collectService.insertCollect(collect);
   String a;
      if (collect!= null) {
          a = "success";
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
  public String deleteCollect(int collectId,Model model){
        int rows=collectService.deleteCollect(collectId);
        model.addAttribute("collect",collectId);
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
