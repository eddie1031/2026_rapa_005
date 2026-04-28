package config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ITemplateResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "controller")
public class MonitorConfiguration {

    // Template Engine
    @Bean
    public SpringTemplateEngine templateEngine(ApplicationContext applicationContext) {

        SpringTemplateEngine engine = new SpringTemplateEngine();
        engine.setTemplateResolver(templateResolver(applicationContext));
        return engine;
    }

    @Bean
    public ITemplateResolver templateResolver(ApplicationContext applicationContext) {

        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();

        resolver.setApplicationContext(applicationContext);

//        resolver.setPrefix("classpath:/templates/");
        resolver.setPrefix("/WEB-INF/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode(TemplateMode.HTML);

        return resolver;

    }

}
