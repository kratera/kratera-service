package com.kratera.webservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kratera.webservice.util.JsonTransformer;

import spark.Spark;

@Controller
public class Home {
		
	@Autowired
	public Home(JsonTransformer jsonTransformer){
		Spark.get("/", "application/json;charset=utf-8", (req, res) -> {
			Map<String, String> msg = new HashMap<String, String>(){
				private static final long serialVersionUID = 1L;{
				put("msg", "Olá Mundo!");
			}};
			return msg;
		}, jsonTransformer);
	}
}
