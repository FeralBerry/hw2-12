package org.example.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// @Controller - аннотация с формированием html страницы
@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        String title = "Добро пожаловать в калькулятор";
        // передает параметр title в html страницу
        model.addAttribute("title", title);
        // название вызываемого шаблона
        return "home";
    }
}
