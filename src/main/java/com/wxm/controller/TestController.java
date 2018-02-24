package com.wxm.controller;
import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wxm.dao.ITableaDao;
import com.wxm.domain.Tablea;
import com.wxm.service.ITestService;





//mapper 接口类扫描包配置
@RestController
public class TestController{
	@Resource 
	private ITestService testService;
	
	
	
		@RequestMapping("/vv")
		String home(){
			return "hello world";
		}
		
		@RequestMapping("/test")
		Tablea ttt(){
			return testService.selectByPrimaryKey(1l);
		}

}
