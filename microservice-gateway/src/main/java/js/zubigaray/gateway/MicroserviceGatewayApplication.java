package js.zubigaray.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal que inicia el microservicio Gateway.
 *
 * <p>
 * Configura una aplicación Spring Boot que actúa como API Gateway para enrutar
 * peticiones a los diferentes microservicios registrados.
 * </p>
 *
 * <p>
 * Anotaciones usadas:
 * <ul>
 *   <li>{@code @SpringBootApplication}: Marca esta clase como la aplicación principal Spring Boot.</li>
 * </ul>
 * </p>
 *
 * @author TuNombre
 */
@SpringBootApplication
public class MicroserviceGatewayApplication {

	/**
	 * Método principal que arranca la aplicación Gateway.
	 *
	 * @param args argumentos de línea de comandos
	 */
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceGatewayApplication.class, args);
	}
}