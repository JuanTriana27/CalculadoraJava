import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();

        int op = 0, n1, n2, total;

        System.out.println("Bienvenido a la Calculadora\nPor favor Elige una Opción");
        System.out.println("1. Suma\n2. Resta\n3. Multiplicación\n4. Division ");

        System.out.print(" Opción: ");
        op = entrada.nextInt();

        switch (op){
            case 1:
                System.out.println("Digite un número: ");
                n1 = entrada.nextInt();
                operaciones.setNumero1(n1);

                System.out.println("Digite un número: ");
                n2 = entrada.nextInt();
                operaciones.setNumero2(n2);

                total = operaciones.sumaNumeros(n1,n2);

                System.out.println("La Suma de: " + n1 + " + " + n2 + " es: " + total);
                break;

            case 2:
                System.out.println("Digite un número: ");
                n1 = entrada.nextInt();
                operaciones.setNumero1(n1);

                System.out.println("Digite un número: ");
                n2 = entrada.nextInt();
                operaciones.setNumero2(n2);

                total = operaciones.restaNumeros(n1,n2);

                System.out.println("La Resta de: " + n1 + " - " + n2 + " es: " + total);
                break;

            case 3:
                System.out.println("Digite un número: ");
                n1 = entrada.nextInt();
                operaciones.setNumero1(n1);

                System.out.println("Digite un número: ");
                n2 = entrada.nextInt();
                operaciones.setNumero2(n2);

                total = operaciones.multiplicacionNumeros(n1,n2);

                System.out.println("La Multiplicacion de: " + n1 + " X " + n2 + " es: " + total);
                break;

            case 4:
                System.out.println("Digite un número: ");
                n1 = entrada.nextInt();
                operaciones.setNumero1(n1);

                System.out.println("Digite un número: ");
                n2 = entrada.nextInt();
                operaciones.setNumero2(n2);

                total = operaciones.divisionNumeros(n1,n2);

                System.out.println("La Division de: " + n1 + " / " + n2 + " es: " + total);
                break;

            default:
                System.out.println("OPCION INCORRECTA");
        }
    }
}