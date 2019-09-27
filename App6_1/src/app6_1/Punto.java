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
public class Punto extends FigGeo{
    private double x; 
    private double y;
    
    public Punto()
    {
        super();
        this.setX(0);
        this.setY(0);
    }
    
    public Punto(String color,boolean relleno,double x,double y)
    {
        super(color,relleno);
        this.setX(x);
        this.setY(y);
    }
    
    public Punto(double x,double y)
    {
        this.setX(x);
        this.setY(y);
    }
    
    public String toString()
    {
        return "Punto -> " + super.toString() + " Coordenadas: (" + getX() + "," + getY() + ")" + "|";
    }
    
    @Override
    public boolean equals(Object object)
    {
        if(object instanceof Punto)
        {
            Punto otro = (Punto)object;
            if(getX() == otro.getX() && getY() ==  otro.getY())
                return true;
            else return false;
        }      
        return false;    
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }
}
