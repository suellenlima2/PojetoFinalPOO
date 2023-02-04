package models;

public class Bolsa {

    private int id;
    private double preco;
    private double desconto;
    private int quantidadeEstoque;
    private String marca;

    public Bolsa(int id, double preco, double desconto, int quantidadeEstoque, String marca) {
        this.id = id;
        this.preco = preco;
        this.desconto = desconto;
        this.quantidadeEstoque = quantidadeEstoque;
        this.marca = marca;
    }

    public Bolsa(double preco, double desconto, int quantidadeEstoque, String marca) {
        this.preco = preco;
        this.desconto = desconto;
        this.quantidadeEstoque = quantidadeEstoque;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public int getQuantidadestoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
}