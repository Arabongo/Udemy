public class Hello {
    public static void main(String[] args){
        System.out.println("Hello, Tim!");

        boolean isAlien = true;
        if(isAlien == false){                                //possiamo usare != al posto di == per dire che è diverso
            System.out.println("Is not an alien!");
        }else {
            System.out.println("Is an alien");
            System.out.println("and I'm scared of them!");
        }


        int topScore = 100;
        if(topScore != 100){                               // == >= <= < > !=
            System.out.println("You have the high score");
        }
        int secondTopScore = 80;
        if (topScore > secondTopScore && topScore < 110){
            System.out.println("top");
        }
        if(topScore >110 || secondTopScore <100){         // || questo significa che basta almeno una delle due condiioni vere
            System.out.println("top");
        }

        boolean isCar = false;                            // usare sempre == per confrontare e non = che è assegnare
        if(!isCar){                                       // per i buleani si puo abbreviare mettendo solo il nome della variabile
            System.out.println("yeah is car");
        }


        //  Ternary Operator
        String makeOfCar = "Audi";
        boolean isDomestic = makeOfCar == "Audi" ? false : true;
        if(isDomestic){
            System.out.println("This car is domestic in our country");
        }

        String s = (isDomestic) ? "this car is domestic" : "this car is not domestic";
        System.out.println(s);


        //Sfida

        double firsV = 20.00;
        double secondV = 80.00;
        double sumV = (firsV + secondV)*100.00;
        System.out.println("My sum is: " + sumV);
        double theResto = sumV % 40.00;
        System.out.println("The resto is: " + theResto);
        boolean isNoResto = (theResto == 0) ? true:false;
        System.out.println("Il noResto è: " + isNoResto);
        if(!isNoResto){
            System.out.println("cazz c'è resto");
        }


        boolean gameOver = true;                                               //esempio di if else
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if(score <5000 && score > 1000){
            System.out.println("your score is less then 5000 and grather than 1000");
        } else if (score< 1000) {
            System.out.println("your score is less the 1000");
        }else {
            System.out.println("got there");
        }
    }
}
