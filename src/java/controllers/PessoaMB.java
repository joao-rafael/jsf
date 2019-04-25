/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;


import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import models.Pessoa;

/**
 *
 * @author aluno
 */
@ManagedBean
@ViewScoped
public class PessoaMB {
    
    private Pessoa pessoa = new Pessoa();
    private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public PessoaMB() {
        
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    
    public void cadastraPessoa(){
        pessoas.add(pessoa);
        pessoa = new Pessoa();
    }
    
}
