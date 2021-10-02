package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/")
class MainController {

    @GetMapping("/main")
    fun main():String {
        return "enter"
    }

    @GetMapping("/sign_in")
    fun signIn(
        @RequestParam("email") email:String,
        @RequestParam("password") password:String
    ):String {
        println(email)
        println(password)
        return "appMain"
    }
}