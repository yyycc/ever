package com.example.demo;

import com.example.demo.mapper.EverMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 修改启动类，继承 SpringBootServletInitializer 并重写 configure 方法
 */
@SpringBootApplication
@MapperScan(basePackages = "com.example.demo.mapper", markerInterface = EverMapper.class)
/*, markerInterface = EverMapper.class*/
public class EverApplication {
	public static void main(String[] args) {
		SpringApplication.run(EverApplication.class, args);
	}
}
