package school.sptech.projeto1.heranca;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    
    List<Produto> produtos;

    public Carrinho() {
        produtos = new ArrayList<>();
    }
    
    /**
     * Adiciona um Produto novo no carrinho.Caso o valor seja null o Produto não deve ser adicionado
 
 Parâmetro produto: Novo Produto a ser adicionado
     * @param produto
     */
    public void adicionarProduto(Produto produto) {
        if(produto.getPreco() != null){
            System.out.println("Produto adicionado ao carrinho");
            produtos.add(produto);
        } else{
            System.out.println("Não foi possível adicionar o produto ao carrinho");
        }
    }

    /**
     * Remove um Produto do carrinho pelo índice.Caso o índice do produto for inválido o método não deve lançar
 um erro de execução

 Parâmetro indice: Índice do Produto que será removido
     * @param indice
     */
    public void removerProduto(Integer indice) {
        if (indice == null) {
            System.out.println("Não foi possível remover o produto");
        } else {
            for (int i = 0; i < produtos.size(); i++) {
                if(indice.equals(produtos.get(i).getId())){
                    produtos.remove(i);
                }
            }
        }
    }
    
    /**
     * Calcula o valor total de todos os itens do carrinho.Retorna valor total do carrinho
     *
     * @return
     */
    public Double calcularTotal() {
        Double valorTotal = 0.0;
        for(Integer i = 0; i < produtos.size(); i++){
            valorTotal += produtos.get(i).getPreco();
        }
        return valorTotal;
    }
    
    /**
     * Calcula o valor das parcelas de acordo com o número de vezes que
     * o usuário deseja parcelar.Parâmetro vezes: Número de vezes que o usuário deseja parcelar
 Retorna total do carrinho parcelado
     *
     * @param vezes
     * @return
     */
    public Double parcelarCompra(Integer vezes) {
        Double valorTotal = 0.0;
        for(Integer i = 0; i < produtos.size(); i++){
            valorTotal += produtos.get(i).getPreco();
        }
        return valorTotal / vezes;
    }
    
    /**
     * Encontra um Produto com o índice desejado.Caso o índice não seja encontrado retorne null
 
 Parâmetro index: Índice do Produto
 Retorna Produto encontrado
     * @param index
     * @return 
     */
    public Produto findProdutoPeloIndice(Integer index) {
        if(index != null){
            for(Integer i = 0; i < produtos.size(); i++){
                if(index == produtos.get(i).getId()){
                    return produtos.get(i);
                }
            }
        }
        return null;
    }
    
    /**
     * Encontra um Produto com o nome desejado ignorando letras 
     * maiúsculas e minúsculas.Caso um Produto não seja encontrado retorne null
 
 Parâmetro nome: Nome do Produto
 Retorna Produto encontrado
     *
     * @param nome
     * @return 
     */
    public Produto findProdutoPeloNome(String nome) {
        for(Integer i = 0; i < produtos.size(); i++){
            if(nome.equalsIgnoreCase(produtos.get(i).getNome())){
                return produtos.get(i);
            }
        }
        return null;
    }
    
    /**
     * Encontra todos os Produto de uma determinada categoria
     * ignorando letras maiúsculas e minúsculas.Caso não encontre nenhum Produto devolva uma lista vazia
 
 Parâmetro categoria: Categoria desejada
 Return Produtos encontrados
     *
     * @param categoria
     * @return
     */
    public List<Produto> findProdutoPorCategoria(String categoria) {
        List<Produto> produtoCategoria = new ArrayList<>();
        for(Integer i = 0; i < produtos.size(); i ++){
            if(categoria.equalsIgnoreCase(produtos.get(i).getCategoria())){
              produtoCategoria.add(produtos.get(i));  
            }
        }
        return produtoCategoria;
    }
    
    /**
     * Encontra todos os ProdutoInternacional presentes no Carrinho.Caso não encontre nenhum ProdutoInternacional devolva uma lista vazia
 
 Retorna Produtos internacionais encontrados
     * @return
     */
    public Integer countProdutosInternacionais() {
        Integer produtosInternacionais = 0;
        for(Integer i = 0; i < produtos.size(); i++){
            if(produtos.get(i) instanceof ProdutoInternacional){
                produtosInternacionais++;
            }
        }
        return produtosInternacionais;
        
    }

    public List<Produto> getProdutos() {
        return null;
    }
}
