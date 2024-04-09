package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.UserService;
import com.javaex.util.JsonResult;
import com.javaex.vo.UserVo;

@RestController
@RequestMapping("attention/kiosk")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("savepoint")
	public JsonResult point(@RequestBody UserVo userVo) {
		System.out.println("UserController.point()");
		UserVo uVo =  userService.exeSave(userVo);
		//System.out.println(uVo);
		System.out.println(uVo);
		return JsonResult.success(uVo);
	}

}
