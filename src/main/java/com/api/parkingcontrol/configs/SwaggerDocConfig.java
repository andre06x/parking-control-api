package com.api.parkingcontrol.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class SwaggerDocConfig implements WebMvcConfigurer {

//    private List<SecurityScheme> basicScheme() {
//        List<SecurityScheme> schemeList = new ArrayList();
//        schemeList.add(new BasicAuth("basicAuth"));
//        return schemeList;
//    }
//
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .securitySchemes(basicScheme())
//                .apiInfo(new ApiInfoBuilder()
//                        .title("API parking spot")
//                .description("More description about the API")
//                .contact(new Contact("André Silva", "URL", "andre06x@gmail.com"))
//                .version("1.0.0")
//                .build())
//
//                .select().apis(RequestHandlerSelectors.basePackage("com.api.parkingcontrol.controllers"))
//
//                .paths(PathSelectors.any())
//
//                .build();
//    }

    @Bean
    public Docket actuatorApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select().apis(RequestHandlerSelectors.basePackage("com.api.parkingcontrol.controllers")).apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant("/**"))
                .build()
                .apiInfo(apiINFO())
                .securityContexts(Arrays.asList(actuatorSecurityContext()))
                .securitySchemes(Arrays.asList(basicAuthScheme()));
    }

    private ApiInfo apiINFO() {
        return new ApiInfoBuilder()
                .title("parking-control-api")
                .description("Api para o gerenciamento de vagas de estacionamento")
                .contact(new Contact("André Silva", "", "andre06x@gmail.com"))
                .version("1.0.0")
                .build();
    }

    private SecurityContext actuatorSecurityContext() {
        return SecurityContext.builder()
                .securityReferences(Arrays.asList(basicAuthReference()))
                .forPaths(PathSelectors.ant("/**"))
                .build();
    }

    private SecurityScheme basicAuthScheme() {
        return new BasicAuth("basicAuth");
    }

    private SecurityReference basicAuthReference() {
        return new SecurityReference("basicAuth", new AuthorizationScope[0]);
    }


}