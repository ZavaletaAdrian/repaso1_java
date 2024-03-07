import java.util.Scanner;
import java.lang.Math;

class Circle{
    double radius;
    double Area(){
        return Math.PI * radius * radius;
    }
}
class Rectangle{
    double width;
    double height;
    double Perimeter(){
        return 2 * (width + height);
    }
}

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%s,\n", "Ingresa una opción: ");
        System.out.printf("%s,\n", "================================");
        System.out.printf("%s,\n", "1. Calcular el area de un circulo");
        System.out.printf("%s,\n", "2. Calcular el perimetro de un rectangulo");
        System.out.printf("%s,\n", "3. Salir de el programa");

        int option = scanner.nextInt();

        switch(option){
            // Calcular el area de un circulo
            case 1:
                System.out.printf("%s, \n", "Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                Circle circulo = new Circle();
                circulo.radius = radius;

                double area = circulo.Area();

                System.out.printf("The area of the circle is: %.1f\n", area);
            break;
            // Calcular el perimetro de un rectangulo
            case 2:
                System.out.printf("%s, \n", "Ingresa el alto de el rectangulo: ");
                double height = scanner.nextDouble();
                System.out.printf("%s, \n", "Ingresa el ancho de el rectangulo: ");
                double width = scanner.nextDouble();

                Rectangle rectangulo = new Rectangle();
                rectangulo.height = height;
                rectangulo.width = width;

                double perimetro = rectangulo.Perimeter();
                System.out.printf("El perimetro del rectangulo es: %.4f\n", perimetro);
            break;
            // Salir de el programa
            case 3:
                System.out.printf("%s, \n", "Saliendo del programa...");
                System.exit(0);
        }

    }
}