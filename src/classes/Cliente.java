/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import classes.Endereco;


/**
 *
 * @author alunoces
 */
public class Cliente {
    private String cpf;
    private String nome;
    private String estadocivil;
    private String telefone;
    private String email;
    private Endereco endereco;

    public Cliente(String cpf, String nome, String estadocivil, String telefone, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.estadocivil = estadocivil;
        this.telefone = telefone;
        this.email = email;
    }

    public Cliente() {
        endereco = new Endereco();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    @Override
    public String toString() {
        return "Cliente{" 
                + "cpf=" + cpf 
                + ", nome=" + nome 
                + ", estadocivil=" + estadocivil 
                + ", telefone=" + telefone 
                + ", email=" + email 
                + ", Logradouro=" + getEndereco().getLogradouro()
                + ", Complemento=" + getEndereco().getComplemento()
                + ", Cidade=" + getEndereco().getCidade()
                + ", Estado=" + getEndereco().getEstado()
                + ", CEP=" + getEndereco().getCep()                
                + '}';
    }
    
    
    
}
