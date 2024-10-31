import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Seleccione una figura: 1. Triángulo, 2. Cuadrado, 3. Rectángulo");
        int opcion = Integer.parseInt(reader.readLine());

        switch (opcion) {
            case 1 -> {
                System.out.print("Ingrese la base del triángulo: ");
                double base = Double.parseDouble(reader.readLine());
                System.out.print("Ingrese la altura del triángulo: ");
                double altura = Double.parseDouble(reader.readLine());

                System.out.println("Área del triángulo: " + calcularAreaTriangulo(base, altura));
                System.out.println("Perímetro del triángulo: " + calcularPerimetroTriangulo(base, altura));
            }
            case 2 -> {
                System.out.print("Ingrese el lado del cuadrado: ");
                double lado = Double.parseDouble(reader.readLine());

                System.out.println("Área del cuadrado: " + calcularAreaCuadrado(lado));
                System.out.println("Perímetro del cuadrado: " + calcularPerimetroCuadrado(lado));
            }
            case 3 -> {
                System.out.print("Ingrese el largo del rectángulo: ");
                double largo = Double.parseDouble(reader.readLine());
                System.out.print("Ingrese el ancho del rectángulo: ");
                double ancho = Double.parseDouble(reader.readLine());

                System.out.println("Área del rectángulo: " + calcularAreaRectangulo(largo, ancho));
                System.out.println("Perímetro del rectángulo: " + calcularPerimetroRectangulo(largo, ancho));
            }
            default -> System.out.println("Opción no válida");
        }
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double calcularPerimetroTriangulo(double base, double altura) {
        double hipotenusa = Math.sqrt(base * base + altura * altura);
        return base + altura + hipotenusa;
    }

    public static double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularPerimetroCuadrado(double lado) {
        return 4 * lado;
    }

    public static double calcularAreaRectangulo(double largo, double ancho) {
        return largo * ancho;
    }

    public static double calcularPerimetroRectangulo(double largo, double ancho) {
        return 2 * (largo + ancho);
    }
}
