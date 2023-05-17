package com.mycompany.consultoria;
import java.util.Scanner;

public class TesteConsultoria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Consultoria consultoria1 = new Consultoria("SPTech", 5);
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Ryu", 10, 80.50);
        Desenvolvedor desenvolvedor2 = new Desenvolvedor("Estela", 6, 100.20);
        DesenvolvedorMobile desenvolvedorMobile1 = new DesenvolvedorMobile(11, 98.45, "Bruno", 5, 87.50);
        DesenvolvedorMobile desenvolvedorMobile2 = new DesenvolvedorMobile(4, 68.45, "Duda", 12, 87.25);
        
        consultoria1.contratar(desenvolvedor1);
        consultoria1.contratar(desenvolvedor2);
        consultoria1.contratar(desenvolvedorMobile1);
        consultoria1.contratar(desenvolvedorMobile2);
        
        String nome = leitor.nextLine();
        
        System.out.println(consultoria1.existePorNome(nome));
        
        System.out.println(consultoria1.getQuantidadeDesenvolvedores());
        System.out.println(consultoria1.getQuantidadeDesenvolvedoresMobile());
        System.out.println(consultoria1.getTotalSalario());
        System.out.println(consultoria1.buscarDesenvolvedorPorNome(nome));
        
        System.out.println(desenvolvedor1.getSalario());
        
        System.out.println(desenvolvedorMobile1.toString());
        
    }
}
