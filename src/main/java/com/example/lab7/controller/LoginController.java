package com.example.lab7.controller;

import org.springframework.ui.Model;
import com.example.lab7.entity.User;
import com.example.lab7.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;
import java.util.Optional;

@Controller
public class LoginController {
    final UserRepository userRepository;

    public LoginController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @GetMapping("/openLoginWindow")
    public String loginWindow(){

        return "loginWindow";
    }
    @GetMapping("/submitWindow")
    public String submitWindow(){
        return "submitWindow";
    }
    @PostMapping("/submitLoginForm")
    public String submitLoginForm(@RequestParam String email,@RequestParam String password, Model model){

        Optional<User> userOptional = userRepository.findByEmail(email);
        if(userOptional.isPresent()) {
            User user = userOptional.get();
            model.addAttribute("user", user);
            if (Objects.equals(user.getPassword(), password)){
            return "redirect:/admin/peliculas";}
            else{
                return "redirect:/submitWindow";
            }
        }else{
            return "redirect:/submitWindow";
        }

    }


}
