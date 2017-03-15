package com.wuliu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wuliu.serviceinterface.carmessageinterface;
import com.wuliu.serviceinterface.enterpriseinterface;
import com.wuliu.serviceinterface.goodsmeginterface;
import com.wuliu.serviceinterface.placardinterface;

@Controller
public class PageController {
	@Autowired
	private goodsmeginterface goodsmeginterface;
	@Autowired
	private carmessageinterface carmessageinterface;
	@Autowired
	private enterpriseinterface enterpriseinterface;
	@Autowired
	private placardinterface placardinterface;
	private final int PageSize = 10;

	@RequestMapping("/")
	public ModelAndView index(ModelAndView mv) {
		List<HashMap<String, Object>> listAllGoods = goodsmeginterface.getgoodmessage(0, PageSize);
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
		mv.setViewName("index");

		return mv;

	}

}
