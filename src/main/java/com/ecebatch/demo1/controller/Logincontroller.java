package com.ecebatch.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Logincontroller {
@GetMapping("/")
public String homepage() {
    return "home.html";
}

}
