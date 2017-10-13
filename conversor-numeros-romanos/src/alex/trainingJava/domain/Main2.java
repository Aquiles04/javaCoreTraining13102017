package alex.trainingJava.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

    //metodo static acessado pela classe
    public static boolean sera = true;

    public static void main(String[] args) {

//        Cardholder luthor = new Cardholder();
//        luthor.setName("Lex");
//        luthor.setCardNumber("0001");
//
//        Cardholder kent = new Cardholder("Clark","0002");
//        Cardholder wayne = new Cardholder();
//
//        Company wipro = new Company("Wipro","Curitiba-PR");
//        Company master = inputCompany();
//
//        System.out.println(luthor.getName() + " " + luthor.getCardNumber());
//        System.out.println(kent);
//        System.out.println(wayne);
//
//        System.out.println(wipro);
//        System.out.println(master);

        Company cp1 = inputCompany();

        Cardholder daniel = new Cardholder("DJ","3302", cp1);
        //System.out.println(daniel);


        List<Cardholder> cardholders  = new ArrayList<>();
        Cardholder regius = new Cardholder("RG","3303", cp1);


        cardholders.add(daniel);
        cardholders.add(regius);
        cp1.setCardholders(cardholders);

        System.out.println("Imprimir company");
        System.out.println(cp1);


    }

    public static Company inputCompany(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Company Name: ");
        String name = sc.nextLine();

        System.out.print("Company Location: ");
        String location = sc.nextLine();

        return new Company(name,location);
    }
}
