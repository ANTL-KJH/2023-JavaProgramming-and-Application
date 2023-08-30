package ch02_5_3_if_else;


import java.util.Scanner;

public class nested_if_else_ex {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int menu;
        while(true){
            System.out.print("input menu of 1 ~ 3 (0 to quit) : ");
            menu = cin.nextInt();
            if(menu == 0)
                break;
            else if(menu==1)
                System.out.println("Operations for menu 1");
            else if(menu==2)
                System.out.println("Operations for menu 2");
            else if(menu==3)
                System.out.println("Operations for menu 3");
            else continue;
        }
        cin.close();
    }
}
