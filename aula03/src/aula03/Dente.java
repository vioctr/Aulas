package aula03;

public class Dente {
    private boolean podre = false;
    private Observador observador;

    public Observador getObservador() {
        return observador;
    }

    public void setObservador(Observador observador) {
        this.observador = observador;
    }
    public void tornarPodre(){
        if(podre){
            observador.reacao();
        }
        this.podre = true;
    }
    
    private void tornarSadio(){
        this.podre = false;
    }

    public boolean isPodre() {
        return podre;
    }

    public void setPodre(boolean podre) {
        this.podre = podre;
    }
    
    
}
