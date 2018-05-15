package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Web controller for the simple web application.
 * Returns data in web requests instead of a view.
 */
@RestController //Means it's ready to be used by Spring MVC to handle web requests; combines @Controller & @ResponseBody
public class HelloController {

    @RequestMapping("/") //Maps "/" to the index() methods, when invoked it returns pure text
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
}
