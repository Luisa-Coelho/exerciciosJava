/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tecelagem;

/**
 *
 * @author fance
 */
public class Tecelagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Administracao a1 = new Administracao("Jorge", "1890667", 2500);
        Vendedor v1 = new Vendedor("Amanda", "19050690", 2000);
        Producao p1 = new Producao("Leo", "129840-2", 66.5);
        
        a1.registrarFalta();
        a1.registrarFalta();
        v1.registrarVenda(10);
        v1.registrarVenda(250);
        v1.registrarVenda(750);
        p1.RegistrarHorasDiurnas(5);
        p1.RegistrarHorasNoturnas(7);
        
        a1.hollerith();
        v1.hollerith();
        p1.hollerith();
        
        a1.novoMes();
        v1.novoMes();
        p1.novoMes();
    }
    
}
