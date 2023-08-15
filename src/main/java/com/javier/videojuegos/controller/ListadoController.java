package com.javier.videojuegos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListadoController {
    
    @RequestMapping("/")
    public String listarVideojuegos (){
        // Busqueda de los videojuegos
        return"listado";
    }
    
    
}
 