package com.wuliu.controller;

import com.wuliu.pojo.placard;
import com.wuliu.serviceinterface.customarinterface;
import com.wuliu.serviceinterface.placardinterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * Created by 木木高 on 2017/3/9.
 */
@Controller
@RequestMapping("/palaced")
public class palacedController {
    private final int PageSize=10;
    @Autowired
    private placardinterface placardinterface;
    @Autowired
    private customarinterface customarinterface;
    @RequestMapping("getAllplared")
    public ModelAndView getAllplared(@RequestParam(required=false) int page, ModelAndView mv){
        if(page+""==null||page<0){page=1;}
        List listAll=placardinterface.getplacedmessage((page-1)*PageSize,PageSize);
        int num=placardinterface.getnum();
        mv.addObject("carMessage",listAll);
        mv.addObject("carNumber",num);
        mv.setViewName("");
        return  mv;

    }
    @RequestMapping("delplared")
    public ModelAndView delplared(int pid, ModelAndView mv){


        int num=placardinterface.deleteplace(pid);
        if(num>0){
        mv.addObject("msg","删除成功");
            mv.setViewName("");
        return  mv;}
        mv.addObject("msg","删除失败");
        mv.setViewName("");
        return  mv;

    }
    @RequestMapping("updateplared")
    public ModelAndView updateplared(String Title ,String Content , int pid, ModelAndView mv){


        int result=placardinterface.updateplared(Title,Content,pid);
        if(result>0){
            mv.addObject("msg","修改成功");
            mv.setViewName("");
            return  mv;}
        mv.addObject("msg","修改失败");
        mv.setViewName("");
        return  mv;

    }
    @RequestMapping("getpalacemessageByid")
    public ModelAndView getpalacemessageByid( int pid, ModelAndView mv){
        List list=placardinterface.getmessagebypid(pid);
       mv.addObject("listAll",list);
        mv.setViewName("");
        return  mv;

    }

    @RequestMapping("add")
    public ModelAndView exit(HttpSession session, ModelAndView mv,String title,String content){
       String name=session.getAttribute("username")+"";
        if(customarinterface.getpower(name)==1){
            mv.addObject("msg","没有发布权限");
            mv.setViewName("");
            return mv;
        }else {
            placard placard = new placard();
            placard.setTitle(title);
            placard.setContent(content);
            placard.setAuthor(name);
            placard.setPissuedate(new Date());
            int result = placardinterface.addpalace(placard);
            if (result != 0) {
                mv.addObject("msg", "发布成功");
                mv.setViewName("");
                return mv;
            } else {
                mv.addObject("msg", "发布失败");
                mv.setViewName("");
                return mv;
            }
        }

        }
}
