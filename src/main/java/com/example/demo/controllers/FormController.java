package com.example.demo.controllers;

import com.example.demo.models.domain.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class FormController {

    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("titulo", "Formulario usuarios");
        return "form";
    }

    @PostMapping("/form")
    public String processForm(@Valid Usuario usuario, Model model){
        model.addAttribute("titulo", "Formulario usuarios");
        model.addAttribute("usuario",usuario);
        return "response";
    }
}
