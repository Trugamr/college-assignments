class Primary {
    Primary(int rollNo, String name) {
        System.out.printf("%s\'s roll number is %d", name, rollNo);
    }
    public static void main(String[] args) {
        Secondary s = new Secondary(8083, "Jane");
    }
}

class Secondary extends Primary {
    Secondary(int rollNo, String name) {
        super(rollNo, name);
    }
}