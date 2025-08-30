class Basics {

    final static int EXAMPLE_CONST = 10;

    public static void main(String[] args) {
        int x = 5, y = 6, z = 7;
        float f = 3.2f;
        char c = 'c';
        String s = "Example string";
        System.out.println(x + y + z);
        System.out.println("Constant: " + EXAMPLE_CONST);
        System.out.println("Float: " + f);
        System.out.println("Char: " + c);
        System.out.println("String: " + s + ", length: " + s.length());

        char[] letters = {'a', 'b', 'c', 'd'};
        
        for (char ch : letters) {
            System.out.print(ch);
        }
        System.out.println();

    }
}

