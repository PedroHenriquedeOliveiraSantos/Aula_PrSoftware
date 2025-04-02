package principal;

import entidades.livro;

public class main {

    public static void main(String[] args) {
        livro culpaDasEstrelas= new livro();

        culpaDasEstrelas.livro = "A Culpa e Das Estrelas";
        culpaDasEstrelas.autor = "John Green";
        culpaDasEstrelas.quantidade = 100;
        culpaDasEstrelas.valorUnit = 80;

        System.out.println(culpaDasEstrelas.exibeInfo());
        

        livro antonioesuashistorias = new livro();
        antonioesuashistorias.livro = "Antonio e Suas Historias";
        antonioesuashistorias.autor = "Antonio";
        antonioesuashistorias.quantidade = 100;
        antonioesuashistorias.valorUnit= 200;

        System.out.println(antonioesuashistorias.exibeInfo());
    }
}