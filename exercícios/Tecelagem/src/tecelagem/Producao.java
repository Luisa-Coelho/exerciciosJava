/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author fance
 */
public class Producao extends Pessoa{
    
    private int horasDiurnas, horasNoturnas;
       
    public Producao(String nome, String rg, double salario)
    {
        super(nome, rg, salario);
        horasDiurnas = 0;
        horasNoturnas = 0;
    }
    
    //métodos
    public void RegistrarHorasDiurnas(int horas)
    {
        horasDiurnas+=horas;
    }
    
    public void RegistrarHorasNoturnas(int horas)
    {
        horasNoturnas+=horas;
    }
    
    @Override
    public double salarioLiquido()
    {
        return (getSalarioBase() * (horasDiurnas + horasNoturnas)) + (getSalarioBase()*0.3*horasNoturnas);
    }
       
    @Override
    public void novoMes()
    {
        horasDiurnas = 0;
        horasNoturnas = 0;
    }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.println("""
                           
                           Horas Diurnas: """ + horasDiurnas + "\n" +
                "Horas Noturnas: " + horasNoturnas); 
    }
    
}///
