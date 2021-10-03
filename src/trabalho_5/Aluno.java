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
public class Aluno extends Pessoa{
    private int ra;
    public Aluno (String nome, String cpf, int ra){
        super(nome, cpf);
        this.ra = ra;
    }      
    
    @Override
    public void imprime(){
        super.imprime();
        System.out.println("ra: " + this.ra);
        
    }
    
}
