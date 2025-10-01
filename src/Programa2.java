import java.util.Scanner;

public class Programa2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String entrada;

        do {
            System.out.println("Opção 1: Continuar");
            System.out.println("Opção 2: Sair");
            entrada = sc.nextLine();
            if(entrada.equals("1")){
                System.out.print("Digite uma frase: ");
                entrada = sc.nextLine();
                System.out.println(entrada);
                entrada = "";
            }
        }while(!entrada.equals("2"));
        System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado");
        sc.close();
    }
}
