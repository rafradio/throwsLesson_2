package HW110423_Task4;

import java.util.*;

public class NullString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = null;

        do {
            System.out.println("Введите пожалуйста строчку:");
            str = in.nextLine();

            try {
                if (str.isEmpty()) {
                    throw new NullPointerException("Пустые строчки вводить нельзя");
                }
                else {System.out.println("все ок");}

            }
            catch(NullPointerException ex) {System.out.println(ex.getMessage());}
            
            
        }
        while (str.compareTo("exit") != 0);
    }
}
