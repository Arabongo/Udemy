public class Challenge2 {
    public static void main(String[] args) {

        System.out.println("68in = "+ convertToCentimeters(68)+ " cm");
        System.out.println("5ft, 8in= "+ convertToCentimeters(5,8)+" cm");
    }


    public  static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public  static double convertToCentimeters(int feet, int inches){
        //return ((feet*12)+ inches)*2.54;                                 //tutti return possibili
        //return convertToCentimetrs((feet*12)+inches);
        int feetToInches= feet*12;
        int totalInches= feetToInches+inches;
        double result= convertToCentimeters(totalInches);
        return result;

    }
}
