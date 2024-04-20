package com.example.demo1;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/juego")
public class Controlador {
    private final Juego juego;

    public Controlador(Juego juego) {
        this.juego = juego;
    }

    @PostMapping("/inicializar")
    public void inicializar(@RequestParam String posicionesIniciales) {
        juego.inicializar(posicionesIniciales);
    }

    @PostMapping("/ejecutar")
    public void ejecutar(@RequestParam int fotos) {
        juego.ejecutar(fotos);
    }

    @GetMapping("/fotografias")
    public ModelAndView fotografias() {
        ModelAndView modelAndView = new ModelAndView("fotografias");
        modelAndView.addObject("lago", juego.getLago());  // pasa los datos del juego a la vista
        return modelAndView;
    }

}