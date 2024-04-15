/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author fance
 */
public class ListaFuncionarios {
    
    private Pessoa lista[];
    private int contador;
    
    public ListaFuncionarios(int tamanho)
    {
        lista = new Pessoa[tamanho];
        contador = 0;
    }
    
    public boolean add(Pessoa p)
    {
        if(contador >= lista.length) return false;
        lista[contador] = p;
        contador++;
        return true;
    }
    
    public boolean registrarVenda(int index, double valor)
    {
        if(index >= contador) return false;
        if(lista[index] instanceof Vendedor)
        {
            Vendedor v = (Vendedor)lista[index];
            v.registrarVenda(valor);
        }
        return false;
    }
    
    public boolean registrarFalta(int index)
    {
        if(index >= contador) return false;
        if(lista[index] instanceof Administracao)
        {
            Administracao a = (Administracao)lista[index];
            a.registrarFalta();            
        }
        return false;
    }
    
        public boolean registrarHorasDiurnas(int index, int horas)
    {
        if(lista[index] instanceof Producao)
        {
            Producao p = (Producao)lista[index];
            p.RegistrarHorasDiurnas(horas);
            return true;
        }
        return false;
    }
    
    public boolean registrarHorasNoturnas(int index, int horas)
    {
        if(lista[index] instanceof Producao)
        {
            Producao p = (Producao)lista[index];
            p.RegistrarHorasNoturnas(horas);
            return true;
        }
        return false;
    }
    
    
}///
