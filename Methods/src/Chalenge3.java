public class Chalenge3 {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65,45));
    }

    public static String getDurationString(int second){
        int minutes = second/60;
        int hours = minutes/60;
        int remainingMinutes = minutes%60;
        int remainingSecond= second%60;
        return hours+"h"+remainingMinutes+"m"+remainingSecond+"s";
        //int minutes = second/60;                                            si puo abbreviare il tutto cosi
        //return getDurationString(int minutes, int second);
    }
    public static String getDurationString(int minutes, int second) {
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSecond = second % 60;
        return hours + "h" + remainingMinutes + "m" + remainingSecond + "s";
    }
}
