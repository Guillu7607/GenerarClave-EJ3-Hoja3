import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerarClave {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lineas = new ArrayList<>();

        System.out.println("Introduce líneas de texto (línea vacía para terminar):");

        // Leer líneas hasta que el usuario introduzca una línea vacía
        while (true) {
            String linea = scanner.nextLine();
            if (linea.isEmpty()) {
                break;
            }
            lineas.add(linea);
        }

        StringBuilder clave = new StringBuilder();

        if (!lineas.isEmpty()) {

            // Tomar últimos caracteres de las primeras 10 líneas
            int limite = Math.min(10, lineas.size());
            for (int i = 0; i < limite; i++) {
                String linea = lineas.get(i);
                clave.append(linea.charAt(linea.length() - 1));
            }

            // Si hay menos de 10 líneas, repetir último carácter
            if (lineas.size() < 10) {
                char ultimo = lineas.get(lineas.size() - 1)
                        .charAt(lineas.get(lineas.size() - 1).length() - 1);

                while (clave.length() < 10) {
                    clave.append(ultimo);
                }
            }
        }

        System.out.println("Clave generada: " + clave.toString());
        scanner.close();
    }
}
