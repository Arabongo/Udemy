public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        BankAccount bobAccount = new BankAccount("12345", 100.0, "Titti", "titti@gmail.com", "012345678");


        Customer firstCustomer = new Customer();
        System.out.println(firstCustomer.getName() + " " +  firstCustomer.getCreditLimit() + " " + firstCustomer.getEmail());

        Customer secondCustomer = new Customer("Tim", "tim@gmai.com");
        System.out.println(secondCustomer.getName() + " " + secondCustomer.getCreditLimit() + " " + secondCustomer.getEmail());

        Customer thirdCustomer = new Customer("Titti", 2000, "titti@gmail.com");
        System.out.println(thirdCustomer.getName() + " " + thirdCustomer.getCreditLimit() + " " + thirdCustomer.getEmail());
    }




    //ricordiamo che i metodi statici all'interno delle classi sono consigliati se non utilizzano istanze della classe stessa ,
    // a quel punto conviene usare metodi di istanza
}


//for ( int i = 1, i <= 5, i++){
//    student s = new Student( campo 1 + i,
//                       switch(i) {
//                            case 1 -> "nome studente";
//                            case 2 -> "nome studente";
//                            case 3 -> "nome studente";
//                            case 4 -> "nome studente";
//                            case 5 -> "nome studente";
//                            default -> "anonimo"
//                          },
//                       campo 2,
//                       campo 3;
//           System();
//         }
//  }