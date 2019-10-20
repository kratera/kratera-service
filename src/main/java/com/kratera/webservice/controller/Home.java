package com.kratera.webservice.controller;

import org.springframework.stereotype.Controller;

import spark.Spark;

@Controller
public class Home {
	public Home(){
		Spark.get("/", (req, res) -> {
			return "{\"msg\":\"Olá mundo!\"}";
		});
	}
}
