package Utilities;
import java.util.Scanner;
public class General {
    public static String type (){
        return new Scanner(System.in).nextLine();
    }
    public static void print(String message){
        System.out.println(message);
    }
}
