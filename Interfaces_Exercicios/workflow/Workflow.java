import atividades.Atividade;
import java.util.ArrayList;

public class Workflow {
    private ArrayList<Atividade> atividades;

    public Workflow(){

        atividades = new ArrayList<>();
    }

    public  ArrayList<Atividade> getAtividades() {
        return atividades;
    }

    public void registrarAtividade(Atividade atividade) {
        atividades.add(atividade);

    }
}
