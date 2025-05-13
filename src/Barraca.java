import java.util.ArrayList;
import java.util.List;


public class Barraca {
    private String nome;
    private String instituição;
    private int quantidadeVenda;
    private double valorTotal;


    public Barraca(String nome, String instituição){
        this.nome = nome;
        this.instituição = instituição;
        this.quantidadeVenda = 0;
        this.valorTotal = 0.0;

    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInstituição() {
        return instituição;
    }

    public int getQuantidadeVenda() {
        return quantidadeVenda;
    }

    public void setQuantidadeVenda(int quantidadeVenda) {
        this.quantidadeVenda = quantidadeVenda;
    }

    public void setInstituição(String instituição) {
        this.instituição = instituição;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }


}
