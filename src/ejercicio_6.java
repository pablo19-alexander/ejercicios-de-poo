
import java.util.Scanner;

/*
13.Leer los siguientes datos de los empleados de una compañía: Nombre, Sueldo, Departamento. 
Calcule lo siguiente:

a)Cuántos empleados hay en cada departamento.
b)Cuántos empleados ganan más de $ 8,000

Existen 5 departamentos:
Finanzas, Sistemas, Producción, Ventas y Mantenimiento. 
Considere las claves necesarias.
 */

/**
 *
 * @author pablo
 * codigo: 20201187152
 */
public class ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
       int emple, c, sueldo=0,sl=0,finanzas=0,sistemas=0, produccion=0, ventas=0,mantenimiento=0;
       String nombre,depa;
        System.out.println("diguite el numero de empleados de la compañia");
        emple = entrada.nextInt();
        
        for (c=1;c<=emple;c++){
            System.out.println("ingrese el nombre del empleado  "+c);
            nombre =entrada.next();
            System.out.println("cuanto es su sueldo");
            sueldo=entrada.nextInt();
            if (sueldo>=8000){
                sl++;
            }
            System.out.println("a que departamento pertenece");
            depa=entrada.next();
            if ("finanzas".equals(depa)){
            finanzas++;
            }else{if ("sistemas".equals(depa) ){
                sistemas++;
            }else {if("produccion".equals(depa) ){
            produccion++;
            }else {if ("ventas".equals(depa) ){
                ventas++;
            }else {if ("mantenimiento".equals(depa)){
                mantenimiento++;
            }
            }
            }
            }
                    
        }
                
    }
     System.out.println("el numero de empleados del departamento de finanzas es  "+finanzas);
                System.out.println("el numero de empleados del departamento de sistemas es  "+sistemas);
                System.out.println("el numero de empleados del departamento de produccion es  "+produccion);
                System.out.println("el numero de empleados del departamento de ventas es  "+ventas);
                System.out.println("el numero de empleados del departamento de mantenimiento es  "+mantenimiento);
                System.out.println("el numero de empleados que ganan mas de 8000 son  "+sl);   
    
}
}
    
    

