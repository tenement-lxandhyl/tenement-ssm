package com.lx.controller;
import com.lx.pojo.Admin;
import com.lx.service.AdminService;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("")
public class AdminController {
    @Autowired
    AdminService adminService;
    @RequestMapping(value = "loginAdmin",method = RequestMethod.GET)
    public Object listOne(Admin admin){
        List<Admin> adminOne = adminService.listone(admin);
        return adminOne;
    }
    @RequestMapping(value = "updateAdmin",method = RequestMethod.GET)
    public Object update(Admin admin){
        int s=adminService.update(admin);
        return s;
    }
    @RequestMapping(value = "registeredAdmin",method = RequestMethod.POST)
    public Object add(Admin admin){
        int s =adminService.add(admin);
        return s;
    }
}
