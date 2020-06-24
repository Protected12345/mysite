package honchar.mycompany.mysite.controller;

import honchar.mycompany.mysite.service.api.IndexService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    private final IndexService indexService;

    public IndexController(IndexService indexService) {
        this.indexService = indexService;
    }

    @GetMapping("/")
    public String index(Model model, @RequestParam(required = false) String search) {
        model.addAttribute("categories", indexService.search(search));
        return "index";
    }

}
