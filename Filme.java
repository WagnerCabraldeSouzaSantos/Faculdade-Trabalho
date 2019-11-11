import java.util.ArrayList;


public class Filme{

    private String filTitulo;
    private int    filDuracao;
    private int    filAnoLancamento;
    private String filFormato;
    private ArrayList<String>filNomeAtores = new ArrayList<String>();

    public void setFilTitulo(String titulo) {
        this.filTitulo = titulo;
    }

    public String getFilTitulo() {
        return this.filTitulo;
    }

    public void setFilDuracao(int duracao) {
        this.filDuracao = duracao;
    }

    public int getFilDuracao() {
        return this.filDuracao;
    }

    public void setFilAnoLancamento(int anoLancamento) {
        this.filAnoLancamento = anoLancamento;
    }

    public int getFilAnoLancamento() {
        return this.filAnoLancamento;
    }

    public void setFilFormato(String formato) {
        this.filFormato = formato;
    }

    public String getFilFormato() {
        return this.filFormato;
    }

    public void setNomeAtores(String nome) {
        filNomeAtores.add(nome);
    }

    public ArrayList<String>getFilNomeAtores() {
        return this.filNomeAtores;
    }
}
