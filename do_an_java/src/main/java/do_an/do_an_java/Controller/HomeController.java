package do_an.do_an_java.Controller;

import lombok.SneakyThrows;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.nio.file.Files;
import java.nio.file.Paths;


@Controller
@RequestMapping("/")
public class HomeController {
    @SneakyThrows
    @GetMapping
    public String home(){
        return "home/index";
    }
    @GetMapping("/contact")
    public String contact(){
        return "home/contact";
    }
}
