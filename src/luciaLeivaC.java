import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        //instancie la clase scanner el in viene de input o de entrada de datos
        Scanner entrada = new Scanner(System.in);
        double number;
        System.out.print("Ingrese un numero decimal: ");
        number = entrada.nextDouble();
        int parteEntera = (int)number;
        double parteDecimal = number - parteEntera;

        System.out.println("la parte entera es: "+parteEntera+"y la parte decimal es: "+parteDecimal);
    }
}
