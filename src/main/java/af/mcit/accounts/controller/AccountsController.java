package af.mcit.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello world!";
    }

}
