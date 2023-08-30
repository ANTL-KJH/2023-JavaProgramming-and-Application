package ch02_5_3_nested_if_else;

import java.util.Scanner;

public class nested_if_else {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int score;
        while (true) {
            System.out.print("input score (0 ~ 99, -1 to quit) : ");
            score = cin.nextInt();
            if (score < 0)
                break;
            if (score >= 70) {
                if (score >= 80) {
                    if (score >= 90) {
                        System.out.println("Score (" + score + ") => grade A");
                    } else {
                        System.out.println("Score (" + score + ") => grade B");
                    }
                } else {
                    System.out.println("Score (" + score + ") => grade C");
                }
            } else if (score >= 60) {
                System.out.println("Score (" + score + ") => grade D");
            } else {
                System.out.println("Score (" + score + ") => grade F");
            }

        }
        cin.close();
    }
}
