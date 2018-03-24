package aula03;

import java.util.List;
import java.util.ArrayList;

public class Principal {
       public static void main(String[] args){
           List<Dente> dentes = new ArrayList<Dente>();
           for(int i=0; i<5; i++){    
               dentes.add(new Dente()); 
       }
           Boca boca = new Boca(0, dentes);
           boca.mostrarQtdPodres();
           dentes.get(0).tornarPodre();
           boca.mostrarQtdPodres();
}
}
