package algoritmos;

import api.PilaTDA;

public class MetodoPila {

    public static void PasarPila(PilaTDA A, PilaTDA B){
        while(!A.PilaVacia()){
            B.Apilar(A.Tope());
            A.Desapilar();
        }

    }
}
