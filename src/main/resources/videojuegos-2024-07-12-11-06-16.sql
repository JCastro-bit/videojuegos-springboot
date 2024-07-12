


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
SET NAMES utf8mb4;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table distribuidor
# ------------------------------------------------------------

DROP TABLE IF EXISTS `distribuidor`;

CREATE TABLE `distribuidor` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(200) NOT NULL,
  `sitio_web` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES `distribuidor` WRITE;
/*!40000 ALTER TABLE `distribuidor` DISABLE KEYS */;

INSERT INTO `distribuidor` (`id`, `nombre`, `sitio_web`) VALUES
	(1, 'Nintendo', 'https://www.nintendo.com/'),
	(2, 'CD Projekt', 'https://www.cdprojekt.com/'),
	(3, 'Crystal Dynamics', 'https://www.crystald.com/'),
	(4, 'Square Enix', 'https://www.square-enix.com/'),
	(5, 'Rockstar Games', 'https://www.rockstargames.com/'),
	(6, 'Ubisoft', 'https://www.ubisoft.com/'),
	(7, 'Santa Monica Studio', 'https://sms.playstation.com/'),
	(8, '343 Industries', 'https://www.343industries.com/'),
	(9, 'CD Projekt Red', 'https://www.cdprojektred.com/'),
	(10, 'Sucker Punch Productions', 'https://www.suckerpunch.com/');

/*!40000 ALTER TABLE `distribuidor` ENABLE KEYS */;
UNLOCK TABLES;



# Dump of table videojuego
# ------------------------------------------------------------

DROP TABLE IF EXISTS `videojuego`;

CREATE TABLE `videojuego` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(200) NOT NULL,
  `descripcion` varchar(3000) DEFAULT NULL,
  `imagen_url` varchar(500) DEFAULT NULL,
  `distribuidor_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `distribuidor_id` (`distribuidor_id`),
  CONSTRAINT `videojuego_ibfk_1` FOREIGN KEY (`distribuidor_id`) REFERENCES `distribuidor` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES `videojuego` WRITE;
/*!40000 ALTER TABLE `videojuego` DISABLE KEYS */;

INSERT INTO `videojuego` (`id`, `nombre`, `descripcion`, `imagen_url`, `distribuidor_id`) VALUES
	(1, 'Zelda Tears of the Kingdom', 'Tears of the Kingdom conserva la jugabilidad de acción y aventura de mundo abierto del juego anterior de Zelda, Breath of the Wild (2017). Como Link, los jugadores exploran Hyrule y dos nuevas áreas, Islas celestes y las profundidades.', 'https://images.unsplash.com/photo-1635514569146-9a9607ecf303?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA', 1),
	(2, 'The Witcher 3', 'Wild Hunt es un juego de rol de acción con una perspectiva en tercera persona. Los jugadores controlan a Geralt de Rivia, un cazador de monstruos', 'https://images.unsplash.com/photo-1622643048696-883eafe4d8dc?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA', 2),
	(3, 'Rise of Tomb Rider', 'En Rise of the Tomb Raider, Lara será mucho más que una superviviente en su primera expedición como saqueadora de tumbas. Incluye: • El viaje de Lara - Lara descubre un misterio ancestral que la coloca contra  la Trinidad.', 'https://plus.unsplash.com/premium_photo-1671267099630-5fffc3ffd883?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA', 3),
	(4, 'Final Fantasy XV', 'Final Fantasy XV es un juego de rol y acción de mundo abierto en el que los jugadores asumen el control de Noctis Lucis Caelum, un príncipe que puede realizar diversas acciones relacionadas tanto con la exploración del terreno.', 'https://cdn.dribbble.com/users/515705/screenshots/2450490/media/d35d2b5d118c077a7647a02d11f0c1fc.gif', 4),
	(5, 'Red Dead Redemption 2', 'Red Dead Redemption 2 es un juego de mundo abierto ambientado en el corazón de América en 1899. La era del viejo oeste está llegando a su fin. Los jugadores toman el control de Arthur Morgan, un forajido que forma parte de una pandilla.', 'https://cdn.dribbble.com/userupload/8690245/file/original-ee33ce800fdfee4f09c04b01aa3a54b7.jpeg', 5),
	(6, 'Assassin\'s Creed Odyssey', 'Ubicado en la antigua Grecia, Assassin\'s Creed Odyssey da a los jugadores la elección entre jugar como Alexios o Kassandra en una epopeya que abarca desde espartanos hasta dioses olímpicos. Es una travesía llena de decisiones y exploración.', 'https://cdn.dribbble.com/users/10109107/screenshots/17181230/media/c545c37aa65c2a1c826808010a0050af.jpg', 6),
	(7, 'God of War', 'Situado en el mundo de la mitología nórdica, God of War sigue a Kratos y a su hijo Atreus en un viaje a través de un paisaje inhóspito, enfrentándose a dioses y monstruos mientras buscan cumplir la última voluntad de la madre de Atreus.', 'https://cdn.dribbble.com/users/1025917/screenshots/4504191/media/a0e0669d7d09b41e9404eb89bc174bdf.png', 7),
	(8, 'Halo Infinite', 'Halo Infinite sigue la historia del Jefe Maestro, despertando en un mundo nuevo y misterioso. Este shooter en primera persona ofrece una experiencia multijugador expansiva y una campaña envolvente que vuelve a las raíces de la saga.', 'https://cdn.dribbble.com/users/441935/screenshots/2455944/media/a454ec018dd4c89b956985544f81ec33.jpg', 8),
	(9, 'Cyberpunk 2077', 'Situado en la metrópolis futurista de Night City, los jugadores asumen el papel de V, un mercenario en busca de un implante único que es la clave para la inmortalidad. El juego es un RPG de mundo abierto con múltiples líneas argumentales.', 'https://cdn.dribbble.com/users/1410611/screenshots/14785824/media/1e09746ac8169efde8f3aa02fbef2722.jpg', 9),
	(10, 'Ghost of Tsushima', 'En el final del siglo XIII, el imperio mongol ha arrasado naciones enteras en su campaña por conquistar el Este. La isla de Tsushima es todo lo que queda entre el Japón continental y un gigantesco flota de invasión mongola.', 'https://cdn.dribbble.com/userupload/3167937/file/still-89f850e065cdeae5bd661d99382ff127.png', 10);

/*!40000 ALTER TABLE `videojuego` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;


