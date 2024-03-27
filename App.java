import api.PilaTDA;
import impl.PilaDinamica;
import impl.PilaEstatica;
import algoritmos.MetodoPila;
public class App {
    public static void main(String[] args) throws Exception {
        
        PilaTDA P1= new PilaDinamica();
        PilaTDA P2= new PilaDinamica();

        P1.InicilaizarPila();
        P2.InicilaizarPila();
        System.out.println(P1.PilaVacia());
        P1.Apilar(4);
        P1.Apilar(7);
        P1.Apilar(8);
        MetodoPila.PasarPila(P1,P2);
        /* 
        while (!P1.PilaVacia()){
            P2.Apilar(P1.Tope());
            P1.Desapilar();
        }
        
        while(!P2.PilaVacia()){
            System.out.println(P2.Tope());
            P2.Desapilar();
        }
    for(int i=0;i<10; i++){
        P1.Apilar(i);
    }
    while(!P1.PilaVacia()){
        System.out.println(P1.Tope());
        P1.Desapilar();
    }
    }
    */
}

//ejercicio 2
//A)
