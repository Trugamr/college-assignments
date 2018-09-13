import java.util.Scanner;
import java.io.PrintStream;

class Bank {
    public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        Scanner sc = new Scanner(System.in);

        Bank b = new Bank();
        ps.printf("\n\nChoose - \n1.Create Account\n2.Login Account\n3.Deposit\n4.Withdraw\n5.Check Balance\n(any other key to exit)\n\n");
        boolean flag = true;

        while(flag) {
            ps.printf("\nEnter Choice ");
            switch(sc.nextInt()) {
            case 1:
                ps.print("Enter name for new account ");
                b.createAccount(sc.next());
                break;
            case 2:
                ps.print("Enter name of account to login ");
                b.loginAccount(sc.next());
                break;
            case 3:
                ps.print("Enter amount to deposit ");
                b.depositMoney(sc.nextInt());
                break;
            case 4:
                ps.print("Enter amount to withdraw ");
                b.withdrawMoney(sc.nextInt());
                break;
            case 5:
                ps.printf("\nCurrent account balance is Rs. %d", b.checkBalance());
                break;
            default:
                flag = false;
            }
        }

    }

    int curClient = -1;
    int clientNumber = -1;
    String[] clients = new String[10];
    int[] balance = new int[10];

    void createAccount(String name) {
         clientNumber++;
         clients[clientNumber] = name;
         balance[clientNumber] = 0;
         System.out.printf("Account with name %s created sucessfully.\n", name); 
    }

    void loginAccount(String name) {
        int flag = 0;
        for(int i = 0; i < clients.length; i++) {
            if(name.equals(clients[i])) {
                curClient = i;
                System.out.printf("\n%s logged in.\n", clients[i]);
                flag = 1;
            }
        }
        if(flag == 0) {
            System.out.println("Account not found.");
        }
    }

    void depositMoney(int dep) {
        if(curClient == -1) {
            System.out.printf("\nLogin First.");
        } else {
            balance[curClient] += dep;
            System.out.printf("\n%d credited to %s, current balance is now Rs. %d", dep, clients[curClient], balance[curClient]);
        }
    }

    void withdrawMoney(int wit) {
        if(curClient == -1) {
            System.out.printf("\nLogin First.");
        } else if(balance[curClient] - wit < 0) {
            System.out.printf("\nNot enough balance, current account balance is %d", balance[curClient]);
        } else {
            balance[curClient] -= wit;
            System.out.printf("\n%d debited from %s, current balance is now Rs. %d", wit, clients[curClient], balance[curClient]);
        }
    }

    int checkBalance() {
        int bal = 0;
        if(curClient == -1) {
            System.out.printf("\nLogin First.");
        } else {
            bal = balance[curClient];
        }
        return bal;
    }
}