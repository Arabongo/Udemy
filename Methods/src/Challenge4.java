public class Challenge4 {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65,45));
        System.out.println(getDurationString(65,145));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }
    public static String getDurationString(int second){
        if(second<0){
            return "invalid data for second("+second+")must be a positive integer value";
        }
        return getDurationString(second/60,second&60);
    }
    public static String getDurationString(int minutes, int second) {
       if(minutes < 0){
           return "invalid data for minutes("+minutes+") must be a positive integer value";
       }
        if(second <= 0 || second >= 59){
            return "invalid data for second("+second+") must be between 0 and 59";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h" + remainingMinutes + "m" + second+ "s";
    }
}
