
import java.util.Scanner;

/*
El sistema meteorológico local requiere un sistema para capturar la temperatura
promedio de cada día de la semana e imprimir el nombre del día y un mensaje
de la percepción de la temperatura de acuerdo con el valor capturado según 
la siguiente tabla:

Temperatura	Mensaje
Menor o igual que cero	Congelante
1 a 10°C	Muy frío
11 a 20°C	Frío
21 a 24°C	Templado
25 a 29°C	Agradable
30 a 35°C	Caliente
36°C o más	Muy caliente

 */

/**
 *
 * @author pablo
 * codigo: 20201187152
 */
public class ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada= new Scanner (System.in);
        int temperatura,c=1;
        String dia;
        for (c=1;c<=7; c++){
            System.out.println("ingre el dia en el que va a registrar la temperatura  "+c);
            dia =entrada.next();
            System.out.println("ingrese la temperatura");
            temperatura=entrada.nextInt();
            
            if (temperatura <= 0) {
                System.out.println("La temperatura  es congelante");
            } else if (temperatura >= 1 && temperatura <= 10) {
                System.out.println("La temperatura es muy frio");
            } else if (temperatura >= 11 && temperatura <= 20) {
                System.out.println("La temperatura es frio");
            } else if (temperatura >= 21 && temperatura <= 24) {
                System.out.println("La temperatura es templado");
            } else if (temperatura >= 25 && temperatura <= 29) {
                System.out.println("La temperatura es agradable");
            } else if (temperatura >= 30 && temperatura <= 35) {
                System.out.println("La temperatura es caliente");
            } else if (temperatura >= 36) {
                System.out.println("La temperatura es muy caliente");
            }
            
        }
    }
    
}
