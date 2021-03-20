package strings;

public class toCharArray {
    public static void main(String[] args) {
        String s1 = "ABCDEFG";
        System.out.println("String >> " + s1);

        char[] sequencia;
        sequencia = s1.toCharArray();
        for (int i=0; i<s1.length(); i++){
        System.out.println("Posicao " + i + " no Array: " + sequencia[i]);}
    }
    }
