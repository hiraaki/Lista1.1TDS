import View.menu;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        int op = -1;
        while(op!=0) {
            menu m = new menu();
            op = m.menuInicial();
        }

    }
}
