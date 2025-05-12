public class ClassificadorBarracas {
    public String classificar(Barraca barraca) {
        // Example classification logic based on valorTotal
        if (barraca.getValorTotal() > 1000) {
            return "Alta";
        } else if (barraca.getValorTotal() > 500) {
            return "Média";
        } else {
            return "Baixa";
        }
    }
}