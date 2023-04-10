import java.util.Scanner;

public class Q02 {
    private static int[] vetAux = new int[50];
    private static long[] vetFibonnaci= new long[50];
    private static int k;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro!");
        long num = scanner.nextLong();



        //Caso queira aumentar o tamanho da sequência de fibonnaci para um número acima de 63245986, aumente o i para mais que 40
        for (int i = 0; i < 40; i++) {
            System.out.println("(" + i + "):" + Q02.fibonnaci(i) + "\t");
            vetFibonnaci[i] = Q02.fibonnaci(i);
        }

        System.out.println(" ");

        int aux = 0;
        while(true){
            if (num > vetFibonnaci[aux]){
                aux++;
            } else if (num == vetFibonnaci[aux]) {
                System.out.println("O número informado " + num + " está dentro da sequência de fibonnaci!");
                break;
            } else {
                System.out.println("O número informado " + num + " não está dentro da sequência de fibonnaci!");
                break;
            }
        }
    }


    public static long fibonnaci(int n) {
        k = 1;
        return recursao(n);
    }

    private static long recursao(int n) {
        if (n < 0) {
            return vetAux[0];
        } else {
            if (k < 3) {
                vetAux[n] = k - 1;
                k++;
            } else {
                vetAux[n] = vetAux[n + 1] + vetAux[n + 2];
            }
            return recursao(n - 1);
        }
    }

}
