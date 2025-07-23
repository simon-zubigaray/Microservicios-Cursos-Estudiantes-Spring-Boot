package js.zubigaray.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Clase principal del microservicio de configuración.
 *
 * <p>
 * Esta clase inicia una aplicación Spring Boot que actúa como servidor de configuración
 * centralizado usando Spring Cloud Config Server.
 * </p>
 *
 * <p>
 * Anotaciones utilizadas:
 * <ul>
 *   <li>{@code @SpringBootApplication}: Marca esta clase como una aplicación Spring Boot.</li>
 *   <li>{@code @EnableConfigServer}: Habilita el servidor de configuración de Spring Cloud.</li>
 * </ul>
 * </p>
 *
 * @author TuNombre
 */
@EnableConfigServer
@SpringBootApplication
public class MicroserviceConfigApplication {

	/**
	 * Método principal que inicia la aplicación Spring Boot.
	 *
	 * @param args argumentos de línea de comandos
	 */
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceConfigApplication.class, args);
	}

}
