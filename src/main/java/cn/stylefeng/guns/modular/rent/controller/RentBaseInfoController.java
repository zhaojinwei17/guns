package cn.stylefeng.guns.modular.rent.controller;

import cn.stylefeng.guns.modular.rent.entity.RentBaseInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/rent")
public class RentBaseInfoController {

    private String PREFIX = "/modular/rent/base/info";

    @GetMapping("/base/info/page")
    public ModelAndView listPage() {
        ModelAndView modelAndView=new ModelAndView(PREFIX + "list.html");
        return modelAndView;
    }

    @GetMapping("/base/detail/page")
    public ModelAndView detail() {
        ModelAndView modelAndView=new ModelAndView(PREFIX + "detail.html");
        return modelAndView;
    }



}
