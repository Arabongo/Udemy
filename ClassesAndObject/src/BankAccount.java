public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerNumber;

    public BankAccount(String number, double balance, String customerName, String customerEmail, String customerNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerNumber = customerNumber;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public String getCustomerNumber() {
        return customerNumber;
    }
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void depositFunds(double depositAmount){
        balance += depositAmount;
        System.out.println("Deposit of $"+depositAmount+" made. New balance is $"+balance);
    }

    public void withdrawFunds(double withdrawalAmount){
        if(balance - withdrawalAmount < 0){
            System.out.println("Insufficient Funds! You only have $"+balance+ " in your account");
        }else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of $"+withdrawalAmount+ " processed, Remaining balance = $"+balance);
        }
    }
}
