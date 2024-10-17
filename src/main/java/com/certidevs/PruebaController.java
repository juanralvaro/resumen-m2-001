package com.certidevs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PruebaController {

    @GetMapping("prueba")
    public String prueba(Model model) {

        String mensajePrueba = "Esto es un mensaje de prueba";

        model.addAttribute("mensajePrueba", mensajePrueba);
        model.addAttribute("equipos", "Madrid, Barça, etc...");


        return "prueba";
    }
}
