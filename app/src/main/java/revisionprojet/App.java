/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package revisionprojet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    User florin = new User();
    florin.setFirstName("Florin");
    florin.setLastName("Strulea");
    florin.setUserId(1);

    Account compte1= new Account();
    Account compte2= new Account();

    compte1.setBalance(10000);
    compte1.setAccountName("Compte courant");
    compte1.setAccountId(
        1);
    compte2.setBalance(100000);
    compte2.setAccountName("Compte eparge");
    compte2.setAccountId(2);

    List<Account> accounts = new ArrayList<>();

    accounts.add(compte1);
    accounts.add(compte2);

    florin.setAccounts(accounts);

    compte1.checkBalance();
    compte1.checkBalance();
    compte1.makeDeposit(scan);
    compte1.makeDeposit(scan);
    compte1.makeDeposit(scan);
    compte1.makeDeposit(scan);
    compte1.makeDeposit(scan);
    compte1.makeDeposit(scan);
    compte1.makeDeposit(scan);
    compte1.makeDeposit(scan);
    compte1.makeDeposit(scan);
    compte1.makeDeposit(scan);
    compte1.view10Transactions();
    scan.close() ;      
    }
}
