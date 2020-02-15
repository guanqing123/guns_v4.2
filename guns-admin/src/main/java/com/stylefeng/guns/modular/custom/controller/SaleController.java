package com.stylefeng.guns.modular.custom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stylefeng.guns.core.base.controller.BaseController;

@Controller
@RequestMapping("/sale")
public class SaleController extends BaseController{

	private static String PREFIX = "/custom/sale/";
	
    /**
     * 跳转到黑板
     */
    @RequestMapping("/sorder")
    public String table() {
    	return PREFIX + "sorder.html";
    }
}
