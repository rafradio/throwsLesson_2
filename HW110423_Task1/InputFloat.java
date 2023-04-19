package HW110423_Task1;

import java.util.*;

public class InputFloat {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String str = null;
        do {
            try {
                System.out.println("Введите пожалуйста дробное число:");
                str = in.nextLine();
                float f = makeParse(str);
                System.out.println("Вы ввели число: " + f);
            } 
            catch(MyDataExeption ex) {  
                System.out.println(ex.getMessage());
            }
            
        } 
        while (str.compareTo("exit") != 0);

    }

    static float makeParse(String str) throws MyDataExeption {
        try {
            return Float.parseFloat(str);
        }
        catch(NumberFormatException ex) {
            throw new MyDataExeption("\nВы ввели не число.\nПопробуйте еще раз\n", str);
        }
        // catch(NullPointerException ex) {
        //     throw new MyDataExeption("\nВы ввели пустую строчку.\nПопробуйте еще раз\n", str);
        // }
    }
}
