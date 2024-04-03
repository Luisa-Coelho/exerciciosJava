/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author fance
 */
public class Administracao extends Pessoa {
    private int faltas;
    
    public Administracao(String nome, String rg, double salario)
    {
        super(nome, rg, salario);
        faltas = 0;
    }
    
    //métodos
    
    public void registrarFalta()
    {
        faltas++;
    }
    
    @Override
    public void novoMes()
    {
        faltas = 0;
    }
    
    @Override
    public double salarioLiquido()
    {
        return getSalarioBase() - (getSalarioBase() * faltas/30);
    }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.println("""
                           
                           Faltas: """ + faltas);  
    }
    
    
}////
