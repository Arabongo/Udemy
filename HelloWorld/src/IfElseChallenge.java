public class IfElseChallenge {
    public static void main(String[] args){

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = score;

        if(gameOver){
            finalScore += (levelCompleted*bonus);
            System.out.println("your final score is: "+ finalScore);
        }
        boolean gameOver2 = true;
        int score2 = 10000;
        int levelCompleted2 = 8;
        int bonus2 = 200;
        int finalScore2 = score2;

        if(gameOver2){
            finalScore2 += (levelCompleted2*bonus2);
            System.out.println("your final score is: "+finalScore2);
        }



    }
}
