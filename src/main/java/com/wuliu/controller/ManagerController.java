package com.wuliu.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wuliu.serviceinterface.carmessageinterface;
import com.wuliu.serviceinterface.enterpriseinterface;
import com.wuliu.serviceinterface.goodsmeginterface;
import com.wuliu.serviceinterface.placardinterface;

@Controller
@RequestMapping("m")
public class ManagerController {
	@Autowired
	private goodsmeginterface goodsmeginterface;
	@Autowired
	private carmessageinterface carmessageinterface;
	@Autowired
	private enterpriseinterface enterpriseinterface;
	@Autowired
	private placardinterface placardinterface;
	private final int PageSize = 10;

	@RequestMapping("index")
	public ModelAndView getIndex(HttpSession session, ModelAndView mv) {
		if (session.getAttribute("username") == null) {
			mv.addObject("msg", "你还未登录");
			mv.setViewName("manager/error");
			return mv;
		}
		if (!session.getAttribute("username").toString().equals("joe")) {
			mv.addObject("msg", "你不具有管理员权限");
			mv.setViewName("manager/error");
			return mv;
		}
		List<HashMap<String, Object>> listAllGoods = goodsmeginterface.getgoodmessage(0, 0);
		// System.out.println(listAllGoods);
		List<HashMap<String, Object>> listAllCars = carmessageinterface.getcarmessage(0, PageSize);
		// System.out.println(listAllCars);
		List listAllE = enterpriseinterface.getentermessage(0, PageSize);
		// System.out.println(listAllE);
		List listAllpla = placardinterface.getplacedmessage(0, PageSize);
		// System.out.println(listAllpla);
		mv.addObject("goodsList", listAllGoods);
		mv.addObject("carsList", listAllCars);
		mv.addObject("eList", listAllE);
		mv.addObject("plaList", listAllpla);
		mv.setViewName("manager/index");
		return mv;
	}
}
