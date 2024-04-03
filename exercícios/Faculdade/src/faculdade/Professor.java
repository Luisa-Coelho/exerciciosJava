/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade;

/**
 *
 * @author fance
 */
public class Professor extends Pessoa
{
    private String curso;
    private double horaAula;
    private int diasTrabalhados;
    public Professor(String nome, String rg, int filhos, String curso)
    {
        super(nome, rg, filhos);
        setCurso(curso);
        horaAula = 53.40;
        diasTrabalhados = 20;
        //setSalario(salario);
    }

    public final void setCurso(String curso) 
    {
        curso = curso.toLowerCase();
        if (!curso.matches("ads") && !curso.matches("adm"))
            System.out.println("Nao existe no catalogo...");
                        
        else
            this.curso = curso;                       
    }

    public String getCurso() 
    {
        return curso;
    }
    
    
   ////métodos
    
    @Override
    public double calcularSalario()
    {
        return horaAula * diasTrabalhados + (100 * getFilhos());
    }
    
    public void diasFaltados()
    {
       diasTrabalhados-=1;
    }
    
    @Override
    public void zerarMes()
    {
        diasTrabalhados = 20;
        }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.println("Hora-aula: " + horaAula + "\n" + "Dias trabalhados: "+ diasTrabalhados
        );
    }

    
    
    
}/////
