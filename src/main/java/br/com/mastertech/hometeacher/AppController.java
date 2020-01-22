package br.com.mastertech.hometeacher;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    @GetMapping
    public String mostrarHome() {
        return "index";
    }

    @GetMapping("/produtos")
    public String mostrarProdutos() {
        return "produtos";
    }

    @GetMapping("/sobre")
    public String mostrarSobre() {
        return "sobre";
    }

    @GetMapping("/contato")
    public String mostrarContato() {
        return "contato";
    }
}
