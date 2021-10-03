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
public class Trabalho_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Aluno a1 = new Aluno("João", "123456789", 11111);
        a1.imprime();
        
        Professor p1 = new Professor("José" , "140322" , 5000f);
        p1.imprime();
        
        Pessoa pe1 = new Pessoa("Lorena", "1468447");
        pe1.imprime();
    }
    
        
    
    
}
