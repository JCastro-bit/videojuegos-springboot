package com.javier.videojuegos.repository;

import com.javier.videojuegos.domain.Videojuego;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer> {
    
    
    @Query("from Videojuego v order by v.nombre")
    List<Videojuego>buscarTodos();
    
    // Cuando omitimos el "Select" es porque traemos el objeto completo
    @Query("from Videojuego v where v.distribuidor.id = ?1 order by v.nombre")
    List<Videojuego>buscarPorDistribuidor(int distribuidorId);
}
