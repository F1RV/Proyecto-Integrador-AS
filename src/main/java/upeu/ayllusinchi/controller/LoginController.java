/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.ayllusinchi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * 
 */

@Controller
public class LoginController {
    
    @GetMapping("/login")
    public String indexAsistencia(Model model) {
        model.addAttribute("titulo", "Bienvenido a Thymeleaf");
        return "login";
    }
    
}
