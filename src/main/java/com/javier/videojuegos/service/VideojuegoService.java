package com.javier.videojuegos.service;

import com.javier.videojuegos.domain.Videojuego;
import com.javier.videojuegos.repository.VideojuegoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class VideojuegoService {
    
    private final VideojuegoRepository videojuegoRepository;

    public VideojuegoService(VideojuegoRepository videojuegoRepository) {
        this.videojuegoRepository = videojuegoRepository;
    }
        

    // Tenemos la firma de nuestro metodo BuscarDestacados que devulve una lista de juegos
    public List<Videojuego> buscarDestacados() {
        return videojuegoRepository.findAll(); // Este Find All va a la base  de datos y hace un SELECT * FROM
    }
}
