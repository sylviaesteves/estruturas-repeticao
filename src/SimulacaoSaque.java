import java.util.Scanner;

public class SimulacaoSaque {

    public static void main(String[] args) {

        //Cedulas: 100, 50, 20, 10, 5, 2
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor para o saque (O valor não deve terminar em 1 ou 3): ");
        int valor = sc.nextInt();
        if (validacaoNotas(valor) < 0) {
            System.out.println("O valor não deve terminar em 1 ou 3");
        } else {
            realizarSaque(valor);
        }
    }

    private static int validacaoNotas(int valor){

        int menorNota = valor % 10;
        if(menorNota == 1 || menorNota == 3){
            return -1;
        }
        return 0;
    }

    private static void realizarSaque(int valor){

        int numeroDeNotas = 0;
        int[] nota = {100, 50, 20, 10, 5, 2};

        System.out.println("#".repeat(20) + "\nSAQUE:");
        for(int i = 0; i < 6; i++){
            if(nota[i] == 5 && (valor % 5 == 3 || valor % 5 == 1)){
                i++;
            }
            while (valor >= nota[i]){
                valor -= nota[i];
                numeroDeNotas++;
            }
            if(numeroDeNotas > 0){
                System.out.print("(" + numeroDeNotas + ") R$" + nota[i] + "\n");
            }
            numeroDeNotas = 0;
        }
        System.out.println("#".repeat(20));
    }
}