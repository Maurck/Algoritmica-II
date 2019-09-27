package app6_1;

public class Rectangulo extends Punto {
    private double largo; //largo y ancho
    private double ancho; //largo y ancho
    
    public Rectangulo()
    {
        super();
        this.setLargo(2);
        this.setAncho(1);
    }
    
    public Rectangulo(double x,double y,double largo,double ancho)
    {
        super(x,y);
        this.setLargo(largo);
        this.setAncho(ancho);      
    }
    
    public Rectangulo(double largo,double ancho)
    {
        super();
        this.setLargo(largo);
        this.setAncho(ancho);      
    }
    
    @Override
    public String toString()
    {
        return "Rectangulo -> " + super.toString() + " Dimensiones: " + this.getLargo() + " x " + this.getAncho() + "|" +  " Area: " + this.GetArea();
    }
    
    public double GetArea()
    {
        return getLargo() * getAncho();
    }
    
    @Override
    public boolean equals(Object object)
    {
        if(object instanceof Rectangulo)
        {
            Rectangulo otro = (Rectangulo)object;
            if(this.GetArea() == otro.GetArea())
                return true;
            else return false;
        }
        return false;
    }

    /**
     * @return the largo
     */
    public double getLargo() {
        return largo;
    }

    /**
     * @param largo the largo to set
     */
    public void setLargo(double largo) {
        this.largo = largo;
    }

    /**
     * @return the ancho
     */
    public double getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
}
