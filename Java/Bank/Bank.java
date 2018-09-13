import java.util.Scanner;
import java.io.PrintStream;

class Bank {
    public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        Scanner sc = new Scanner(System.in);
        
        boolean bankStatus = true;

        Client allClients[] = new Client[10];
        int clientIndex = 0;
        int currentClient = -1;

        do {
            ps.printf("\n\n1.Register Account\n2.Login Account\n3.Check Balance\n4.Deposit\n5.Withdraw\n6.Logout\n7.Exit\n\nEnter your choice - ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    ps.print("Enter your Name - ");
                    String registerName = sc.next();
                    allClients[clientIndex] = new Client(registerName);
                    ps.printf("\nAccount successfully created under name of %s with %d balance.", allClients[clientIndex].clientName, allClients[clientIndex].balance);
                    clientIndex++;
                    break;
                case 2:
                    ps.print("Enter your Name - ");
                    String loginName = sc.next();
                    boolean found = false;
                    for(int i=0; i<clientIndex; i++) {
                        if(allClients[i].clientName.equals(loginName)) {
                            currentClient = i;
                            found = true;
                            ps.println("\nSuccessfully logged in.");            
                        }
                    }
                    if(!found) {
                        ps.printf("No account was found with name %s.", loginName);
                    }
                    break;
                case 3:
                    if(currentClient == -1) {
                        ps.println("Please login first.");
                    } else {
                        ps.printf("\nAccount associated with name %s has balance of %d.", allClients[currentClient].clientName, allClients[currentClient].balance);
                    }
                    break;
                case 4:
                    if(currentClient == -1) {
                        ps.println("Please login first.");
                    } else {
                        ps.printf("\nEnter amount to deposit - ");
                        int tempDep = sc.nextInt();
                        int afterDep = allClients[currentClient].deposit(tempDep);
                        ps.printf("\n%d successfully credited to %s, balance is %d.", tempDep, allClients[currentClient].clientName, afterDep);                        
                    }
                    break;
                case 5:
                    if(currentClient == -1) {
                        ps.println("Please login first.");
                    } else {
                        ps.printf("\nEnter amount to withdraw - ");
                        int tempWit = sc.nextInt();
                        boolean afterWit = allClients[currentClient].withdraw(tempWit);
                        if(afterWit) {
                            ps.printf("\n%d successfully debited from %s, balance is %d.", tempWit, allClients[currentClient].clientName, allClients[currentClient].balance);
                        }
                    }
                    break;
                case 6:
                    if(currentClient == -1) {
                        ps.println("\nNo one currently logged in.");
                    } else {
                        ps.printf("\nUser %s successfully logged out.\n", allClients[currentClient].clientName);
                        currentClient = -1;
                    }
                    break;
                case 7:
                    bankStatus = false;
                    break;
                default: 
                    ps.println("\nInvalid choice!");
            }
        } while(bankStatus);
        ps.printf("\nHope to see you again!\n");
    }
}

class Client {
    int currentAccNumber = 100;
    
    String clientName;
    int clientAccNumber, balance;

    Client(String name) {
        this.clientName = name;
        this.balance = 0;
        this.clientAccNumber = currentAccNumber;
        this.currentAccNumber++;
    }

    int deposit(int money) {
        this.balance += money;
        return this.balance;
    }

    boolean withdraw(int money) {
        if(this.balance - money < 0) {
            System.out.printf("\nInsufficient Balance.\n");
            return false;           
        } else {
            this.balance -= money;
            return true;
        } 
             
    }
}