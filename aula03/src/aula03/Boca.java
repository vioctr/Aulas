package aula03;

import java.util.List;

public class Boca implements Observador{
    private int qtdPodres = 0;
    private List<Dente> dentesList;
    public int getQtdPodres() {
        return qtdPodres;
    }

    public void setQtdPodres(int qtdPodres) {
        this.qtdPodres = qtdPodres;
    }

    public List<Dente> getDentesList() {
        return dentesList;
    }

    public void setDentesList(List<Dente> dentesList) {
        this.dentesList = dentesList;
        for(Dente dente: dentesList){
            dente.setObservador(this);
        }
    }
    
    public Boca(int qtdPodres, List<Dente> dentesList){
        super();
        this.qtdPodres = qtdPodres;
        this.dentesList = dentesList;
    }
    
    public void mostrarQtdPodres(){
        System.out.println("TOTAL DE DENTES PODRES: " + this.qtdPodres);
    }
    
    @Override
    public void reacao(){
        qtdPodres++;
    }
   
}
