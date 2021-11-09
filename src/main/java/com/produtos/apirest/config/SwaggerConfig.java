/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.produtos.apirest.config;

import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static springfox.documentation.builders.PathSelectors.regex;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 *
 * @author Marketing
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    
    @Bean
    public Docket productApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.produtos.apirest"))
                .paths(regex("/api.*"))
                .build()
                .apiInfo(metaInfo());
    }
    
    private ApiInfo metaInfo(){
        ApiInfo apiInfo = new ApiInfo(
                "Produtos API Rest",
                "API REST de cadastro de produtos",
                "1.0",
                "Terms of Service",
                new Contact("Gustavo Tavares", "gustavo.silva1209@etec.sp.gov.br", "teste"),
                "Apache Licence Version 2.0",
                "https://www.apache.org/licente.html", new ArrayList<VendorExtension>()
        );
        
        return apiInfo;
    }
    
}
