package com.mycompany.lista.introducao.poo;

public class Termometro {
    Double temperaturaAtual;
    Double temperaturaMin;
    Double temperaturaMax;
    
    void aumentaTemperatura(Double quantidadeAumentar){
        if((temperaturaAtual + quantidadeAumentar) > temperaturaMax){
            temperaturaAtual = temperaturaMax;
        } else {
            temperaturaAtual += quantidadeAumentar;
        }
        
        System.out.println(String.format("Sua temperatura atual é de %.2f Celsius", temperaturaAtual));
    }
    void diminuiTemperatura(Double quantidadeDiminuir){
        if((temperaturaAtual - quantidadeDiminuir) < temperaturaMin){
            temperaturaAtual = temperaturaMin;
        } else {
            temperaturaAtual -= quantidadeDiminuir;
        }
        
        System.out.println(String.format("Sua temperatura atual é de %.2f Celsius", temperaturaAtual));
    }
    void exibeFahrenheit(){
        Double temperaturaFahrenheit;
        temperaturaFahrenheit = temperaturaAtual * 1.8 + 32;
        System.out.println(String.format("Sua temperatura em Celsius é equivalente a %.2f Fahrenheit", temperaturaFahrenheit));
    }
}
