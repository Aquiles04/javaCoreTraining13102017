package alex.trainingJava.domain;

import java.util.ArrayList;
import java.util.List;

public class Company extends Entity {

    //private String name;
    private String location;
    //private Cardholder[] cardholders = new Cardholder[12];
    private List<Cardholder> cardholders;
    /*
    Listas
    Set
    Maps

    List X Set
    List:
    Pode repetir os elementos
    Sao necessariamente ordenadas
    Acesso é feito posicionalmente
    É possivel inserir valores nulos

    Set
    Nao pode repetir elementos
    Nao sao necessariamente ordenados
    Nao há como acessar elementos posicionalmente
    Por padrão, Não é possivel inserir valores nulos ( e se puder apenas um);
     */

    public Company() {
        this("N/A","N/A", new ArrayList<>());
    }

    public Company(String name, String location) {
        //this.name = name;
        super(name);
        this.location = location;
    }

    public Company(String name, String location, List<Cardholder> cardholders) {
        //this.name = name;
        super(name);
        this.location = location;
        this.cardholders = cardholders;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Cardholder> getCardholders() {
        return cardholders;
    }

    public void setCardholders(List<Cardholder> cardholders) {
        this.cardholders = cardholders;
    }

    @Override
    public String toString() {

        return String.format("[Company Name = %s, Location = %s, Cardholders = %s]", this.getName(), this.location, this.cardholders);


    }
}
