package com.tobeng.bee.bootstrap;

import com.tobeng.bee.repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.tobeng.bee.repository")
public class RepositoryBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        MyFirstLevelRepository myFirstLevelRepository = context.getBean("myFirstLevelRepository", MyFirstLevelRepository.class);

        System.out.println("MyFirstLevelRepository Bean: " + myFirstLevelRepository);

        context.close();
    }

}
