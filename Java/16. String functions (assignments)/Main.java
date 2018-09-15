import java.io.PrintStream;

class Main {
    public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        String s = new String("Welcome!");

        ps.println("String is \"Welcome!\"");
        ps.println("Length of String - " + s.length());
        ps.println("Starting index of \"come\" - " + s.indexOf("come"));
        ps.println("Index of \'e\' after 3rd index - " + s.indexOf('e', 3));
        ps.println("Last index of \"e\" - " + s.lastIndexOf('e'));
        ps.println("Character at index 6 - " + s.charAt(6));
        ps.println("String after concatenating \" Home\" - " + s.concat(" Home."));
        ps.println("String afte replacing \"lcom\" with \"bsite\" - " + s.replace("lcome", "bsite"));

        String s2 = "welcome";
        if(s.equals(s2)) {
            ps.println("First and second string equal");
        } else {
            ps.println("First and second string are not equal");
        }
    }
}