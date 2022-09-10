package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Maincontroller {
@RequestMapping("/text")
public String  HTML()
{
	return"text";
}
}
