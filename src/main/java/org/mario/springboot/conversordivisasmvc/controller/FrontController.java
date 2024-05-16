package org.mario.springboot.conversordivisasmvc.controller;

import org.mario.springboot.conversordivisasmvc.service.ConversorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FrontController {

    @Autowired
    private ConversorService conversorService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/convertir")
    public String convertir(@RequestParam String cantidad, @RequestParam String divisa, Model model) {
        double euros = Double.parseDouble(cantidad);
        double resultado = conversorService.convertir(euros, divisa);
        model.addAttribute("resultado", "Resultado: " + resultado);
        return "index";
    }
}
