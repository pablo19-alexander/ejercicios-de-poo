
import java.util.Scanner;


/*
Una clínica de maternidad necesita un sistema para determinar cuántos bebés han nacido recientemente.
Dicho sistema solicita al usuario capturar la cantidad de nacimientos (N), el nombre de cada bebé y su sexo
(implemente un ciclo do-while para validar la captura, siendo M para masculino y F para femenino).
Al final, debe imprimir la cantidad de bebés de cada sexo.
 */

/**
 *
 * @author pablo
 * codigo: 20201187152
 */
public class ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
        String genero, nombre; 
        int N,F=0,M=0,c =1;
        System.out.println(" señor usuario digite el numero de bebes nacidos");
        N= leer.nextInt();
        do{System.out.println("Nacimiento Numero #"+c);
            System.out.println("Ingrese el genero del bebe");   
            System.out.println("Si es femenino digite la letra f (miniscula)");
            System.out.println("Si es Masculino digite la letra m (minuscula)");
            genero= leer.next();
            
        if ("m".equals(genero)){
            M=M+1;
        }else {F=F+1;}
            System.out.println("digite el nombre del bebe");
            nombre=leer.next();
        
       c=c+1;
        } while (c<=N);
        
        System.out.println("CANTIDAD DE NACIDOS DEL GENERO MASCULINO: #"+M);
        System.out.println("CANTIDAD DE NACIDOS DEL GENERO FEMENINO:  #"+F);
    }
  
}
