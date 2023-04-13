package com.mycompany.ac2.segunda.atividade.petshop;

public class TestePetShop {
    public static void main(String[] args) {
        PetShop loja1 = new PetShop("Amigos Pet");
        Pet pet1 = new Pet("Luffy", "Maltes");
        Pet pet2 = new Pet("Yumi", "Gato");
        
        loja1.darBanho(pet1, 50.0);
        loja1.darBanho(pet2, 25.50);
        
        loja1.darBanho(pet1, 35.0, 10);
        System.out.println(pet1.toString());
        System.out.println(pet2.toString());
        System.out.println(loja1.toString());
    }
}
