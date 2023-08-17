package com.javier.videojuegos.repository;

import com.javier.videojuegos.domain.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;



public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer> {
    
    
    
}
