public class Challenge1 {
    public static void main(String[] args) {
        int hghtScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", hghtScorePosition);

        int hghtScorePosition2 = calculateHighScorePosition(1000);
        displayHighScorePosition("Galla", hghtScorePosition2);

        int hghtScorePosition3 = calculateHighScorePosition(500);
        displayHighScorePosition("Titti", hghtScorePosition3);

        int hghtScorePosition4 = calculateHighScorePosition(100);
        displayHighScorePosition("Jhon", hghtScorePosition4);

        int hghtScorePosition5 = calculateHighScorePosition(25);
        displayHighScorePosition("Marc", hghtScorePosition5);



    }
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name +" "+ position);

    }
    public  static int calculateHighScorePosition(int playerScore){
        int position = 4;
        if(playerScore >= 1000){
            return 1;
        }else if(playerScore>=500){
            return 2;
        } else if(playerScore>=100) {
            return 3;
        }
        return position;
    }
}
