package alex.trainingJava.domain;

public class Cardholder extends Entity{


    // Qualquer constante usar esse snake upper case
    private static final int INITIAL_BALANCE = 0;
    //private String name;
    private String cardNumber;
    private Company company;

    public Cardholder() {

    }

    public Cardholder(String name, String cardNumber) {
        //this.name = name;
        super(name);
        this.cardNumber = cardNumber;

    }

    public Cardholder(String name, String cardNumber, Company company) {
        super(name);
        this.cardNumber = cardNumber;
        this.company = company;
    }

    //    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        //Placeholders
       return String.format("[Name = %s, CardNumber = %s]", this.getName(), this.cardNumber);

//        String state = "";
//        state += "[Name = " + this.name;
//        state += ", CardNumber = " + this.cardNumber + "]";
//        return state;
    }




}
