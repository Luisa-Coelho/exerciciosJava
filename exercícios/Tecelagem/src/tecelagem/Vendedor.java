/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author fance
 */
public class Vendedor extends Pessoa {
    private int vendas;
    
    public Vendedor(String nome, String rg, double salario)
    {
        super(nome, rg, salario);
        vendas = 0;
    }
    
    //métodos
    
    public void registrarVenda(double valorVenda)
    {
        vendas+=valorVenda;
    }
    
    @Override
    public void novoMes()
    {
        vendas = 0;
    }
    
    @Override
    public double salarioLiquido()
    {
        return getSalarioBase() + (0.03 * vendas);
    }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.println("""
                           
                           Total das vendas:R$""" + vendas);  
    }
    
    
    
}
