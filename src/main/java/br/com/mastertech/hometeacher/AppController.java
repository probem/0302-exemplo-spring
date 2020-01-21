package br.com.mastertech.hometeacher;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping
    public String mostrarHome() {
        String pagina = "<img class=\"banner\" src=\"https://images.unsplash.com/photo-1556302132-40bb13638500?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1510&q=80\" alt=\"\">\n";
        return GeradorTemplate.gerarPagina(pagina);
    }

    @GetMapping("/produtos")
    public String mostrarProdutos() {
        String pagina = "<div class=\"products\">\n" +
                "        <div>\n" +
                "            <h2>Groger</h2>\n" +
                "            <img src=\"https://avatars2.githubusercontent.com/u/25519652?s=460&v=4\" alt=\"Groger\">\n" +
                "            <p>Java, CSS, Crossfit</p>\n" +
                "        </div>\n" +
                "\n" +
                "        <div>\n" +
                "            <h2>Bia</h2>\n" +
                "            <img src=\"https://yt3.ggpht.com/-uGYJvczbuow/AAAAAAAAAAI/AAAAAAAAAAA/VQbgt1FitYs/s900-c-k-no-mo-rj-c0xffffff/photo.jpg\" alt=\"Bia\">\n" +
                "            <p>Produtos, Dinâmica de Bolinhas, Fotogênica</p>\n" +
                "        </div>\n" +
                "\n" +
                "        <div>\n" +
                "            <h2>Jefferson</h2>\n" +
                "            <img src=\"https://ca.slack-edge.com/T0H0X9D37-UNXCQGQMT-7a4ce6db74ac-512\" alt=\"Jefferson\">\n" +
                "            <p>Java, Ninja dos Canetões</p>\n" +
                "        </div>\n" +
                "    </div>";
        return GeradorTemplate.gerarPagina(pagina);
    }

    @GetMapping("/sobre")
    public String mostrarSobre() {
        String pagina = "Sobre";
        return GeradorTemplate.gerarPagina(pagina);
    }

    @GetMapping("/contato")
    public String mostrarContato() {
        String pagina = "<form method=\"POST\">\n" +
                "        <h2>Entre em Contato</h2>\n" +
                "        <input type=\"text\" placeholder=\"Nome\" name=\"nome\">\n" +
                "        <input type=\"text\" placeholder=\"E-mail\" name=\"email\">\n" +
                "        <button>Enviar</button>\n" +
                "    </form>";
        return GeradorTemplate.gerarPagina(pagina);
    }

    @GetMapping("/styles.css")
    public String mostrarEstilos() {
        return "body{\n" +
                "    margin: 0;\n" +
                "    font-family: sans-serif;\n" +
                "}\n" +
                "\n" +
                "a{\n" +
                "    color: white;\n" +
                "    text-decoration: none;\n" +
                "}\n" +
                "\n" +
                "form{\n" +
                "    width: 50%;\n" +
                "    margin: auto;\n" +
                "}\n" +
                "\n" +
                "input{\n" +
                "    display: block;\n" +
                "    width: 100%;\n" +
                "    padding: 10px;\n" +
                "    margin: 5px 0;\n" +
                "}\n" +
                "\n" +
                ".menu a{\n" +
                "    font-size: 20px;\n" +
                "    padding: 0 10px;\n" +
                "}\n" +
                "\n" +
                ".header{\n" +
                "    background-color: #830e0e;\n" +
                "    overflow: auto;\n" +
                "    color: white;\n" +
                "    display: flex;\n" +
                "    align-items: center;\n" +
                "    justify-content: space-between;\n" +
                "    padding: 0 10px;\n" +
                "}\n" +
                "\n" +
                ".banner{\n" +
                "    width: 100%;\n" +
                "}\n" +
                "\n" +
                ".products{\n" +
                "    display: flex;\n" +
                "    justify-content: space-around;\n" +
                "}\n" +
                "\n" +
                ".products div{\n" +
                "    width: 30%;\n" +
                "    text-align: center;\n" +
                "}\n" +
                "\n" +
                ".products img{\n" +
                "    width: 100%;\n" +
                "    border-radius: 15px;\n" +
                "}";
    }
}
