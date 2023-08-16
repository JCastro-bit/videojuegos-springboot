package com.javier.videojuegos.service;

import com.javier.videojuegos.domain.Videojuego;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class VideojuegoService {

    // Tenemos la firma de nuestro metodo BuscarDestacados que devulve una lista de juegos
    public List<Videojuego> buscarDestacados() {
        List<Videojuego> destacados = new ArrayList<>();

        Videojuego juego = new Videojuego();
        juego.setNombre("Zelda Tears of the Kingdom");
        juego.setDescripcion("Tears of the Kingdom conserva la jugabilidad de acción y aventura de mundo abierto del juego anterior de Zelda, Breath of the Wild (2017). Como Link, los jugadores exploran Hyrule y dos nuevas áreas, Islas celestes y las profundidades, para encontrar armas, recursos y completar misiones.");
        juego.setImagenUrl("https://images.unsplash.com/photo-1635514569146-9a9607ecf303?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1170&q=80");
        destacados.add(juego);

        juego = new Videojuego();
        juego.setNombre("The Witcher 3");
        juego.setDescripcion(" Wild Hunt es un juego de rol de acción con una perspectiva en tercera persona. Los jugadores controlan a Geralt de Rivia, un cazador de monstruos");
        juego.setImagenUrl("https://images.unsplash.com/photo-1622643048696-883eafe4d8dc?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=627&q=80");
        destacados.add(juego);

        juego = new Videojuego();
        juego.setNombre("Rise of Tomb Rider");
        juego.setDescripcion("En Rise of the Tomb Raider, Lara será mucho más que una superviviente en su primera expedición como saqueadora de tumbas. Incluye: • El viaje de Lara - Lara descubre un misterio ancestral que la coloca en el punto de mira de una despiadada organización conocida como la Trinidad.");
        juego.setImagenUrl("https://plus.unsplash.com/premium_photo-1671267099630-5fffc3ffd883?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=688&q=80");
        destacados.add(juego);

        juego = new Videojuego();
        juego.setNombre("Final Fantasy XV");
        juego.setDescripcion("Final Fantasy XV is an open world, action role-playing game in which players assume control of Noctis Lucis Caelum, a prince who can perform a variety of actions related to both field exploration and combat.");
        juego.setImagenUrl("https://images.unsplash.com/photo-1616617774879-179911b66e75?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1735&q=80");
        destacados.add(juego);

        juego = new Videojuego();
        juego.setNombre("Red Dead Redemption 2");
        juego.setDescripcion("Red Dead Redemption 2 es un juego de mundo abierto ambientado en el corazón de América en 1899. La era del viejo oeste está llegando a su fin. Los jugadores toman el control de Arthur Morgan, un forajido que forma parte de la pandilla de Van der Linde.");
        juego.setImagenUrl("https://cdn.dribbble.com/userupload/8690245/file/original-ee33ce800fdfee4f09c04b01aa3a54b7.jpeg?resize=400x300&vertical=center");
        destacados.add(juego);

        juego = new Videojuego();
        juego.setNombre("Assassin's Creed Odyssey");
        juego.setDescripcion("Ubicado en la antigua Grecia, Assassin's Creed Odyssey da a los jugadores la elección entre jugar como Alexios o Kassandra en una epopeya que abarca desde espartanos hasta dioses olímpicos. Es una travesía llena de decisiones y exploración en un mundo que está al borde de desgarrarse por la guerra.");
        juego.setImagenUrl("https://images.unsplash.com/photo-1632643048796-883eafe5d8dc?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1688&q=80");
        destacados.add(juego);

        juego = new Videojuego();
        juego.setNombre("God of War");
        juego.setDescripcion("Situado en el mundo de la mitología nórdica, God of War sigue a Kratos y a su hijo Atreus en un viaje a través de un paisaje inhóspito, enfrentándose a dioses y monstruos mientras buscan cumplir la última voluntad de la madre de Atreus.");
        juego.setImagenUrl("https://images.unsplash.com/photo-1642645058896-8b3g05089327?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1725&q=80");
        destacados.add(juego);

        return destacados;
    }
}
