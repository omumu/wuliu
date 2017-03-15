package com.wuliu.controller;

import com.wuliu.pojo.goodsmeg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.wuliu.serviceinterface.*;
import com.wuliu.util.PageCode;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by 木木高 on 2017/3/9.
 */
@RequestMapping("/good")
@Controller
public class goodMessageController {
	private final int PageSize = 10;
	@Autowired
	private goodsmeginterface goodsmeginterface;

	@RequestMapping("goodMessage")
	public ModelAndView getGoodMessage(@RequestParam(required = false) int page, ModelAndView mv) {
		if (page + "" == null || page < 0) {
			page = 1;
		}
		List<HashMap<String, Object>> listAll = goodsmeginterface.getgoodmessage((page - 1) * PageSize, PageSize);
		int listNumber = goodsmeginterface.gettotalnumber();
		mv.addObject("goodMessage", listAll);
		System.out.println(listAll);
		mv.addObject("listNumber", listNumber);
		mv.setViewName("transport/info");
		return mv;
	}

	@RequestMapping("goodMessageinfo")
	public ModelAndView goodMessageinfo(@RequestParam(required = false) int page, ModelAndView mv) {
		if (page + "" == null || page < 0) {
			page = 1;
		}
		List listAll = goodsmeginterface.getgoodinfo((page - 1) * PageSize, PageSize);
		int listNumber = goodsmeginterface.gettotalnumber();
		mv.addObject("goodMessage", listAll);
		mv.addObject("listNumber", listNumber);
		mv.setViewName("");
		return mv;
	}

	// 信息详情页
	@RequestMapping("getallgoodmessage")
	public ModelAndView getallgoodmessage(@RequestParam(required = false) int page, ModelAndView mv) {
		if (page + "" == null || page < 0) {
			page = 1;
		}
		List listAll = goodsmeginterface.getallgoodmessage((page - 1) * PageSize, PageSize);
		int listNumber = goodsmeginterface.gettotalnumber();
		mv.addObject("goodMessage", listAll);
		mv.addObject("listNumber", listNumber);
		// System.out.println(listAll);
		String pageCode = PageCode.getPageCode("good/getallgoodmessage", listNumber, PageSize, page);
		mv.addObject("pageCode", pageCode);
		mv.setViewName("transport/info");
		return mv;
	}

	// 获取 goods详情
	@RequestMapping("getDetail")
	public ModelAndView getDetail(int id, ModelAndView mv) {
		HashMap<String, Object> map = goodsmeginterface.getdetail(id);
		mv.addObject("goods", map);
		mv.setViewName("transport/goods_info");
		return mv;
	}

	@RequestMapping("update")
	public ModelAndView updateByPrimaryKey(goodsmeg goodsmeg, ModelAndView mv) {
		System.out.println(goodsmeg);
		int result = goodsmeginterface.updateByPrimaryKey(goodsmeg);
		if (result != 0) {
			mv.addObject("msg", "修改成功");
			mv.setViewName("redirect:/m/index");
			return mv;
		}
		mv.setViewName("/common/error");
		return mv;
	}
	
	
	@RequestMapping("add")
	public ModelAndView add(goodsmeg goodsmeg, ModelAndView mv) {

		System.out.println(goodsmeg);
		int result = goodsmeginterface.insert(goodsmeg);
		if (result != 0) {
			mv.addObject("msg", "修改成功");
			mv.setViewName("redirect:/m/index");
			return mv;
		}
		mv.setViewName("/common/error");
		return mv;
	}
}
