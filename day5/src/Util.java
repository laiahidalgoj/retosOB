import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.ErrorManager;

public class Util {

    public static void stringToArray(String cadena) throws NumberFormatException {

        try {
            if((cadena.contains("[") && cadena.contains("]"))){
                String eliminarCorchete = cadena.replace("[", "").replace("]", "")
                        .replace("", " ");
                String[] items = eliminarCorchete.split(",");
                List<String> list = Arrays.asList(items);

                for (String s : list) {
                    System.out.print(s);
                }
            }

        } catch (NumberFormatException e) {
            System.err.println("El formato no es válido " + e.getMessage());
            e.printStackTrace();

        } catch (Exception e) {
            System.err.println("el número introducido no es un número entero " + e.getMessage());
        }
    }
}



