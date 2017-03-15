package com.wuliu.controller;

import com.wuliu.serviceinterface.carmessageinterface;
import com.wuliu.util.PageCode;

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
@RequestMapping("/car")
public class carMessageController {
	private final int PageSize = 10;
	@Autowired
	private carmessageinterface carmessageinterface;

	@RequestMapping("getAllCarList")
	public ModelAndView getAllCarList(@RequestParam(required = false) int page, ModelAndView mv) {
		if (page + "" == null || page < 0) {
			page = 1;
		}
		List listAll = carmessageinterface.getcarmessage((page - 1) * PageSize, 10);
//		System.out.println(listAll);
		int num = carmessageinterface.getnumber();
		mv.addObject("carMessage", listAll);
		mv.addObject("carNumber", num);
		String pageCode = PageCode.getPageCode("car/getAllCarList", num, 10, page);
		mv.addObject("pageCode", pageCode);
		mv.setViewName("car/info");
		return mv;

	}
	@RequestMapping("getCarList")
	public ModelAndView getCarList(ModelAndView mv) {

		mv.addObject("pageCode", null);
		mv.setViewName("good/info");
		return mv;

	}
}
