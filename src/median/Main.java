package median;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int[] cisla = new int[5];

        for ( int i = 0 ; i < 5; i++) {
            System.out.println("Zadej cislo");
            Scanner sc = new Scanner(System.in, "Windows-1250");
            cisla[i] = Integer.parseInt(sc.nextLine());

            float median = cisla[cisla.length / 2];

            System.out.println(cisla[i] - median);

        }


    }
}
