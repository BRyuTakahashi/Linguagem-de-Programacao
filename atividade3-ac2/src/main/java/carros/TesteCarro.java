package carros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteCarro {
    public static void main(String[] args) {
        List listaCarros = new ArrayList();
        Scanner leitor = new Scanner(System.in);
        Carro carro1 = new Carro("Fox", 80000.00, 2016, "Fiat");
        Carro carro2 = new Carro("Santa Fé", 100000.00, 2019, "Hyundai");
        Carro carro3 = new Carro("Fit", 60000.00, 2016, "Honda");
        Carro carro4 = new Carro("Savero", 70000.00, 2016, "Fiat");
        Carro carro5 = new Carro("Onix", 80000.00, 2016, "Chevrolet");
        
        listaCarros.add(carro1);
        listaCarros.add(carro2);
        listaCarros.add(carro3);
        listaCarros.add(carro4);
        listaCarros.add(carro5);
        
        String inputCarro = leitor.nextLine();
        
        for(Integer index = 0; index < listaCarros.size(); index++){
            if(listaCarros.get(index).getAno() > 2018){
                
            }
        }
    }
}
