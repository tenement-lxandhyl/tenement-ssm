package com.lx.controller;
import com.lx.service.HouseImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HouseImagesController {
    @Autowired
    HouseImagesService houseImagesService;
}
