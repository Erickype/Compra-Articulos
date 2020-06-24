
package proyectocompraarticulos;


import ListaSecuencial.Lista;
import java.util.Scanner;


public class Menu {

    Scanner t = new Scanner(System.in);

    public void menu() {
        int n;
        do {
            System.out.printf("\n%20s%s\n"
                    + "%20s%s\n"
                    + "%20s%s\n",
                    "", "1.- Ventas",
                    "", "2.- Control inventario",
                    "", "3.- **SALIR**\n");
            System.out.printf("%30s", "Opcion (1 - 3) ==> ");
            n = t.nextInt();
            switch (n) {
                case 1:
                    //Metodo ventas
                    
                    break;
                case 2:
                    //Metodo sub menu inventario
                    subMenuInv();
                    break;
                case 3:
                    System.out.printf("%63s\n\n", "  ->  SALIENDO . . . ");
                    break;
                default:
                    System.out.println("ERROR: *** Opciones validas solo desde  1 al 3 *** ");
            }
        } while (n != 3);

    }

    public void subMenuInv() {
        int n;
        do {
            System.out.printf("\n%20s%s\n"
                    + "%20s%s\n"
                    + "%20s%s\n"
                    + "%20s%s\n"
                    + "%20s%s\n",
                    "", "1.- Agregar producto",
                    "", "2.- Borrar producto",
                    "", "3.- Modificar producto",
                    "", "4.- Listar productos",
                    "", "5.- **RETROCEDER**\n");
            System.out.printf("%30s", "Opcion (1 - 5) ==> ");
            n = t.nextInt();
            Lista l = new Lista();
            switch (n) {
                case 1:
                    //Metodo agregar producto
                    
                    break;
                case 2:
                    //Metodo borrar producto
                    
                    break;
                case 3:
                    //Metodo modificar producto
                    
                    break;
                case 4:
                    //Metodo listar productos
                                        l.listar();
                    break;
                case 5:
                    //regreso al menu principal, metodo menu
                    System.out.println("Retrocediendo ...");
                    menu();
                    break;

                default:
                    System.out.println("ERROR: *** Opciones validas solo desde  1 al 5 *** ");
            }
        } while (n != 5);
    }
}