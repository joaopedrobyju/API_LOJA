package com.loja;

import java.util.ArrayList;
import java.util.List;

public class TabelaProdutos {
    List<Produto> produtos = new ArrayList<>();

    /**
     * No construtor a Lista de Produtos
     * Será preenchida :)
     */
    public TabelaProdutos() {
        Produto caneta = new Produto(1, "Caneta BIC", "Caneta BIC na cor azul", 1.99);
        Produto borracha = new Produto(2, "Borracha branca", "boraccha branca comum", 3.99);
        Produto lapis = new Produto(3, "Lapis Faberl Castell", "Lapis Faber Castell comum", 2.99);
        Produto apontador = new Produto(4, "Apontador", "Apontador comum com reservatório", 7.99);
        Produto caderno = new Produto(5, "Caderno espiral", "Caderno Espiral de 96 folhas", 17.99);
        Produto pasta = new Produto(6,"Pasta L", "Pasta L da Faber Castell", 25.99);
        Produto canetinha = new Produto(7,"Canetinha de colorir", "Canetinha de colorir da Faber Castell", 4.99);
        Produto regua = new Produto(8, "Régua de 30 cm", "Régua de 30 cm da BIC", 10.99);
        Produto tinta = new Produto(9, "Caixa de tinta com 12 cores", "Caixa de tinta de 12 cores da Tilibra", 20.99);
        Produto giz = new Produto(10, "Giz de Cera", "Caixa de Giz de Cera de 12 cores da Tilibra", 20.99);

        this.produtos.add(caneta);
        this.produtos.add(borracha);
        this.produtos.add(lapis);
        this.produtos.add(apontador);
        this.produtos.add(caderno);
        this.produtos.add(pasta);
        this.produtos.add(canetinha);
        this.produtos.add(regua);
        this.produtos.add(tinta);
        this.produtos.add(giz);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    /**
     * Método que retorna todos os produtos da Lista
     */
    public List<Produto> buscarTdosOsProdutos(){
        return this.getProdutos();
    }


    /**
     * Método que busca o Produto pelo seu ID
     * Caso não encontre vai retornar nulo
     * @param produtoId
     * @return
     */
    public Produto buscarProdutoPeloId(int produtoId){
        Produto produtoProcurado = null;
        for(Produto p: this.produtos){
            if (p.getId() == produtoId){
                produtoProcurado = p;
                break;
            }
        }
        return produtoProcurado;
    }

    public Produto cadastrarNovoPrdouto( Produto novoPrdouto){
        // 10(Id) - 1(Index) = 9
        int ultimoIndex = this.produtos.size() - 1;

        // Produto giz = new Produto(10, "Giz de Cera", "Caixa de Giz de Cera de 12 cores da Tilibra", 20.99);
        Produto ultimoProduto = this.produtos.get(ultimoIndex);

        // 10(Id) + 1(Index) = 11
        int proximoId = ultimoProduto.getId() + 1;

        novoPrdouto.setId(proximoId);
        this.produtos.add(novoPrdouto);
        return novoPrdouto;

    }

    /**
     * Método que atualiza um produto
     * Primeiro busca o produto a atualizar pelo ID
     * Depois atribui as novas informações: nome, descrição, valor unitário
     * Finalmente salva o produto atualizado
     * @param produtoId
     * @param produtoAtualizar
     */
    public void atualizarProduto(int produtoId, Produto produtoAtualizar){
        Produto produtoProcurado = this.buscarProdutoPeloId(produtoId);
        if(produtoProcurado != null){
            produtoProcurado.setNome(produtoAtualizar.getNome());
            produtoProcurado.setDescricao(produtoAtualizar.getDescricao());
            produtoProcurado.setValorUnitario(produtoAtualizar.getValorUnitario());
        }

    }








}
