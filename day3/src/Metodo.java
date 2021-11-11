import java.util.*;

public class Metodo {

    public static void fullName() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        String minuscula = name.toLowerCase();
        String[] items = minuscula.split(" ");
        List<String> itemList = new ArrayList<>(List.of(items));

        String[] nombresPila = new String[]{"laia", "maria", "rosa", "isabel", "ernesto", "jose"};

        List<String> list = Arrays.asList(nombresPila);

        if (itemList.size() == 1) {
            System.out.println("Nombre: " + itemList.get(0));
        } else if (list.contains(itemList.get(1))) {
            System.out.println("Nombre: " + itemList.get(0) + " " + itemList.get(1) + "\nApellido1: " + itemList.get(2));
        } else if (itemList.size() == 3 && !(list.contains(itemList.get(1)))) {
            System.out.println("Nombre: " + itemList.get(0) + "\nApellido1: " + itemList.get(1) + "\nApellido2: " + itemList.get(2));
        } else if (itemList.size() == 2) {
            System.out.println("Nombre: " + itemList.get(0) + "\nApellido1: " + itemList.get(1));
        } else {
            System.out.println("El nombre introducido no es correcto");
        }
    }
}

