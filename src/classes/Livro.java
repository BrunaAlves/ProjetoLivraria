/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *código, titulo, fornecedor (editora), quantidade em estoque, valor unitário e data de publicação.
 * @author bruna
 */
public class Livro {
    private String titulo;
    private String fornecedor;
    private String quantidadeEstoque;
    private String valorUnitario;
    private String dataPublicacao;

    public Livro() {
    }

    public Livro(String titulo, String fornecedor, String quantidadeEstoque, String valorUnitario, String dataPublicacao) {
        this.titulo = titulo;
        this.fornecedor = fornecedor;
        this.quantidadeEstoque = quantidadeEstoque;
        this.valorUnitario = valorUnitario;
        this.dataPublicacao = dataPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", fornecedor=" + fornecedor + ", quantidadeEstoque=" + quantidadeEstoque + ", valorUnitario=" + valorUnitario + ", dataPublicacao=" + dataPublicacao + '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(String quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(String valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
    
    
}
