
import java.util.Scanner;

/*
Una heladería desea obtener un reporte semanal de ventas. 
Para ello debe capturar en un sistema todas las facturas de ventas realizadas.
Cada factura contiene la cantidad y el sabor de las paletas vendidas. 
Los sabores y los precios son: limón ($2500), nuez ($2800), lulo ($2600), fresa ($2000) y crema ($3000).
El sistema debe imprimir la cantidad de paletas vendidas de cada sabor, el valor vendido y la venta total.
Considere que una factura puede tener varias paletas de diferentes sabores.
 */

/**
 *
 * @author pablo
 */
public class ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada= new Scanner(System.in);
       String sabor;  
       int l = 0, n = 0, lu = 0, f = 0, c = 0; 
       int limon = 2500;
       int nuez = 2800;
       int lulo = 2600;
       int fresa = 2000;
       int crema = 3000;
       int plimon, pnuez, plulo, pfresa, pcrema;
       
        System.out.println("¿cuantas paletas ha vendido en la semana?");
        int paletas = entrada.nextInt();
        for (int i = 1; i <= paletas; i++) {
            System.out.println("que sabores vendio");
            sabor = entrada.next();
            if (sabor.equalsIgnoreCase("limon")) {
                sabor = "limon";
                l++;
            } else if (sabor.equalsIgnoreCase("nuez")){
                sabor = "nuez";
                n++;
            }else if (sabor.equalsIgnoreCase("lulo")){
                sabor = "lulo";
                lu++;
            }else if (sabor.equalsIgnoreCase("fresa")){
                sabor = "fresa";
                f++;
            }else if (sabor.equalsIgnoreCase("crema")){
                sabor = "crema";
                c++;
            }
        }
        plimon = l * limon;
        pnuez = n * nuez;
        plulo = lu * lulo;
        pfresa = f * fresa;
        pcrema = c * crema;
        
        
        System.out.println("la cantidad de paletas de limon son "+l);
        System.out.println("el total vendido es de: $"+plimon);
        
        System.out.println("la cantidad de paletas de nuez son "+n);
        System.out.println("el total vendido es de: $"+pnuez);
        
        System.out.println("la cantidad de paletas de lulo son "+lu);
        System.out.println("el total vendido es de: $"+plulo);
        
        System.out.println("la cantidad de paletas de fresa son "+f);
        System.out.println("el total vendido es de: $"+pfresa);
        
        System.out.println("la cantidad de paletas de crema son "+c);
        System.out.println("el total vendido es de: $"+pcrema);
        
        
        System.out.println("el total de ventas en la semana es de $"+(plimon+pnuez+plulo+pfresa+pcrema));
        
        
         }
    
}
