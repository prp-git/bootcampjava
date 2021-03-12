package strings;

public class SPLIT {
    public static void main(String[] args) {
        String s1 = "A função Split divide uma cadeia de texto em uma tabela de subcadeias";

        System.out.println("A string a ser quebrada é: " + s1);

        String[] vetor = s1.split(" ");
        System.out.println();
        System.out.println("Total de palavras: " + vetor.length);
        System.out.println();
        for (int i=0; i< vetor.length; i++){
            System.out.println((i+1) + "a palavra: " + vetor[i]);
        }
    }
    }
