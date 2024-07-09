//같은 클래스에서는 import는 적지 않는다.

package bank;

public class BackAccountMain {
    public static void main(String[] args) {
        System.out.println("시작");

        BankAccount park = new BankAccount();
        BankAccount yoon = new BankAccount();

        park.checkMyBalance();
        yoon.checkMyBalance();

        park.deposit(3000);
        yoon.deposit(4000);

        park.checkMyBalance();
        yoon.checkMyBalance();

        park.withdraw(1000);
        yoon.withdraw(2000);

        park.checkMyBalance();
        yoon.checkMyBalance();

        System.out.println("끝");
    }
}
