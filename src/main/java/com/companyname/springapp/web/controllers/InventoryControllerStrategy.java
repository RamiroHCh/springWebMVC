package com.companyname.springapp.web.controllers;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.companyname.springapp.business.entities.enums.ProductType;
import com.companyname.springapp.business.service.ProductManagerService;


@Controller
public class InventoryControllerStrategy {

    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    ProductManagerService productManagerService;
    
    @RequestMapping(value="/hello-strategy.htm")
    public ModelAndView handleRequest() {
        String now = (new Date()).toString();
        logger.info("Returning hello view with " + now);

        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("now", now);
        myModel.put("products", this.productManagerService.changeType(ProductType.JPSTYPE));
        
        return new ModelAndView("hello-strategy", "model", myModel);
    }
    
}
