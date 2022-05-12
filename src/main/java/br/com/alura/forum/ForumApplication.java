package br.com.alura.forum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//Serve para capturar as informações de paginação das requisições web
@EnableSpringDataWebSupport
//Habilitar o uso de cache na aplicação
@EnableCaching
//Habilitar o Swagger para documentação da API. As classes a serem lidas para documentação deverão ter anotação @Configuration e retorno dos métidos Docket.
@EnableSwagger2
public class ForumApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForumApplication.class, args);
	}

}
