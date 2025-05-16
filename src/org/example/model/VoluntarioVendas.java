package org.example.model;

import org.example.utils.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class VoluntarioVendas extends Voluntario implements Classificacao, Serializable {
    private List<Venda> vendasRealizadas;

    public VoluntarioVendas(String nome, String numeroAluno, String curso, String senha, String instituicao) {
        super(nome, numeroAluno, curso, senha, instituicao);
        this.vendasRealizadas = new ArrayList<>();
    }

    public boolean registrarVenda(Venda venda) {
        return vendasRealizadas.add(venda);
    }

    @Override
    public String classificar(Data data) {
        double totalVendas = 0;
        for (int i = 0; i < vendasRealizadas.size(); i++) {
            Venda venda = vendasRealizadas.get(i);
            if (venda.getData().toString().equals(data.toString())) {
                totalVendas = totalVendas + venda.getValorTotal();
            }
        }
        if (totalVendas < 500) {
            return "Bronze";
        } else if (totalVendas <= 1000) {
            return "Prata";
        } else {
            return "Ouro";
        }
    }
}