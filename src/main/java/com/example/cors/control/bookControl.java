package com.example.cors.control;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Demo class
 *
 * @author nol
 * @date 2023/1/30
 */
@RestController
@RequestMapping("/book")
public class bookControl {
    @GetMapping("/list")
    public String getBook() {
        return "这是三国演义的世界";
    }

    @PostMapping("/")
    public String addBook(String name) {
        return "receive:" + name;
    }

    @DeleteMapping("/{id}")
    public String deleteBookById(@PathVariable Long id) {
        return String.valueOf(id);
    }
}
