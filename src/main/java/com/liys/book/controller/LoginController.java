package com.liys.book.controller;

import com.liys.book.utils.ResponseBase;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @description:
 * @author: liys
 * @date: 2019/9/3 17:04
 * @version:1.0v
 */
@RestController
@RequestMapping("/user")
public class LoginController {


    /**
     * 用户登录
     * @param request
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ResponseBase login(HttpServletRequest request,@RequestParam String username,@RequestParam String password) {
        return ResponseBase.setResultSuccess();
    }


}
