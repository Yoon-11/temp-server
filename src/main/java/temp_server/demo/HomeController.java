package temp_server.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "Come On~!";
    }

    @GetMapping("/health")
    @ResponseStatus(HttpStatus.OK)
    public void healthCheck() {
    }
}
