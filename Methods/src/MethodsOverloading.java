public class MethodsOverloading {
    public static void main(String[] args) {
        calculateScore("Edo",500);

        int newScore = calculateScore("Edo", 500);   //altro modo ma cosi mi esce anche il return
        System.out.println("New score is "+ newScore);

        calculateScore(700);                                         //utilizzo metodo overloddato
        calculateScore();                                            //terzo metodo


    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+playerName+" scored "+score+" points");
        return score*1;
    }
    public static int calculateScore(int score){                      // public static int calculateScore(int score){
        System.out.println("Unomed player scored "+score+" points");  //return calculateScore("Anonymous", score);
        return score*1;                                               //}      ----> altro modo per scriverlo senza passare il nome
    }
    public static int calculateScore(){
        System.out.println("No player no score");
        return 0;
    }


}
