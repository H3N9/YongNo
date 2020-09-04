package sop.lab3_1;

/**
 * Hello world!
 *
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class SpringBootHelloWorld {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootHelloWorld.class, args);
    }
    @RequestMapping(value="/", method = RequestMethod.GET)
	public String home() {
	    return "<h1>Hello World</h1>";
    }
    @RequestMapping(value="/new", method = RequestMethod.GET)
	public String newer() {
	    return "new";
    }
}
