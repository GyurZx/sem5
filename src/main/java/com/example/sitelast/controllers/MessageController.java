//package com.example.sitelast.controllers;
//
//import com.example.sitelast.domain.Message;
//import com.example.sitelast.repository.MessageRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.Banner;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.Map;
//
//@Controller
//public class MessageController {
//
//    @Autowired
//    private MessageRepository messageRepository;
//
//    @GetMapping("/greeting")
//    public String greeting(
//            @RequestParam(name = "name", required = false, defaultValue = "World") String name,
//            Map<String, Object> model
//    ) {
//        model.put("name", name);
//        return "greeting";
//    }
//
//    @GetMapping("/bhu")
//    public String greeting() {
//        return "site";
//    }
//
//    @PostMapping("/bhu")
//    public String add_bhu(@RequestParam String text, @RequestParam String tag, Map<String, Object> model) {
//        Message message = new Message(text, tag);
//        messageRepository.save(message);
//
//        Iterable<Message> messages = messageRepository.findAll();
//        model.put("message", messages);
//
//        return "site";
//    }
//
//    @GetMapping("/lao")
//    public String main(Map<String, Object> model) {
//        Iterable<Message> messages = messageRepository.findAll();
//
//        model.put("message", messages);
//        return "greeting";
//    }
//
//    @GetMapping("/about_us.html")
//    public String about_us() {
//        return "about_us";
//    }
//
//    @GetMapping("/careers.html")
//    public String careers() {
//        return "careers";
//    }
//
//    @GetMapping("/services.html")
//    public String services() {
//        return "services";
//    }
//
//    @GetMapping("/project.html")
//    public String project() {
//        return "project";
//    }
//
//    @GetMapping("/partners.html")
//    public String partners() {
//        return "partners";
//    }
//
//    @GetMapping("/customers.html")
//    public String customers() {
//        return "customers";
//    }
//
//    @GetMapping("/contact.html")
//    public String contact() {
//        return "contact";
//    }
//
//    @GetMapping("/site.html")
//    public String site() {
//        return "site";
//    }
//
//    @PostMapping("/lao")
//    public String add_lao(@RequestParam String text, @RequestParam String tag, Map<String, Object> model) {
//        // Берем эти теги, ложим их в сообщение
//        Message message = new Message(text, tag);
//        // Сохраняем в БД
//        messageRepository.save(message);
//
//        // Здесь просто показываем то, что положили сразу выводя на страницу
////        Iterable<Message> messages = messageRepository.findAll();
////        model.put("message", messages);
//
//        return "greeting";
//    }
//
//}
