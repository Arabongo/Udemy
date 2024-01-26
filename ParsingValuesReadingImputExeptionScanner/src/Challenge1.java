import java.util.Scanner;
public class Challenge1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        double sum = 0;
        while (counter < 5){
            System.out.println("Enter number #" + counter + ":");
            String nextNumber = scanner.nextLine();
            try {
                //int number = Integer.parseInt(nextNumber);
                double number =Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            }catch (NumberFormatException nfe){
                System.out.println("Invalid Number");
            } // posso anche usare do while al posto di while inserendo qui ( while (counter < 5))
              // e sopra il do
        }
        System.out.println("The sum of the numbers = " + sum);
    }
}
