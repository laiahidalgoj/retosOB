import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {


        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce una cadena de números entre [ ] separado por comas: ");
        String cadena = scan.nextLine();


        Util.stringToArray(cadena);


    }
}
