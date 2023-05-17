package com.mycompany.avaliacao.continuada.bruno.takahashi;

public class Concessionaria {
    private String nome;
    private Integer quantidadeVendas;
    private Integer quantidadeDescontosAplicados;
    private Double totalVendido;
    
    Concessionaria(String nome){
        this.nome = nome;
        quantidadeVendas = 0;
        quantidadeDescontosAplicados = 0;
        totalVendido = 0.0;
    }
    
    public void aumentarEstoque(Veiculo veiculo, Integer quantidade){
        if(quantidade > 0){
            veiculo.setQuantidadeEstoque(veiculo.getQuantidadeEstoque() + quantidade);
        }
    }
    
    public void realizarVenda(Veiculo veiculo){
        if(veiculo.getQuantidadeEstoque() > 0 && veiculo.getValorTabela() > 0){
            veiculo.setQuantidadeEstoque(veiculo.getQuantidadeEstoque() - 1);
            totalVendido += veiculo.getValorTabela();
            quantidadeVendas++;
        }
    }
    
    public void realizarVenda(Veiculo veiculo, Double porcentagemDesconto){
        if(veiculo.getQuantidadeEstoque() > 0 && veiculo.getValorTabela() > 0 && porcentagemDesconto > 0){
            veiculo.setQuantidadeEstoque(veiculo.getQuantidadeEstoque() - 1);
            Double valorDesconto = veiculo.getValorTabela() * (porcentagemDesconto / 100.0);
            totalVendido += (veiculo.getValorTabela() - valorDesconto);
            quantidadeVendas++;
            quantidadeDescontosAplicados++;
        }
    }
    
    Double gerPercentualVendasComDesconto(){
        Double valor;
        if(quantidadeVendas > 0 && quantidadeDescontosAplicados > 0){
             valor = (quantidadeDescontosAplicados * 100.0) / quantidadeVendas;
        } else if(quantidadeVendas == quantidadeDescontosAplicados){
            valor = 100.0;
        } else{
            valor = 0.0;
        }
        return valor;
    }
    
    public String getNome(){
        return nome;
    }
    
    public Integer getQuantidadeVendas(){
        return quantidadeVendas;
    }
    
    public Integer getQuantidadeDescontosAplicados(){
        return quantidadeDescontosAplicados;
    }
    
    Double getTotalVendido(){
        return totalVendido;
    }
    
    @Override 
    public String toString(){
        return String.format("Nome: %s;\nQuantidade Vendas: %d;\nQuantidade Descontos Aplicados: %d;\nTotal Vendido: %.2f\n"
                , nome, quantidadeVendas, quantidadeDescontosAplicados, totalVendido);
    }
}
