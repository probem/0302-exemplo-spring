package br.com.mastertech.hometeacher;

public class GeradorTemplate {
    public static String gerarPagina(String pagina){
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
                "    <title>Home Teacher</title>\n" +
                "    <link rel=\"stylesheet\" href=\"styles.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"header\">\n" +
                "        <h1>\n" +
                "            <a href=\"/\">Home Teacher</a> \n" +
                "        </h1>\n" +
                "\n" +
                "        <div class=\"menu\">\n" +
                "            <a href=\"produtos\">Produtos</a>\n" +
                "            <a href=\"sobre\">Sobre</a>\n" +
                "            <a href=\"contato\">Contato</a>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "\n" +
                pagina
                +
                "</body>\n" +
                "</html>";
    }
}
