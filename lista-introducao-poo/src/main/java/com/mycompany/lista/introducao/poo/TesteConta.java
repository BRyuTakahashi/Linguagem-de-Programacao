package com.mycompany.lista.introducao.poo;

public class TesteConta {
    public static void main(String[] args) {
        
        ContaBancaria conta1 = new ContaBancaria();
        String nomeConta1 = conta1.getNomeTitular();
        
        conta1.setNomeTitular("William");
        
        
        ContaBancaria conta2 = new ContaBancaria();
        conta2.setNomeTitular("Xampson");
        
   
        conta1.depositar(100.0);
        conta1.sacar(10.0);
        conta1.sacar(100.0);
        conta1.sacar(0.0);
        conta1.depositar(0.0);
        
        System.out.println("Eu não sou senhor do tempo mas eu sei que vai chover \nMe sinto muito bem quanto fico com você \nEu tenho habilidade de transformar histórias tristes virarem melodias");
        System.out.println("Vou vivendo meu dia a dia \nNa paz, na moral busco só sabedoria, aprendendo todo o dia \n Me espelho em você, corro junto com você \nVivo junto com você, faço tudo com você");
        System.out.println("Seguindo em frente com fé e atenção \nPorque quando a casa cai não da pra fraquejar \nQuem é guerreiro ta ligado que guerreiro é assim \nO tempo passa e a gente entende");
        System.out.println("Hoje sei realmente quem sou \nEu vi o tempo passar e pouco coisa mudar \n Então tomei um caminho diferente");
        System.out.println("Tanta gente equivocada, fazem mal uso da palavra \nFalam, falam mas não tem nada a dizer \nMas eu tenho o santo forte, é incrível minha sorte \nAgradeço o tempo todo ter encontrado você");
        
    }
}
