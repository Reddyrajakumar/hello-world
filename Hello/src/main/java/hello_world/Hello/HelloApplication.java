package hello_world.Hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloApplication {

	@RequestMapping("/hello")
	public String world(){
		return "Hello World";
	}
	/*git init
	git add README.md
	git commit -m "first commit"
	git branch -M main
	git remote add origin https://github.com/Reddyrajakumar/hello-world.git
	git push -u origin main*/

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}
