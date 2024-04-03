/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faculdade;

/**
 *
 * @author fance
 */
// Luísa Fancelli Coelho
// RA 0040482112039

public class Faculdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Funcionario f1 = new Funcionario("Luis", "1386908", 1, "mkt", 1789.10);
        Professor p1 = new Professor("Maria", "17589574", 0, "ADS");
        
        p1.diasFaltados();
        f1.faltou();
        f1.faltou();
        
        p1.hollerith();
        f1.hollerith();
        
        p1.zerarMes();
        f1.zerarMes();
    }
    
}
