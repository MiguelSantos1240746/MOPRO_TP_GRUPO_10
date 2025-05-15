package org.example.model;


public class Venda {
    private Produto produto;
    private int quantidade;
    private double total;


    public Venda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.total = quantidade * produto.getPreco();

    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getTotal() {
        return total;
    }





    @Override
    public String toString() {
        return "Venda{" +
                "produto='" + produto.getNome() + '\'' +
                ", quantidade=" + quantidade +
                ", total=" + total +
                '}';
    }
}
