package com.example.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FotografiasController {
    private final Juego juego;

    public FotografiasController(Juego juego) {
        this.juego = juego;
    }

    @GetMapping("/fotografias")
    public ModelAndView fotografias() {
        ModelAndView modelAndView = new ModelAndView("fotografias");
     
        return modelAndView;
    }
}