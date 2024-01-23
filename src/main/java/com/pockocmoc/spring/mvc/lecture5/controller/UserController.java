package com.pockocmoc.spring.mvc.lecture5.controller;


import com.pockocmoc.spring.mvc.lecture5.model.User;
import com.pockocmoc.spring.mvc.lecture5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {


    @Autowired
    private UserService userService;


    @GetMapping
    public String listUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable Long id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "userProfile";
    }

    @PostMapping
    public String addUser(@RequestParam String name, @RequestParam String email) {
        User user = new User(name, email);
        userService.addUser(user);
        return "redirect:/users";
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable Long id) {
        userService.deleteById(id);
        return "redirect:/users";
    }
}
