package com.mycompany.projeto.aula3.tarefa3;

public class ClasseSocial {
    
    Double devolverSalariosMinimos(Double renda){
        return renda / 1045;
    }
    
    String devolverClasseSocial(Double devolverSalariosMinimos){
        if(devolverSalariosMinimos <= 2.0){
            return "E";
        } else if(devolverSalariosMinimos > 2.0 && devolverSalariosMinimos <= 4.0){
            return "D";
        } else if (devolverSalariosMinimos >4.0 && devolverSalariosMinimos <= 10.0){
            return "C";
        } else if(devolverSalariosMinimos > 10.0 && devolverSalariosMinimos <= 20.0){
            return "B";
        } else{
            return "A";
        }
    }
}
