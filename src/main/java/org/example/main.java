package org.example;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int r;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);
        System.out.println("Dairenin yarıçapı : ");
        r = inp.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        System.out.println("Dairenin çevresi : " + cevre);
        System.out.println("Dairenin alanı : " + alan);




    }
}
