package strings;

public class ReplaceAll {
    public static void main(String[] args) {

        System.out.println("Utilizando o método REPLACE...");
        System.out.println();
        String text1 = ("123abc###");
        System.out.println("String inicial: " + text1);
        System.out.println();
        System.out.println("Trocando a sequência abc por ABC");
        System.out.println();
        text1 = text1.replace("abc","ABC");
        System.out.println("String alterada: " + text1);
    }
}