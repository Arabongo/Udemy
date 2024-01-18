public class For {
    public static void main(String[] args) {

        for(int counter = 1; counter<=5; counter++){
            System.out.println(counter);
        }

        System.out.println("10,000 at 2% interest = "+ calculateInterest(10000,2));
        //utilizzo del solo richiamo del metodo senza loop
        //quindi bisognerebbe riscrivere una riga diversa per ogni tasso diverso di interesse

        for(double rate = 2.0; rate <=5.0; rate++) {
            double interestAmount = calculateInterest(10000, rate);
            System.out.println("100  at " + rate + " & interest = " + interestAmount);
        }

        for(double i= 7.5; i <=10; i += 0.25){
            double interestAmount = calculateInterest(100, i);
            System.out.println("100  at "+i+" & interest = "+interestAmount);
            //altro esempio
        }
        for(double i= 7.5; i <=10; i += 0.25){
            double interestAmount = calculateInterest(100, i);
            if(interestAmount > 8.5){
                break;
            }
            System.out.println("100  at "+i+" & interest = "+interestAmount);
            //altro esempio bloccando il loop a 8.5
        }

    }                                                                                                    //usiamo for per calcolare piu tassi di interesse
    public static double calculateInterest (double amount, double interestRate){
        return (amount*(interestRate/100));
    }

}
