package com.lambdaschool.zoos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration // annotation to tell Spring this is a configuration file
@EnableSwagger2 // annotation to enable Swagger
public class Swagger2Config
{
    @Bean
    public Docket api()
    {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage("com.lambdaschool.zoos"))
                .paths(PathSelectors.regex("/.*"))
                .build()
                .apiInfo(apiEndPointsInfo());
    }

    private ApiInfo apiEndPointsInfo()
    {
        return new ApiInfoBuilder().title("Zoos Module Project")
                .description("Zoos Module Project")
                .contact(new Contact("John Mitchell",
                        "http://www.lambdaschool.com",
                        "john@lambdaschool.com"))
                .license("MIT")
                .licenseUrl("https://github.com/LambdaSchool/java-sampleemps/blob/master/LICENSE")
                .version("1.0.0")
                .build();
    }
}
