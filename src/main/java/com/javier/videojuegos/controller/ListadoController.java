package com.javier.videojuegos.controller;

import com.javier.videojuegos.domain.Videojuego;
import com.javier.videojuegos.service.VideojuegoService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListadoController {

    private final VideojuegoService videojuegoService;

    public ListadoController(VideojuegoService videojuegoService) {
        this.videojuegoService = videojuegoService;
    }

    @RequestMapping("/")
    public String listarVideojuegos(Model model) {

        // Invocamos nuestro Servicio
        List<Videojuego> destacados = videojuegoService.buscarDestacados();

        // Busqueda de los videojuegos
        model.addAttribute("videojuegos", destacados);

        return "listado";
    }

    @RequestMapping("/videojuegoPorDistribuidor")
    public String listarVideojuegosPorDistribuidor(int distribuidorId, Model model) {
        List<Videojuego> juegos = videojuegoService.buscarPorDistribuidor(distribuidorId);
        model.addAttribute("videojuegos", juegos);
        return "listado";
    }

}
