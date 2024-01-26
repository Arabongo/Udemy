public class Main {
    public static void main(String[] args) {

        int currentYear = 2024;
        String usersDateOfBirth = "1996";
        int dateOfBirth = Integer.parseInt(usersDateOfBirth);
        System.out.println("Age : "+ (currentYear-dateOfBirth));

        String usersAgeWithPartialYear ="22.5";
        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
        System.out.println("The users say he's : "+ ageWithPartialYear) ;



  }
}