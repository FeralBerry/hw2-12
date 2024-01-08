package org.example.RestControllers;

import org.example.Services.HomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
// RestController - аннотация для создания контроллера без вызова шаблона
@RestController
// RequestMapping - аннотация для групировки вызываемых методов по определенной адресной строке
@RequestMapping("/calculator")
public class ActionController {
    private final HomeService homeService;
    public ActionController(HomeService homeService) {
        this.homeService = homeService;
    }
    // Вызывает дефолтный метод сервиса welcome() из интерфейса HomeServiceInterface из которого получает строку "Добро пожаловать в калькулятор"
    @GetMapping(path = "/")
    public String welcome(){
        return homeService.welcome();
    }
    // Вызывает метод сервиса plus() из который возвращает сумму
    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + " + " + num2 + " = " + homeService.plus(num1,num2);
    }
    // Вызывает метод сервиса minus() из который возвращает разницу
    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + " - " + num2 + " = " + homeService.minus(num1,num2);
    }
    // Вызывает метод сервиса multiply() из который возвращает умножение
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + " * " + num2 + " = " + homeService.multiply(num1,num2);
    }
    // Вызывает метод сервиса divide() из который возвращает деление и проверяет является ли 2 принимаемое число 0
    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + " / " + num2 + " = " + homeService.divide(num1,num2);
    }
}
