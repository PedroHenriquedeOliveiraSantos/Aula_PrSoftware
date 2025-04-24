public class Roupa {
    private String marca;
    private String tipo;
    private String tamanho;
    private int quantidade;
    private double valor;

    public Roupa(String marca, String tipo, String tamanho, int quantidade, double valor) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public double calcularValorTotal() {
        return quantidade * valor;
    }

    public void adicionarEstoque(int qtd) {
        quantidade += qtd;
    }

    public void removerEstoque(int qtd) {
        if (qtd <= quantidade) {
            quantidade -= qtd;
        } else {
            System.out.println("Erro: quantidade insuficiente no estoque.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Tipo: " + tipo);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println("Valor unitário: R$ " + valor);
        System.out.println("Valor total em estoque: R$ " + calcularValorTotal());
        System.out.println("-----------------------------------");
    }
}