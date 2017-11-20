package com.plagiarism.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.plagiarism.sessionbean.UserDetailsSessionBean;

@Controller
public class PlagiarismController {
	
	@Autowired
	private UserDetailsSessionBean userBean;
	
	
	@RequestMapping(value = "/welcome", method = RequestMethod.POST, produces = "application/json" )
	@ResponseBody
	public String welcome(@RequestBody int pass) {
		Gson g = new Gson();
		
		return g.toJson("Hello");
	}
	
}
