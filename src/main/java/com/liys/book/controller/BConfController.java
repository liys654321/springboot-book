package com.liys.book.controller;

import com.liys.book.service.BConfService;
import com.liys.book.utils.ResponseBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @description:
 * @author: liys
 * @date: 2019/9/3 18:30
 * @version:1.0v
 */
@RestController
@RequestMapping("/sch")
public class BConfController {
    @Autowired
    private BConfService bConfService;

    @RequestMapping("/findById")
    public ResponseBase findById(HttpServletRequest request,Integer id) {
        return bConfService.findById(id);
    }

}
