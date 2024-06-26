/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author fance
 */
public class Tigre extends Animal {
    
    private double velocidade;
    private boolean alimento;

    public Tigre(String especie, String nome, double velocidade, int intervaloRefeicoes) {
        super(especie, nome, intervaloRefeicoes);
        setVelocidade(velocidade);
        alimento = false;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    
    ////
    
    public void seAlimentou()
    {
        alimento = true;
    }
       
    
    
    
}///
