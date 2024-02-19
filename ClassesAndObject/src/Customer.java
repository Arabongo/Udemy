public class Customer {
    private String name;
    private double creditLimit;
    private String email;
    public Customer() {
        this("Nobody", "nobodyemail@gmail.com"); //qui chiamiamo il secondo che richiama il terzo costruttore
    }
    public Customer(String name, String email) {
        this(name, 1000, email);    //richiamiamo il terzo costruttore settando come fisso il credit limit
    }
    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public String getEmail() {
        return email;
    }
}
