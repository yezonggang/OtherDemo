package com.yzg.demo.controller;

import com.yzg.demo.annotation.PassToken;
import com.yzg.demo.annotation.UserLoginToken;
import com.yzg.demo.model.user.User;
import com.yzg.demo.service.TokenService;
import com.yzg.demo.service.UserServiceImpl;
import com.yzg.demo.utils.TokenUtils;
import io.swagger.annotations.ApiOperation;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController
public class UserController {
	@Autowired
	UserServiceImpl userService;
	@Autowired
	TokenService tokenService;

	// 登录
	@ApiOperation(value = "xxxx", notes = "tttt")
	@PostMapping("/login")
	public String login(HttpServletResponse response,
						@RequestBody User inputUser) throws JSONException {
		User userForBase = new User();
		inputUser.getUsername();
		userForBase.setId(userService.findByUsername(inputUser).getId());
		userForBase.setUsername(userService.findByUsername(inputUser).getUsername());
		userForBase.setPasswd(userService.findByUsername(inputUser).getPasswd());
		if (!userForBase.getPasswd().equals(inputUser.getPasswd())) {
			String info="登录失败,密码错误";
			return info;
		} else {
			String token = tokenService.getToken(userForBase);
			String info=token;
			Cookie cookie = new Cookie("token", token);
			cookie.setPath("/");
			response.addCookie(cookie);
			return info;
		}
	}

	@UserLoginToken
	@ApiOperation(value = "获取信息", notes = "获取信息")
	@GetMapping("/checkNow")
	public String getMessage() {
		// 取出token中带的用户id 进行操作
		System.out.println(TokenUtils.getTokenUserId());

		return "您已通过验证";
	}
}

