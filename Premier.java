package com.mycompany.tp1;

/**
 *
 * @author ExpertBook
 */
import java.util.Scanner;
public class Premier {
        public static boolean estPremier(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer un nombre : ");
        int n = sc.nextInt();
        if (estPremier(n))
            System.out.println("Nombre premier");
        else
            System.out.println("Non premier");
    }

}
