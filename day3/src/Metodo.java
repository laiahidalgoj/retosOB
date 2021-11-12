

import java.util.*;

public class Metodo {

    public static void fullName(List itemList) {

            if (itemList.size() == 1) {
                System.out.println("Nombre: " + itemList.get(0));
            } else if (itemList.size() == 3 && NombresPila.nombres.contains(itemList.get(1))) {
                System.out.println("Nombre: " + itemList.get(0) + " " + itemList.get(1) + "\nApellido1: " + itemList.get(2));
            } else if (itemList.size() == 3 && !(NombresPila.nombres.contains(itemList.get(1)))) {
                System.out.println("Nombre: " + itemList.get(0) + "\nApellido1: " + itemList.get(1) + "\nApellido2: " + itemList.get(2));
            } else if (itemList.size() == 2 && !(NombresPila.nombres.contains(itemList.get(1)))) {
                System.out.println("Nombre: " + itemList.get(0) + "\nApellido1: " + itemList.get(1));
            } else if(itemList.size() == 2 && (NombresPila.nombres.contains(itemList.get(1)))) {
                System.out.println("Nombre: " + itemList.get(0) + " " + itemList.get(1));
            }else if(itemList.size() == 4 && (NombresPila.nombres.contains(itemList.get(1)))) {
            System.out.println("Nombre: " + itemList.get(0) + " " + itemList.get(1) + "\nApellido1: " + itemList.get(2) + "\nApellido2: " + itemList.get(3));
            }else{
            System.out.println("El nombre introducido no es correcto");
        }
            }
        }


