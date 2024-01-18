public class Main {
    public static void main(String[] args) {

                int value = 1;

                if (value==1){
                    System.out.println("it was 1");
                }else if(value==2){
                    System.out.println("it was 2");
                }else{
                    System.out.println("its not 1 or 2");
                }

// lo switch si usa per confrontare tanti elementi diversi invece che solo pochi come nell'if else
// non si possono usare float, double e boolean ne i loro wrapper
                int swithcvalue = 5;
                switch (swithcvalue){
                    case 1:
                        System.out.println("1");
                        break;
                    case 2:
                        System.out.println("2");
                        break;
                    case 3:
                        System.out.println("3");
                        break;
                    case 4: case 5: case 6:
                        System.out.println("4,5o6");
                        System.out.println("è " + swithcvalue);
                    default:
                        System.out.println("nessuno di questi");
                }

                int switchvalue2 = 2;
                switch (switchvalue2) {
                    case 1 -> System.out.println("1");
                    case 2 -> System.out.println("2");
                    case 3,4,5 -> {
                        System.out.println("3,4,5");
                        System.out.println("è "+ switchvalue2);
                    }
                    default -> System.out.println("nessuno di questi");
                }

                String month = "November";
                System.out.println(month+" is in the "+ getQuarter(month)+ " quarter");

            }
            public static String getQuarter (String month){
                switch (month){
                    case "Genuary":
                    case "February":
                    case "March":
                        return "1st";
                    case "April":
                    case "May":
                    case "June":
                        return "2nd";
                    case "July":
                    case "August":
                    case "September":
                        return "3rd";
                    case "October":
                    case "November":
                    case "December":
                        return "4th";
                }
                return "bad";
            }
            public static String getQuarter2 (String month) {
                return switch (month) {
                    case "Genuary", "February", "March" -> "1st";
                    case "April", "May", "June" -> "2nd";
                    case "July", "August", "September" -> "3rd";
                    case "October", "November", "December" -> "4th";
                    default -> "bad";
                };
            }
// da vedere la parola chiave yield

}