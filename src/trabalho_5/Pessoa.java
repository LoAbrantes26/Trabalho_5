/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_5;

/**
 *
 * @author furnas
 */
public class Pessoa {
    private String nome;
    private String cpf;
    
    //construtor
    public Pessoa (String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }   
    //método
    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
    }
        
    
    
    
}
