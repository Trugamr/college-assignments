import java.io.PrintStream;

class MyClass {
    public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        
        Bank b;
        b = new SBI();
        ps.println("Interest rate is " + b.getRate() + "%");
        b = new PNB();
        ps.println("Interest rate is " + b.getRate() + "%");
        
        PNB p = new PNB();
        p.displaySuperRate();
    }
}

class Bank {
    double getRate() {
        return 0;
    }
}

class SBI extends Bank {
    double getRate() {
        return 7.75;
    }
}

class PNB extends Bank {
    double getRate() {
        return 8;
    }

    void displaySuperRate() {
        System.out.println("Interest rate is " + super.getRate() + "%");
    }
}