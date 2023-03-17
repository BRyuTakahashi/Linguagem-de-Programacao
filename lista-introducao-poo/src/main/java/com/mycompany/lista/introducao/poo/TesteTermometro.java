package com.mycompany.lista.introducao.poo;

public class TesteTermometro {
    public static void main(String[] args) {
        Termometro termometro = new Termometro();
        
        termometro.temperaturaAtual = 32.0;
        termometro.temperaturaMax = 120.0;
        termometro.temperaturaMin = -120.0;
        
        termometro.aumentaTemperatura(100.0);
        termometro.diminuiTemperatura(102.0);
        termometro.diminuiTemperatura(302.0);
        termometro.aumentaTemperatura(200.0);
        termometro.exibeFahrenheit();
    }
}
