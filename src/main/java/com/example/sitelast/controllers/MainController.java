package com.example.sitelast.controllers;

import com.example.sitelast.entity.Basket;
import com.example.sitelast.entity.Orders;
import com.example.sitelast.entity.Products;
import com.example.sitelast.repository.BasketRepository;
import com.example.sitelast.repository.OrdersRepository;
import com.example.sitelast.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class MainController {
    @Autowired
    private ProductsRepository productsRepository;
    @Autowired
    private BasketRepository basketRepository;
    @Autowired
    private OrdersRepository ordersRepository;

    // для заказов короче
    @PostMapping("/addbask")
    public String addToCart(@RequestParam("productId") Long productId, Model model) {
        model.addAttribute("title", "Zog-Zog Tac. | Загрузка");
        Optional<Products> productOptional = productsRepository.findById(productId);
        if (productOptional.isPresent()) {
            Products product = productOptional.get();
            Basket existingBasket = basketRepository.findByProductId(productId);
            if (existingBasket != null) {
                model.addAttribute("message", "Товар отсутствует");
                return "redirect:/orders";
            } else {
                Basket basket = new Basket(product.getID(), product.getName(), product.getCategory(), product.getPrice(), product.getLink());
                basketRepository.save(basket);
                return "redirect:/orders";
            }
        }
        return "redirect:/orders";
    }

    @PostMapping("/removebask")
    public String RemoveToCart(@RequestParam("productId") Long productId, Model model) {
        model.addAttribute("title", "Zog-Zog Tac. | Загрузка");
        Basket basket = basketRepository.findByProductId(productId);
        basketRepository.delete(basket);
        return "redirect:/orders";
    }

    @PostMapping("/addorders")
    public String addToOrder(Model model) {
        model.addAttribute("title", "Zog-Zog Tac. | Загрузка");
        List<Basket> basketItems = basketRepository.findAll();
        List<Long> ordersProductIds = ordersRepository.findAllProductIdsOrders();
        List<Long> basketProductIds = basketRepository.findAllProductIdsBasket();
        for (Basket item : basketItems) {
            if (ordersProductIds.contains(item.getIdProd()) != basketProductIds.contains(item.getIdProd())) {
                Products product = productsRepository.findById(item.getIdProd()).orElse(null);
                if (product != null) {
                    Orders orders = new Orders(item.getIdProd(), "Передан в обработку", "ПВЗ г.Самара", product.getPrice(), product.getName(), product.getLink());
                    ordersRepository.save(orders);
                } else {
                    return "redirect:/ZakaZ";
                }
            }
        }
        basketRepository.deleteAll();
        return "redirect:/ZakaZ";
    }

    // здесь на странички выходим, по рабоче-крестьянски, я бы по другому сделать, но надо быстрее доделать
    @GetMapping("/")
    public String Products(Model model) {
        model.addAttribute("title", "Zog-Zog Tac. | Mordor tactical");
        Iterable<Products> productsItems = productsRepository.findAll();
        model.addAttribute("ordersItems", productsItems);
        return "Zoga_Homepage";
    }

    @GetMapping("/ZakaZ") // типо заказы
    public String Main(Model model) {
        model.addAttribute("title", "Zog-Zog Tac. | Главная");
        Iterable<Orders> ordersItems = ordersRepository.findAll();
        model.addAttribute("ordersItems", ordersItems);
        return "Zoga_Zakazi";
    }

    @GetMapping("/main")
    public String Zakaz(Model model) {
        model.addAttribute("title", "Zog-Zog Tac. | Главная");
        return "Zoga_Main";
    }

    @GetMapping("/orders") // Корзина
    public String Orders(Model model) {
        Iterable<Basket> basketItems = basketRepository.findAll();
        model.addAttribute("basketItems", basketItems);
        model.addAttribute("title", "Zog-Zog Tac. | Корзина");
        return "Zoga_Basket";
    }

    @GetMapping("/inf")
    public String Inf(Model model) {
        model.addAttribute("title", "Zog-Zog Tac. | Информация");
        return "Zoga_Inf";
    }

    @GetMapping("/contacts")
    public String Contact(Model model) {
        model.addAttribute("title", "Zog-Zog Tac. | Для Партнеров");
        return "Zoga_Contact_Us";
    }

    @GetMapping("/broniya")
    public String Broniya(Model model) {
        model.addAttribute("title", "Zog-Zog Tac. | Бронежелеты");
        Iterable<Products> productsItems = productsRepository.findAll();
        model.addAttribute("ordersItems", productsItems);
        return "Zoga_Broniya";
    }

    @GetMapping("/kaski")
    public String Kaski(Model model) {
        model.addAttribute("title", "Zog-Zog Tac. | Каски");
        Iterable<Products> productsItems = productsRepository.findAll();
        model.addAttribute("ordersItems", productsItems);
        return "Zoga_Kaski";
    }

    @GetMapping("/odezhda")
    public String Odezhda(Model model) {
        model.addAttribute("title", "Zog-Zog Tac. | Форма");
        Iterable<Products> productsItems = productsRepository.findAll();
        model.addAttribute("ordersItems", productsItems);
        return "Zoga_Odezhda";
    }

    @GetMapping("/patchi")
    public String Patchi(Model model) {
        model.addAttribute("title", "Zog-Zog Tac. | Шевроны");
        Iterable<Products> productsItems = productsRepository.findAll();
        model.addAttribute("ordersItems", productsItems);
        return "Zoga_Patchi";
    }

    @GetMapping("/pliti")
    public String Pliti(Model model) {
        model.addAttribute("title", "Zog-Zog Tac. | Плиты");
        Iterable<Products> productsItems = productsRepository.findAll();
        model.addAttribute("ordersItems", productsItems);
        return "Zoga_Pliti";
    }

    @GetMapping("/podsumki")
    public String Podsumki(Model model) {
        model.addAttribute("title", "Zog-Zog Tac. | Подсумки");
        Iterable<Products> productsItems = productsRepository.findAll();
        model.addAttribute("ordersItems", productsItems);
        return "Zoga_Podsumki";
    }

    @GetMapping("/snaryashenie")
    public String Snaryashenie(Model model) {
        model.addAttribute("title", "Zog-Zog Tac. | Снаряжение");
        Iterable<Products> productsItems = productsRepository.findAll();
        model.addAttribute("ordersItems", productsItems);
        return "Zoga_Snaryashenie";
    }

    @GetMapping("/ubor")
    public String Ubor(Model model) {
        model.addAttribute("title", "Zog-Zog Tac. | Головные уборы");
        Iterable<Products> productsItems = productsRepository.findAll();
        model.addAttribute("ordersItems", productsItems);
        return "Zoga_Ubor";
    }
}