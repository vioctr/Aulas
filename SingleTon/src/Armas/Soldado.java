package Armas;


public class Soldado {
    private Metralhadora metralhadora;
    private Bazuca bazuca;
    private Pistola pistola;
    
    public Soldado(){
        
    }
    public void atirarComMetralhadora(){
        if(metralhadora == null){
        metralhadora = new Metralhadora();
        }
        metralhadora.atirar();
    }
    
    public void atirarComBazuca(){
        if(bazuca == null){
        bazuca = new Bazuca();
        }
        bazuca.atirar();
    }
    
    public void atirarComPistola(){
        if(pistola == null){
        pistola = new Pistola();
        }
        pistola.atirar();
    }
}
