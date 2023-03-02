package com.mycompany.atividade02.ac01;

public class Idade {
    String classificaIdade (Integer idade){
        if(idade > 0 && idade <= 2){
            return "Bebê";
            
        } else if (idade >= 3 && idade <= 11){
            return "Criança";
            
        } else if (idade >= 12 && idade <= 19){
            return "Adolescente";
            
        } else if(idade >= 20 && idade <= 30){
            return "Jovem";
            
        } else if(idade >= 31 && idade <= 60){
            return "Adulto";
            
        } else {
            return "Idoso";
        }
    }
}
