/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade;

/**
 *
 * @author fance
 */
public abstract class Pessoa 
{
    private String nome, rg;
    private double salario;
    private int filhos;
    
    public Pessoa(String nome, String rg, int filhos) 
    {
        setNome(nome);
        setRg(rg);
        setFilhos(filhos);
    }

   public final void setNome(String nome) 
    {
        if(nome.isBlank())
            System.out.println("Nome não pode estar em branco");
        else
            this.nome = nome;
    }

    public final void setRg(String rg) 
    {
         if(rg.isBlank())
            System.out.println("RG não pode estar em branco");
        else
            this.rg = rg;
    }

    public final void setFilhos(int filhos) 
    {
        if(filhos < 0)
            System.out.println("Quantidade de filhos não pode ser negativa");
        else
            this.filhos = filhos;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public int getFilhos() {
        return filhos;
    }
    
    //métodos
    public abstract double calcularSalario();
    public abstract void zerarMes();
    
    public void hollerith()
    {
        System.out.println("Nome: " + nome + "\n" +
                "CPF: " + rg + "\n" +
                "Filhos: " + filhos + "\n" +
                "Salario Liquido: " + calcularSalario());
    }
    
}/////
