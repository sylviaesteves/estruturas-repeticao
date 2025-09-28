import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean quit = false;
        String name;
        int n = 0;

        System.out.print("Digite seu nome: ");
        name = s.nextLine();

        while(!quit){
            System.out.print("Digite um número maior que zero: ");
            n = s.hasNextInt() ? Integer.parseInt(s.next()) : 0;
            if(n <= 0) {
                System.out.println("Número digitado inválido");
            } else {
                quit = true;
            }
        }
            contagemCrescente(n);
            contagemDecrescente(n);
            imprimeNome(n, name);
    }

    private static void contagemCrescente(int n) {

        for(int i = 0; i <= n; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void contagemDecrescente(int n){

        for(int i = n; i >= 0; i--){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void imprimeNome(int n, String name){

        int len = name.length();
        if(len == 0){
            System.out.println("Nome em branco");
        } else if(name.length() >= 6){
            for(int i = 0; i < n; i++){
                if(i != 4) {
                    System.out.print(name + ", ");
                } else {
                    System.out.println(name);
                }
            }
        } else {
            System.out.println(name);
        }
    }
}
