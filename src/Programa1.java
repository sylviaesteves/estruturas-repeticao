import java.util.Scanner;

public class Programa1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor digite um número para à tabuada: ");
        int numero = sc.hasNextInt() ? Integer.parseInt(sc.next()) : -1;
        if(numero < 0) {
            System.out.println("O número é inválido ou negativo.");
        } else {
            for (int i = 1; i < 11; i++) {
                System.out.println(numero + " X " + i + " = " + (numero * i));
            }
        }
        sc.close();
    }
}
