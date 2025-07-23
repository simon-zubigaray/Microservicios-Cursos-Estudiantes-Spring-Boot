package js.zubigaray.microservice_student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Clase principal que inicia el microservicio Student.
 *
 * <p>
 * Configura una aplicación Spring Boot que se registra en un servidor de descubrimiento (Eureka).
 * </p>
 *
 * <p>
 * Anotaciones usadas:
 * <ul>
 *   <li>{@code @SpringBootApplication}: Marca esta clase como una aplicación Spring Boot.</li>
 *   <li>{@code @EnableDiscoveryClient}: Habilita el cliente para registrarse en el servidor de descubrimiento.</li>
 * </ul>
 * </p>
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceStudentApplication {

	/**
	 * Método principal que arranca la aplicación Student.
	 *
	 * @param args argumentos de línea de comandos
	 */
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceStudentApplication.class, args);
	}
}
