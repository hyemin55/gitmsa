package bank;

public class BankAccount {

    int balance = 0;

    public int checkMyBalance() {
        int balance = 200;
        System.out.println("잔액" + this.balance);
//        this.balance는 위의 int balance를 참조하고
//        그냥 balance만 적는다면 가장 가까운 balance값을 참조한다.

        return balance;
    }

    public void deposit(int a) {
        balance += a;
    }

    public void withdraw(int a) {
        balance -= a;
    }
}
