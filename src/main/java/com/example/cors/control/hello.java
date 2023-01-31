package com.example.cors.control;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Demo class
 *
 * @author nol
 * @date 2023/1/31
 */

public class hello {
    @RequestMapping("/index")
    public String hello(){
        return "hello";
    }
}
