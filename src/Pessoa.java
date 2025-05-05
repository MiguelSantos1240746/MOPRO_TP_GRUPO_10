import java.util.Objects;

public class Pessoa {
    protected String nome;
    protected int numeroAluno;
    protected String curso;
    protected String instituição;
    protected String password;

    public Pessoa(String nome, int numeroAluno, String curso, String instituição, String password){
        this.nome = nome;
        this.numeroAluno = numeroAluno;
        this.curso= curso;
        this.instituição = instituição;
        this.password = password;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getNumeroAluno(){
        return numeroAluno;
    }

    public void setNumeroAluno(int numeroAluno) {
        this.numeroAluno = numeroAluno;
    }

    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getInstituição(){
        return instituição;
    }

    public void setInstituição(String instituição) {
        this.instituição = instituição;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return numeroAluno == pessoa.numeroAluno && Objects.equals(nome, pessoa.nome) && Objects.equals(curso, pessoa.curso) && Objects.equals(instituição, pessoa.instituição) && Objects.equals(password, pessoa.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numeroAluno, curso, instituição, password);
    }
}
