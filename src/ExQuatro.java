import java.util.Scanner;

public class ExQuatro {
    public static void main(String[] args) {
        dados();
    }

    public static void dados(){

        Scanner digite = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int polegada = digite.nextInt();

        double metro = polegada * 0.0254;

        System.out.println("Sua polegada em metros é: "+metro);
    }
}
