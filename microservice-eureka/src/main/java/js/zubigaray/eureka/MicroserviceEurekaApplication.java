package js.zubigaray.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Clase principal que inicia el microservicio Eureka Server.
 *
 * <p>
 * Configura y habilita un servidor Eureka para el registro y descubrimiento
 * de servicios en la arquitectura de microservicios.
 * </p>
 *
 * <p>
 * Anotaciones usadas:
 * <ul>
 *   <li>{@code @SpringBootApplication}: Marca esta clase como una aplicación Spring Boot.</li>
 *   <li>{@code @EnableEurekaServer}: Habilita el servidor Eureka.</li>
 * </ul>
 * </p>
 *
 * @author TuNombre
 */
@EnableEurekaServer
@SpringBootApplication
public class MicroserviceEurekaApplication {

	/**
	 * Método principal que arranca la aplicación Eureka Server.
	 *
	 * @param args argumentos de línea de comandos
	 */
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceEurekaApplication.class, args);
	}
}