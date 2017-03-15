package com.wuliu.controller;

import com.wuliu.serviceinterface.enterpriseinterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by 木木高 on 2017/3/9.
 */
@Controller
@RequestMapping("/enterprise")
public class enterpriseController {
    private final  int PageSize=10;
    @Autowired
    private enterpriseinterface enterpriseinterface;
    @RequestMapping("enterpriseMessage")
    public ModelAndView getenterprisemessage(@RequestParam(required=false) int page,ModelAndView mv){
        if(page+""==null||page<0){page=1;}
        List listAll=enterpriseinterface.getentermessage((page-1)*PageSize,PageSize);

        int num=enterpriseinterface.getnum();
        mv.addObject("carMessage",listAll);
        mv.addObject("carNumber",num);
        mv.setViewName("");
        return  mv;
    }
}
