/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app6_1;

/**
 *
 * @author LaboratorioFISI
 */
public class Cubo extends Cuadrado{
    private double arista;
    
    public Cubo()
    {
        super();
        this.setArista(1);
    }
    
    public Cubo(double x,double y,double arista)
    {
        super(x,y,arista);
        this.setArista(arista);
    }
    
    @Override
    public String toString()
    {
        return "Cubo -> " + super.toString() + "|" + " Arista: " + getArista() + "|" + " Volumen: " + GetVolumen(); 
    }
    
    @Override
    public double GetArea()
    {
        return super.GetArea() * 6;
    }
    
    public double GetVolumen()
    {
        return GetArea() * GetArea() * GetArea();
    }

    /**
     * @return the arista
     */
    public double getArista() {
        return arista;
    }

    /**
     * @param arista the arista to set
     */
    public void setArista(double arista) {
        this.arista = arista;
    }

}
