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
public class Professor extends Pessoa{
    
   private float salario;
   
   public Professor (String nome, String cpf, float salario){
           super(nome, cpf);
           this.salario = salario;
           }
   
public void imprime(){ 
    super.imprime();
    System.out.println("Salario: " + this.salario);
    
}
}
        
