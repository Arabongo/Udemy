public class Main {
    public static void main(String[] args) {


        int highScore = 50;                              //esempi di espressioni
        if (highScore > 25){
            highScore = 1000 + highScore;
            System.out.println(highScore);
        }
        int health = 100;
        if((health < 25)&&(highScore > 1000)){
            highScore = highScore -1000;
            System.out.println(highScore);
        }

    }
}