package com.sist.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sist.vo.*;
import com.sist.dao.*;

@Controller
public class ClassController {
	@Autowired
	private ClassDAO dao;
	
	
}