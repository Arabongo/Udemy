public class Callenge2 {
    public static void main(String[] args) {
        //digit sum challenge
        System.out.println("the sum of the digits in number 1234 is "+ sumDigit(1234));
        System.out.println("the sum of the digits in number 1234 is "+ sumDigit(-125));
        System.out.println("the sum of the digits in number 1234 is "+ sumDigit(4));
        System.out.println("the sum of the digits in number 1234 is "+ sumDigit(32123));
    }
    public static int sumDigit(int number){
        if(number<0){
            return -1;
        }
        int sum = 0;
        while (number>9){
            sum += (number%10);
            number = number /10;
        }

        sum += number;
        return sum;
    }
}
