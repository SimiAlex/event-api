package SimiAlex.com.github.eventapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.convert.Jsr310Converters;

@SpringBootApplication
@EntityScan(basePackageClasses = {EventApiApplication.class, Jsr310Converters.class})
public class EventApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventApiApplication.class, args);
	}

}
