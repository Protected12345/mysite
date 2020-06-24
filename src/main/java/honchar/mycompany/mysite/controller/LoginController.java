package honchar.mycompany.mysite.controller;

import honchar.mycompany.mysite.service.api.LoginRegService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private final LoginRegService loginService;

    public LoginController(LoginRegService loginService) {
        this.loginService = loginService;
    }
    @GetMapping("login")
    public String login(Model model,
                        @RequestParam(name = "email", required = false) String email,
                        @RequestParam(name = "pass", required = false) String pass){
        if(email != null && !email.isEmpty())
            model.addAttribute("loginAtr", loginService.loginUser(email, pass));
        System.out.println(email + " - " + pass);
        return "login";
    }
}
