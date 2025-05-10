import java.util.ArrayList;
import java.util.List;


public class Voluntario extends Pessoa{
    private list <Barraca> barracas;

    public Voluntario(String nome, int numeroAluno, String curso, String instituição, String password){}
    super(nome, numeroAluno, curso, instituição, password);
    this.barracas = new ArrayList<>();

}

public void adicionarBarraca(Barraca barraca){
    this.barracas.add(barraca);
}

public List <Barraca> getBarracas(){
    return barracas;
}