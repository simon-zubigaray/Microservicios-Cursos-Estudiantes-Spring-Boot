package js.zubigaray.gateway;

import js.zubigaray.gateway.persistence.entity.PermissionEntity;
import js.zubigaray.gateway.persistence.entity.RoleEntity;
import js.zubigaray.gateway.persistence.entity.RoleEnum;
import js.zubigaray.gateway.persistence.entity.UserEntity;
import js.zubigaray.gateway.persistence.repository.IUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Set;

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

	@Bean
	CommandLineRunner init(IUserRepository userRepository){
		return args -> {
			// 1- Create permissions
			PermissionEntity createPermission = PermissionEntity.builder()
					.name("CREATE").build();
			PermissionEntity readPermission = PermissionEntity.builder()
					.name("READ").build();
			PermissionEntity updatePermission = PermissionEntity.builder()
					.name("UPDATE").build();
			PermissionEntity deletePermission = PermissionEntity.builder()
					.name("DELETE").build();

			// 2- Create roles
			RoleEntity roleAdmin = RoleEntity.builder()
					.roleEnum(RoleEnum.ADMIN)
					.permissionList(Set.of(createPermission, readPermission, updatePermission, deletePermission))
					.build();

			RoleEntity roleUser = RoleEntity.builder()
					.roleEnum(RoleEnum.USER)
					.permissionList(Set.of(createPermission, readPermission))
					.build();

			// 3- Create users

			UserEntity userSantiago = UserEntity.builder()
					.username("santiago")
					.password("$2a$10$ZQKgn2zqD8UJ0F1/73fACO6eB/m/AQeM2hbYC9kNydCVW.ebzAiu.")
					.isEnabled(true)
					.accountNoExpired(true)
					.accountNoLocked(true)
					.credentialNoExpired(true)
					.roles(Set.of(roleAdmin))
					.build();

			UserEntity userDaniel = UserEntity.builder()
					.username("daniel")
					.password("$2a$10$ZQKgn2zqD8UJ0F1/73fACO6eB/m/AQeM2hbYC9kNydCVW.ebzAiu.")
					.isEnabled(true)
					.accountNoExpired(true)
					.accountNoLocked(true)
					.credentialNoExpired(true)
					.roles(Set.of(roleUser))
					.build();

			userRepository.saveAll(List.of(userSantiago, userDaniel));
		};
	}
}