package source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableAspectJAutoProxy
@EnableJpaRepositories(basePackages = "source.data")
@EntityScan(basePackages = "source.model")
@SpringBootApplication
public class MySpringBootApplication {

    public static void main(String[] args) {

        SpringApplication.run(MySpringBootApplication.class, args);
    }

//    @Autowired
//    private ApplicationContext context;
//
//    @EventListener(ApplicationReadyEvent.class)
//    public void logBeans() {
//        Arrays.stream(context.getBeanDefinitionNames())
//                .forEach(System.out::println);
//    }

}