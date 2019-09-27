//MULTIFUENTE: Herencia,aplicar el modificador static y el modificador equals para comparar
package app6_1;

public class App6_1 {

    public static void main(String[] args) {
       Object O1;
    
       FigGeo f1 = new FigGeo();
       Punto p1 = new Punto("Amarillo",false,4.2,5.2);
       Punto p2 = new Punto("Amarillo",false,4.2,5.2);
       System.out.println(f1);
        System.out.println(p1);
        System.out.println(p2);
        
        if(p1.equals(p2))
        {
            System.out.println("Los puntos son iguales");
        }
        else
        {
               System.out.println("Los puntos no son iguales");
        }
        
        Rectangulo r1 = new Rectangulo(3.0,4.0,1,2);
        Rectangulo r2 = new Rectangulo(3.0,4.0,2,1);
        
        System.out.println(r1);
        System.out.println(r2);
        
        if(r1.equals(r2))
        {
            System.out.println("Los rectangulos son iguales");
        }
        else
        {
               System.out.println("Los rectangulos no son iguales");
        }
        
       Cuadrado c1 = new Cuadrado();
       
        System.out.println(c1);
        
        Cubo cubo1 =  new Cubo(2.0,3.0,5);
        
        System.out.println(cubo1);
        
       
    }
    
    
    
}
