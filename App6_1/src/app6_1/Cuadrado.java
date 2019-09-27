
package app6_1;

public class Cuadrado extends Rectangulo{
    private double lado;
    
    public Cuadrado()
    {
        super(1,1);
    }
    
    public Cuadrado(double x,double y,double lado)
    {
        super(x,y,lado,lado);
    }
    
    public Cuadrado(double lado)
    {
        super(lado,lado);
    }
    
    @Override
    public String toString()
    {
        return "Cuadrado -> " + super.toString();
    }
    
    @Override
    public double GetArea()
    {
        return super.GetArea();
    }

    /**
     * @return the lado
     */
    public double getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(double lado) {
        this.lado = lado;
    }
}
