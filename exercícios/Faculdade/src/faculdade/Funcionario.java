/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade;

/**
 *
 * @author fance
 */
public class Funcionario extends Pessoa
{
    private String departamento;
    private int faltas;
    private double salario;

    public Funcionario(String nome, String rg, int filhos, String departamento, double salario) 
    {
        super(nome, rg, filhos);
        setDepartamento(departamento);
        faltas = 0;
        setSalario(salario);
    }    
    
    public final void setDepartamento(String departamento) 
    {
         if(departamento.isBlank())
            System.out.println("Departamento não pode estar em branco");
        else
            this.departamento = departamento;
    }
    
    /**
     *
     * @param salario
     */
    public final void setSalario(double salario) 
    {
        if(salario < 0)
            System.out.println("Salário inválido");
        else
            this.salario = salario;
    }
  
    public final String getDepartamento()
    {
        return departamento;
    }
    
    //métodos
    
    public void faltou()
    {
        faltas++;
    }
    
    @Override
    public double calcularSalario()
    {
        return (salario - (salario * faltas/20) + 42 + (100 * getFilhos()));
    }
    
    @Override
    public void zerarMes()
    {
        faltas = 0;
    }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.println("Salario Bruto: " + salario);
    }
    
}//////
