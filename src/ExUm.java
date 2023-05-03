import java.util.Scanner;

public class ExUm {
    public static void main(String[] args) {

        System.out.println(verificar());
    }
    public static boolean verificar() {

        Scanner digite = new Scanner(System.in);

        System.out.println("Digite um número: ");
        String numeroDigitado = digite.next();


        for (int i = 0; i < numeroDigitado.length(); i++) {
            char conversao = numeroDigitado.charAt(i);
            int numeroInteiro = Integer.parseInt(String.valueOf(numeroDigitado.charAt(i)));

            if (numeroInteiro % 2 != 0) {
                return false;
            }
            }
        return true;
        }
    }
