package wipro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // <Tipo> <identificador> = <valor>;
        // primitivo x complexo
        // primitivos - char, , byte , short , int , long , float , double , boolean
        // complexo - string
        // caracter em java é interpretado como um numero tabela ascii


        char inicialDiaHoje = 'T';
        char exclamation = 33;
        String thisMonth = "October";
        int today = 10;
        boolean isRaining = true;


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String name = sc.next();
        System.out.println("Seu nome é " + name);


        System.out.println("Digite primeiro valor");
        // int a = Integer.parseInt(scanner.nextLine());
        int valor1 = sc.nextInt();

        System.out.println("Digite segundo valor");
        // int b = Integer.parseInt(scanner.nextLine());
        int valor2 = sc.nextInt();

        // Constante é final ...
        final int resultado = valor1 % valor2;

        System.out.println("O resultado de mod é " + resultado);


        int ten = 10;
        ten += 5;
        System.out.println("ten = " + ten);

        ten = 10;
        int otherTen = 10;

        System.out.println(ten == otherTen);
        System.out.println(ten != otherTen);

        boolean isTenGreaterThanZero = ten > 0;
        boolean isTenLessThanOrEqualZero = ten <= 0;
        isTenLessThanOrEqualZero = !isTenGreaterThanZero;
        isTenLessThanOrEqualZero = !(ten > 0);


        System.out.println(
                isLessThanZero( 1) && isGreaterThanZero(1)
        );

        System.out.println(
                isLessThanZero( 1) & isGreaterThanZero(1)
        );

        System.out.println( (10 > 0) ^ (20 > 0));
        System.out.println( (10 > 0) ^ (20 > 0));

    }

    public static boolean isGreaterThanZero(int val)
    {
        System.out.println("Main.isGreaterThanZero");
        return val > 0;
    }

    public static boolean isLessThanZero(int val)
    {
        System.out.println("Main.isLessThanZero");
        return val < 0;
    }
}
