package com.gengdan.demo.config;

/**
 * @version 1.0
 * @date 2020/9/22 09:11
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * @author inter.d
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig{
    /**
     * @Description:swagger2的配置文件，这里可以配置swagger2的一些基本的内容，比如扫描的包等等
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.gengdan.demo.controller"))
                /*       .apis(RequestHandlerSelectors.withClassAnnotation(Controller.class))*/
                .paths(PathSelectors.any())
                .build();
    }
    /**
     * @Description: 构建 api文档的信息
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // 设置页面标题
                .title("测试接口文档")
                // 描述
                .description("测试接口部署文档")
                // 定义版本号
                .version("1.0").build();
    }
}