package org.example.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Federação {
    private String nome;
    private final List<Produto> lstProdutos;
    private final List<Barraca> lstBarracas;

    public Federação(String nome) {
        this.nome = nome;
        this.lstProdutos = new ArrayList<>();
        this.lstBarracas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public boolean adicionarProduto(Produto produto) {
        if (!listaContemProduto(produto.getNome())) {
            lstProdutos.add(new Produto(produto));
            return true;
        }
        return false;
    }

    public boolean removerProduto(String nomeProduto) {
        return lstProdutos.removeIf(p -> p.getNome().equals(nomeProduto));
    }

    public boolean listaContemProduto(String nomeProduto) {
        for (Produto produto : lstProdutos) {
            if (produto.getNome().equals(nomeProduto)) {
                return true;
            }
        }
        return false;
    }

    public List<Produto> listarProdutosOrdenados() {
        List<Produto> ordenados = new ArrayList<>(lstProdutos);
        ordenados.sort(Comparator.comparing(Produto::getNome));
        return ordenados;
    }

    public boolean adicionarBarraca(Barraca barraca) {
        if (!lstBarracas.contains(barraca)) {
            lstBarracas.add(barraca);
            return true;
        }
        return false;
    }

    public boolean removerBarraca(Barraca barraca) {
        return lstBarracas.remove(barraca);
    }

    public List<Barraca> getListaBarracas() {
        return lstBarracas;
    }

    public List<Produto> getListaProdutos() {
        return lstProdutos;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Federacao: ");
        sb.append("nome='").append(nome).append("'\n");

        sb.append("Lista de Produtos:");
        if (lstProdutos.isEmpty()) {
            sb.append(" (VAZIA)\n");
        } else {
            for (Produto produto : lstProdutos) {
                sb.append("\n\t- ").append(produto);
            }
        }

        sb.append("\nLista de Barracas:");
        if (lstBarracas.isEmpty()) {
            sb.append(" (VAZIA)");
        } else {
            for (Barraca barraca : lstBarracas) {
                sb.append("\n\t- ").append(barraca);
            }
        }

        return sb.toString();
    }
}

