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
        return videojuegoRepository.buscarTodos(); // Este Find All va a la base  de datos y hace un SELECT * FROM
    }
    
    public List<Videojuego> buscarPorDistribuidor (int distribuirdorId) {
        return videojuegoRepository.buscarPorDistribuidor(distribuirdorId);
    }
    
    public List<Videojuego> buscar(String consulta){
        return videojuegoRepository.findByNombreContaining(consulta);
    }
            
}
