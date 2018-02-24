package com.wxm;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@MapperScan("com.wxm.dao") 
public class Application /*extends SpringBootServletInitializer*/{
	
		public static void main(String[] args)throws Exception {
			SpringApplication.run(Application.class, args);
		}
		
}
