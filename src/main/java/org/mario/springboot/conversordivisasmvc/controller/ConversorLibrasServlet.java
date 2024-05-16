package org.mario.springboot.conversordivisasmvc.controller;

import org.mario.springboot.conversordivisasmvc.service.ConversorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorLibrasServlet {

    @Autowired
    private ConversorService conversorService;

    @GetMapping("/convertirLibras")
    @ResponseBody
    public double convertirLibras(@RequestParam double euros) {
        return conversorService.convertir(euros, "LIBRAS");
    }
}
