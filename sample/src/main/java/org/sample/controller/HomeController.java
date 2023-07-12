package org.sample.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
		@RequestMapping("/")
		public String home(HttpServletRequest request) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초");
		String now = sdf.format(new Date());

		request.setAttribute("now", now);
		return "home";
		}
}
