package ch02_5_4_switch_case;

import java.util.Scanner;

public class switch_case_ex {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int menu;
        while (true) {
            System.out.print("input menu of 1 ~ 3 (0 to quit) : ");
            menu = cin.nextInt();
            if (menu == 0)
                break;
            //switch (menu) {
            //    case 1 -> System.out.println("Operations for menu 1");
            //    case 2 -> System.out.println("Operations for menu 2");
            //    case 3 -> System.out.println("Operations for menu 3");
            //    default -> {
            //    }
            switch (menu) {
                case 1:
                    System.out.println("Operations for menu 1");
                    break;
                case 2:
                    System.out.println("Operations for menu 2");
                    break;
                case 3:
                    System.out.println("Operations for menu 3");
                    break;
                default:
                    break;
            }
        }
        cin.close();
    }
}
