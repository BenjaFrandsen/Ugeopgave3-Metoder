public class Bank {

    double balance = 0.0;
    String accountName = "Benjas account:";


    void deposit100() {
        balance += 100;
    }

    void withdraw50() {
        balance -= 50;
    }

    void printBalance() {
    System.out.println(balance);
    }

    void main() {
        System.out.println(accountName);
        deposit100();
        deposit100();
        withdraw50();
        printBalance();

    }
}