package strings;

public class Concat {
    public static void main(String[] args) {

        System.out.println("Unindo strings numa nova...");
        System.out.println();
        String text1 = "Minas Gerais é um dos estados do Brasil. ";
        String text2 = "Belo Horizonte é a capital de Minas Gerais.";

        System.out.println("A primeira string é: " + text1);
        System.out.println("A segunda string é: " + text2);
        System.out.println();
        System.out.println("Unindo as string com o CONCAT, agora temos: ");
        System.out.println();
        System.out.println(text1.concat(text2));

    }
}

