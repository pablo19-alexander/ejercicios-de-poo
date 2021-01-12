
import java.util.Scanner;

/*
La casa del adulto mayor tiene 37 personas registradas y requiere un reporte de
los adultos con más de 85 años. Para ello implementa un sistema en el que se capturan
el nombre y la edad de cada persona e imprime los datos de quienes cumplen
con la condición solicitada.
 */

/**
 *
 * @author pablo
 * codigo: 20201187152
 */
public class ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner leer= new Scanner(System.in);
       int  edad;
       
       String nombre;
        
        
        String [][]reporte = new String [37][2]; 
 
       for (int c=0;c<37;c++){
           System.out.println("digite el nombre #"+(c+1));
           nombre=leer.next();
           System.out.println("digite su edad: ");
           edad=leer.nextInt();
           
           if(edad>85){
           
           reporte [c][0] = nombre;
           reporte [c][1] = String.valueOf(edad); 
           }
           
           
       }
           
          System.out.println("los adultos mayores a 85 años son: "); 
          
       for(int i=0;i<37;i++){ 
           
           if( (reporte[i][0] != null) && (reporte[i][1] != null)){
           System.out.println("_________________________________________________");  
           System.out.println("Nombre : "+reporte[i][0]+" numero #"+(i+1));
           System.out.println("Edad: "+reporte[i][1]);
               
       }       
       }
       System.out.println("_____________________________________________________");
        
    }
}
    

