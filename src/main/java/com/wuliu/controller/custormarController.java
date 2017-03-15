package com.wuliu.controller;

import com.wuliu.serviceinterface.customarinterface;
import com.wuliu.util.javamailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Date;

/**
 * Created by 木木高 on 2017/3/8.
 */
@Controller
@RequestMapping("/Custormar")
public class custormarController {

	@Autowired
	private customarinterface customarinterface;

	@RequestMapping("add")
	public ModelAndView insert(@RequestParam(required = true) String name,
			@RequestParam(required = true) String password, @RequestParam(required = true) String email,
			@RequestParam(required = true) int sex, @RequestParam(required = true) String phone,
			@RequestParam(required = true) String question, @RequestParam(required = true) String result,
			ModelAndView mv, HttpSession session) {
		if (customarinterface.getUsername(name) != 0) {
			mv.addObject("msg", "该用户已经注册");
			mv.setViewName("user/user_register");
			return mv;
		}
		// Customar customar = new Customar();
		// customar.setCname(name);
		// customar.setPassword(password);
		// customar.setEmail(email);
		// customar.setSex(sex);
		// customar.setPhone(phone);
		// customar.setQuestion(question);
		// customar.setRuselt(result);
		// customar.setCissuedate(new Date());
		customarinterface.insert(name, password, email, sex, phone, question, result, new Date());
		session.setAttribute("username", name);


		mv.setViewName("redirect:/user/register_success.jsp");
		return mv;
	}

	@RequestMapping("getPassWordMessage")
	public ModelAndView getPassWordMessage(String Cname, String Question, String Ruselt, ModelAndView mv) {
		Integer result = customarinterface.changepassword(Cname, Question, Ruselt);
		Integer cid = customarinterface.getcidbypassword(Cname, Question, Ruselt);
		if (result != 0) {
			mv.addObject("msg", "验证信息正确");
			mv.addObject("Cid", cid);
			mv.setViewName("user/user_update_pwd");
			return mv;
		} else {
			mv.addObject("msg", "验证信息错误");
			mv.setViewName("user/user_find_pwd");
			return mv;
		}

	}

	@RequestMapping("changePasswordByQuestion")
	public ModelAndView updatepassword(String Password, int cid, ModelAndView mv) {
		System.out.println(Password+":"+cid);
		int result = customarinterface.updatepassword(Password, cid);
		if (result != 0) {
			// System.out.println(1111);
			mv.addObject("msg", "密码修改成功");
			mv.setViewName("user/update_success");
			return mv;
		} else {
			// System.out.println(22222);
			mv.addObject("msg", "验证信息有误");
			mv.setViewName("common/error");
			return mv;
		}

	}

	@RequestMapping("changePasswordByemail")
	public ModelAndView updatepassword(String email, ModelAndView mv, HttpServletRequest request) {
		javamailUtil jm = new javamailUtil();
		// int cid=customarinterface.getcid(email);
		if (customarinterface.getcid(email) == null) {
			mv.addObject("msg", "该邮箱还未注册");
			mv.setViewName("user/find_by_email");
			System.out.println("a");
			return mv;
		} else {
			try {
				jm.sendmail(customarinterface.getcid(email), email, "http://" + request.getServerName() + ":"
						+ request.getServerPort() + request.getContextPath());
				mv.addObject("msg", "邮件已发送，请注意查收...");
				mv.setViewName("user/send_success");
				return mv;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;

	}

	@RequestMapping("exit")
	public ModelAndView exit(HttpSession session, ModelAndView mv) {
		session.invalidate();
		mv.addObject("msg", "退出成功");
		mv.setViewName("redirect:/");
		return mv;
	}

	@RequestMapping("login")
	public ModelAndView login(String username, String password, HttpSession session, ModelAndView mv ,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		if (customarinterface.getUsername(username) == 0) {
			mv.addObject("msg", "该用户没有注册");
			mv.setViewName("redirect:/");
			return mv;
		} else {
			if (customarinterface.getUsermessage(username, password) != 0) {
				mv.addObject("msg", "登陆成功");
				session.setAttribute("username", username);
				mv.setViewName("redirect:/");
			
				return mv;
			} else {
				mv.addObject("msg", "用户名或密码错误");
				
				mv.setViewName("redirect:/");
				return mv;
			}
		}

	}

}
