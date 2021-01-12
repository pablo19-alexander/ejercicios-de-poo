
import java.util.Scanner;

/*
Una compañía ha tenido un excelente año y desea premiar a sus empleados con un aumento de salarios.
Los sueldos deben ajustarse a la siguiente forma:

Sueldo actual	      Aumento
Hasta $9,000	        20 %
$9,001  -  $13,000	17 %
$13,001 -  $18,000	12 %
Sobre $18,000	         6 %

La compañía tiene 50 empleados. Diseñe un algoritmo en diagrama de flujo que lea el nombre 
de cada empleado y su sueldo actual, y que imprima el nombre, el sueldo actual y el sueldo aumentado.
Al final de la lista debe proporcionar también, el monto total de la nómina actual y el monto total
de la nueva nómina que incluye los aumentos mencionados.

 */

/**
 *
 * @author pablo
 * codigo: 20201187152
 */
public class ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer= new Scanner (System.in);
        
        int salario, aumento=0,nomina=0,Nnomina=0;
        String [][] info= new String [50][3];
        
        for(int c=0;c<50;c++){
        
            System.out.println("digite su nombre: ");
            info[c][0]= leer.next();
            System.out.println("digite su sueldo: ");
            salario= leer.nextInt();
            info[c][1]=String.valueOf(salario); 
            
            if (salario<=9000){
           aumento=(((salario*20)/100)+salario);
           info[c][2]=String.valueOf(aumento);
            
            }else{
                if(salario>9000 && salario<=13000){
                 aumento=(((salario*17)/100)+salario);
                info[c][2]=String.valueOf(aumento);
            
            }else{
                if(salario>=13001 && salario<=18000){
                 aumento=(((salario*12)/100)+salario);
                info[c][2]=String.valueOf(aumento);
            
            }else{
                if( salario>18000){
                 aumento=(((salario*6)/100)+salario);
                info[c][2]=String.valueOf(aumento);
            
            }
            }
            }
            }
          nomina=nomina+salario;
          Nnomina=Nnomina+aumento;
        
        }
        
       for (int j=0;j<50;j++){
          System.out.println("__________________________");
          System.out.println("su nombre es: "+info[j][0]);
          System.out.println("su sueldo actual es: "+info[j][1]);
          System.out.println("su sueldo con aumento es: "+info[j][2]);
    
    } 
        System.out.println("nomina actual: "+nomina);
        System.out.println("nomina con aumento: "+Nnomina);
        
    }
}
    

