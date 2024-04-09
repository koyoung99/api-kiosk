package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.AttentionManagerService;
import com.javaex.util.JsonResult;
import com.javaex.vo.AttentionCartVo;

@RestController
public class AttentionManagerController {
	
	@Autowired 
	private AttentionManagerService attentionManagerService;
	
	
	@GetMapping(value="/attention/manager/chart/main")
	public JsonResult list(@RequestParam(value="selectedDate")String order_date) {
		System.out.println("AttentionManagerController.list()");
		
		List<AttentionCartVo> cartList=attentionManagerService.exeList(order_date);
		
		System.out.println(order_date);
		System.out.println(cartList);
		return JsonResult.success(cartList);
	}
	
	    
	@PostMapping(value="/attention/manager/chart/coffee")
	public JsonResult coffeeList(@RequestBody AttentionCartVo attentionCartVos) {
		System.out.println("AttentionManagerController.coffeeList()");
		List<AttentionCartVo> cartList=attentionManagerService.exeCoffeeList(attentionCartVos);
		
		return JsonResult.success(cartList);
	}
	
	
	
}
