package com.cg.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.dto.QueryMaster;
import com.cg.service.IQueryService;
import com.cg.service.QueryServiceImpl;

@Controller
public class QueryController 
{
	@Autowired
	IQueryService queryservice;
	
	@RequestMapping(value="query",method=RequestMethod.GET)
	public ModelAndView getAllDetail() {
		List<QueryMaster> studentData=queryservice.getAllDetail();
		return new ModelAndView("querySolution", "data", studentData);
	}

	@RequestMapping(value="Update",method=RequestMethod.GET)
	public ModelAndView dataDisplay(@RequestParam("query") String name) {
		
		return new ModelAndView("Success", "name", name);
	}
}
