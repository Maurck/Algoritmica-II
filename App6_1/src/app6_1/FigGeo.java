
package app6_1;


public class FigGeo 
{
    String color;
    boolean relleno;
    
    
    FigGeo()
    {
        color = "Azul";
        relleno = false;
    }
    
    FigGeo(String color,boolean relleno)
    {
        this.color = color;
        this.relleno = false;
    }
    
    @Override
    public String toString()
    {
        return "Figura Geometrica: " +  "Color: " + getColor() +"|"+ " Relleno: " + isRelleno() + "|";
    }
    
    @Override
    public boolean equals(Object object)
    {
        if(object instanceof FigGeo)
        {
            FigGeo otro = (FigGeo)object;
            if(this.isRelleno() == otro.isRelleno())
                return true;
            //else return false;
        }      
        return false;     
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the relleno
     */
    public boolean isRelleno() {
        return relleno;
    }

    /**
     * @param relleno the relleno to set
     */
    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

}
