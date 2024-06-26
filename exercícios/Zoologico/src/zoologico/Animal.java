/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author fance
 */
public abstract class Animal implements FeatureAnimais
{
    private String especie, nome;
    private int intervaloRefeicoes;
    private boolean alimento;

    public Animal(String especie, String nome, int intervaloRefeicoes) {
        setEspecie(especie);
        setNome(nome);
        setIntervaloRefeicoes(intervaloRefeicoes);
        alimento = false;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIntervaloRefeicoes() {
        return intervaloRefeicoes;
    }

    public void setIntervaloRefeicoes(int intervaloRefeicoes) {
        this.intervaloRefeicoes = intervaloRefeicoes;
    }
   
    ////
    
    public abstract void seAlimentou();
    
}//
