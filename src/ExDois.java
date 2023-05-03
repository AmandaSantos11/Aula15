import java.util.Scanner;

public class ExDois {
    public static void main(String[] args) {

        System.out.println(verificar());
    }
            //NÃO FUNCIONOU
    public static boolean verificar () {

        Scanner digite = new Scanner(System.in);

        String vogal[] = {"a","e","i","o","u"};
        String consoante[] = {"b", "c", "d", "f", "g", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"};

        System.out.println("Digite uma palavra: ");
        String palavra = digite.next();

        String listaPalavra [] = palavra.split("");

        for (int i = 0, j=0; i < listaPalavra.length && j < vogal.length; i++, j++) {

            if (listaPalavra[i] == vogal[i]){
                return true;
            }
            }
        return false;
    }
}

