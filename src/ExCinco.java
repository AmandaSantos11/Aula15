import java.util.Scanner;

public class ExCinco {
    public static void main(String[] args) {

        semana();
    }
    public  static void semana(){

        Scanner digite = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 7: ");
        int numero = digite.nextInt();

        switch (numero){
            case 1:
                System.out.println("O dia da semana é: Domingo");
                break;
            case 2:
                System.out.println("O dia da semana é: Segunda");
                break;
            case 3:
                System.out.println("O dia da semana é: Terça");
                break;
            case 4:
                System.out.println("O dia da semana é: Quarta");
                break;
            case 5:
                System.out.println("O dia da semana é: Quinta");
                break;
            case 6:
                System.out.println("O dia da semana é: Sexta");
                break;
            case 7:
                System.out.println("O dia da semana é: Sábado");
                break;
            default:
                System.out.println("Número inválido");
        }
    }
}
