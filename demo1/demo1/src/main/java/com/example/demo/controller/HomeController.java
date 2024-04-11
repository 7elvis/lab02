package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.ArrayList;

@Controller
public class HomeController {
    @RequestMapping(value = {"/holaMundo"}, method = RequestMethod.GET)
    public String holaMundo (){
        return "hola";
    }

    @GetMapping("/patito_hule")
    public String formularioPatito(Model model){
        Patito patito3 = new Patito();
        model.addAttribute("patito", patito3);
        return "formulario1";
    }
    @GetMapping("/patito_hule/ejecutar")
    public String ejecutarPatito(@RequestParam("filas") int filasPatito,
                                  @RequestParam("columnas") int columnasPatito,
                                    @RequestParam("posicion") String posicionPatito){
        String string = posicionPatito;
        String[] parts = string.split(" ");
        return "tablero";
    }
    // @GetMapping("/persona2")
    //public String formularioPersona (Model model){
    //    Persona persona3 = new Persona();
    //    model.addAttribute("persona", persona3);
    //    return "formulario";
    }





