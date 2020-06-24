package honchar.mycompany.mysite.controller;

import honchar.mycompany.mysite.service.api.LoginRegService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegController {
    private final LoginRegService loginRegService;

    public RegController(LoginRegService loginService) {
        this.loginRegService = loginService;
    }
    @GetMapping("/reg")
    public String registration(Model model,
                               @RequestParam(name = "email", required = false) String email,
                               @RequestParam(name = "pass", required = false) String pass,
                               @RequestParam(name = "repPass", required = false) String repPass,
                               @RequestParam(name = "keyword", required = false) String keyword){
        if(!(email == null || pass == null || repPass == null || keyword == null))
            loginRegService.regUser(email, pass, repPass, keyword);
        return "reg";
    }

}
