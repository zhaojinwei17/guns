package cn.stylefeng.guns.modular.rent.controller;

import cn.stylefeng.guns.core.common.page.LayuiPageFactory;
import cn.stylefeng.guns.core.common.page.LayuiPageInfo;
import cn.stylefeng.guns.modular.rent.entity.RentBaseInfo;
import cn.stylefeng.guns.modular.rent.service.RentBaseInfoService;
import cn.stylefeng.roses.core.reqres.response.ResponseData;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/rent")
public class RentBaseInfoController {

    @Resource
    RentBaseInfoService rentBaseInfoService;

    private String PREFIX = "/modular/rent/base/info/";

    @GetMapping("/base/info/page")
    public ModelAndView listPage() {
        ModelAndView modelAndView=new ModelAndView(PREFIX + "list.html");
        return modelAndView;
    }

    @PostMapping("/base/info/list")
    public LayuiPageInfo list(@RequestBody RentBaseInfo rentBaseInfo){
        return rentBaseInfoService.list(rentBaseInfo);
    }

    @PostMapping("/base/add/or/update")
    public ResponseData addOrUpdate(@RequestBody RentBaseInfo rentBaseInfo){
        ResponseData responseData = rentBaseInfoService.addOrUpdate(rentBaseInfo);
        return responseData;
    }
    @DeleteMapping("/base/del/{id}")
    public ResponseData deleteById(@PathVariable("id") String id){
        return rentBaseInfoService.deleteById(id);
    }

}
