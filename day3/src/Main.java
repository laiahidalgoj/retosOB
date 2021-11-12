import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        String minuscula = name.toLowerCase();
        String[] items = minuscula.split(" ");
        List<String> itemList = new ArrayList<>(List.of(items));

        Metodo.fullName(itemList);
    }
}
