package entidades;

public class livro {

    public String livro;
    public String autor;
    public int quantidade;
    public double valorUnit;

    public String exibeInfo() {
        return "Livro: " + livro +
        "\nAutor: " + autor +
        "\nQuantidade: " + quantidade +
        "\nValor Unitario: " + valorUnit;
    }
}