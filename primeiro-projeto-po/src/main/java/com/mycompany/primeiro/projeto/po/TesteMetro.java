package com.mycompany.primeiro.projeto.po;

public class TesteMetro {
    public static void main(String[] args) {
        BilheteUnico bilhete01 = new BilheteUnico();
        bilhete01.nomeTitular = "Xampson";
        bilhete01.possuiMeiaEntrada = true;
        bilhete01.saldo = 0.0;
        
        BilheteUnico bilhete02 = new BilheteUnico();
        bilhete02.nomeTitular = "William";
        bilhete02.possuiMeiaEntrada = false;
        bilhete02.saldo = 0.0;
        
        bilhete01.usar();
        bilhete01.recarregar(100.0);
        bilhete01.usar();
        
        bilhete02.recarregar(3.20);
        bilhete02.usar();
        bilhete02.recarregar(10.0);
        bilhete02.usar();
    }
}
