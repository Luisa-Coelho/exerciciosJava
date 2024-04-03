/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author fance
 */
public abstract class Pessoa {
    private String nome, rg;
    private double salarioBase;
    
    public Pessoa(String nome, String rg, double salarioBase)
    {
        setNome(nome);
        setRg(rg);
        setSalarioBase(salarioBase);
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        if(!nome.isBlank())
            this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public final void setRg(String rg) {
        if(!rg.isBlank())
            this.rg = rg;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public final void setSalarioBase(double salarioBase) {
        if(salarioBase > 0)
            this.salarioBase = salarioBase;
    }
    
    //métodos
    public abstract double salarioLiquido();
    public abstract void novoMes();
    
    public void hollerith()
    {
        System.out.println("Nome: " + nome + '\n' + 
                "RG: " + rg + '\n' +
                "Salário Base: " + salarioBase + '\n' +
                "Salário Líquido: " + salarioLiquido());
    }
    
    
    
}////
