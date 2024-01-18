public class Main {
    public static void main(String[] args) {
        calculateScore(true, 1000, 5,100 );
        calculateScore(true, 10000,8,200);

        int highScore = calculateScore2(true,1000,5,100);
        System.out.println("the highScore is: " + highScore);

        boolean gameOver = true;
        int score = 1000;
        int levelCompleted = 8;
        int bonus = 100;
        System.out.println(calculateScore2(gameOver,score,levelCompleted,bonus));

    }


    public static void calculateScore( boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;
        if(gameOver){
            finalScore += (levelCompleted*bonus);
            System.out.println("your final score is: "+ finalScore);
        }
    }
    public static int calculateScore2( boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;
        if(gameOver){
            finalScore += (levelCompleted*bonus);
        }
        return finalScore;
    }

    // creazione metodo con parametri chiamato sopra nel metodo principale main
    //primi due risultati con metodo calculateScore e secondi due con calculateScore2 (tutti metodi validi)
    //psvm crea public static void main(String[] args) {}
    }