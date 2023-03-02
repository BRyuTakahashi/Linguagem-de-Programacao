package com.mycompany.projeto.aula3.tarefa3;

public class ClasseSocial {
    
    Double devolverSalariosMinimos(Double renda){
        return renda / 1045;
    }
    
    String devolverClasseSocial(Double receberSalariosMinimos){
        if(receberSalariosMinimos <= 2.0){
            return "E";
        } else if(receberSalariosMinimos > 2.0 && receberSalariosMinimos <= 4.0){
            return "D";
        } else if (receberSalariosMinimos >4.0 && receberSalariosMinimos <= 10.0){
            return "C";
        } else if(receberSalariosMinimos > 10.0 && receberSalariosMinimos <= 20.0){
            return "B";
        } else{
            return "A";
        }
    }
}
