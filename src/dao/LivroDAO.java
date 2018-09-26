/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Livro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bruna
 */
public class LivroDAO {
    private List<Livro> lista = null;

    public LivroDAO() {
        lista = new ArrayList<Livro>();
    }
    
    public void adicionarLivro(Livro livro){
        lista.add(livro);
        
    }
    
    public Livro buscarLivro(int codigo){
        Livro liv = null;
        
        for(Livro livro: lista){
            if(livro.getCodigo() == codigo){
                liv = livro;
            }
        }
        
        return liv;
        
    }
    
    public void removerLivro(int codigo){
        Livro liv = this.buscarLivro(codigo);
        
        if(liv != null){
            lista.remove(liv);
        }
    }
    
    public void alterarLivro(Livro livro){
        Livro liv = buscarLivro(livro.getCodigo());
        
        int ind = lista.indexOf(liv);
        lista.set(ind, liv);
    }
    
    public List<Livro> todosLivros(){
        return lista;
    }
}
