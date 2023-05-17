package com.mycompany.avaliacao.continuada.bruno.takahashi;

public class Veiculo {

    private Integer id;
    private String modelo;
    private Double valorTabela;
    private Integer quantidadeEstoque;
    
    Veiculo(Integer id, String modelo){
        this.id = id;
        this.modelo = modelo;
        valorTabela = 0.0;
        quantidadeEstoque = 0;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setValorTabela(Double valorTabela) {
        this.valorTabela = valorTabela;
    }

    public Double getValorTabela() {
        return valorTabela;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    @Override
    public String toString() {
        return String.format("Id: %d;\nModelo: %s;\nValor Tabela: %.2f;\nQuantidade Estoque: %d;\n", id, modelo, valorTabela, quantidadeEstoque);
    }
}
