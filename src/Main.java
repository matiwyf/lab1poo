import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print ("Ingrese el nombre del cafe: ");
        String nombre = sc.nextLine();
        System.out.print ("Ingrese el tamano que desea: ");
        String tamano = sc.nextLine();
        System.out.print ("Ingrese el precio: ");
        double precio = sc.nextDouble();

        Cafe cafe = new Cafe(nombre, tamano, precio);

       cafe.MostrarTicket();

    }
}