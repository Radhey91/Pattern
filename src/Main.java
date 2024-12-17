
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 25; i++) {
            System.out.print("\t\t\t\t");
            for (int j = 1; j <= 15; j++) {
                if (j == 1 || j == 2 || i == 1 || i == 4 || i == 7 || i == 10 || i == 2 && j == 15 || i == 3 && j == 15 || i == 5 && j == 15 || i == 6 && j == 15 || i == 8 && j == 15 || i == 9 && j == 15 || i == 5 && j == 7 || i == 5 && j == 8 || i == 5 && j == 9 || i == 6 && j == 7 || i == 6 && j == 8 || i == 6 && j == 9) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
        System.out.print("\t *  *  *  *  *  *  *  *  *  *\n");
        System.out.print("*  *  *  *  *  *  *  *  *  *  *  *  *  ");

    }
}
     
