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
    private int codigo;
    private String titulo;
    private String fornecedor;
    private int quantidadeEstoque;
    private float valorUnitario;
    private String dataPublicacao;

    public Livro() {
    }

    public Livro(int codigo, String titulo, String fornecedor, int quantidadeEstoque, float valorUnitario, String dataPublicacao) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.fornecedor = fornecedor;
        this.quantidadeEstoque = quantidadeEstoque;
        this.valorUnitario = valorUnitario;
        this.dataPublicacao = dataPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" + "codigo=" + codigo + ", titulo=" + titulo + ", fornecedor=" + fornecedor + ", quantidadeEstoque=" + quantidadeEstoque + ", valorUnitario=" + valorUnitario + ", dataPublicacao=" + dataPublicacao + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
    
    
}
