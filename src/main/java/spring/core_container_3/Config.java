package spring.core_container_3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("spring.core_container_3")//Scans for components not required if @Bean is used

public class Config {
	@Bean
	public Car qweqqw(Car car)
	{
		return car;
	}

}
