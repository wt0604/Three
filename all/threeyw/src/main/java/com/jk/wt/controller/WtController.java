package com.jk.wt.controller;

import com.jk.wt.service.WtService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class WtController {
    @Resource
    private WtService service;
}
