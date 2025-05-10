import java.util.ArrayList;
import java.util.List;


public class Barraca {
    private String nome;
    private String instituição;
    private int quantidadeVenda;
    private double valorTotal;
    private List <Produto> produtos;
    private List <Escala> escalas;

    public Barraca(String nome, String instituição){
        this.nome = nome;
        this.instituição = instituição;
        this.quantidadeVenda = 0;
        this.valorTotal = 0.0;
        this.produtos = new ArrayList<>();
        this.escalas = new ArrayList<>();
    }


    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }


    public void adicionarEscala(Escala escala){
        this.escalas.add(escala);
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

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Escala> getEscalas() {
        return escalas;
    }

    public void setEscalas(List<Escala> escalas) {
        this.escalas = escalas;
    }

    public String getClassificação(){
        return new ClassificadorBarracas().classificar.(this);
    }
}
