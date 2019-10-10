package FindingComplexity;

public class BigO {
    public static void simpleFunc(int n){
        int a =9;
        int b=6;

        int sum = a+b+n;
        int product = a * b * n;
        int division = a * n / b;

        System.out.println(String.format("The Sum is %s, The Product is %s and the Division is %s", sum, product, division));
        System.out.println("This is O(1) complexity");
    }

    public static void singleForLoop(int n){
        for (int i = 0; i < n; i++) {
            System.out.println(String.format("Square of %s is %s", i, Math.pow(i,2.0)));
        }
        System.out.println("This is O(n) complexity");
    }
    public static void singleWhileLoop(int n){
        int i =0;
        while(i < n){
            System.out.println(String.format("Square of %s is %s", i, Math.pow(i,2.0)));
            i++;
        }
        System.out.println("This is O(n) complexity");
    }
    public static void ifStatement(int n){
        if(n % 2 == 0){
            System.out.println("The i/p is even");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println("printing: " + i);
            }
        }
        System.out.println("This is O(n) complexity");
    }

    public static void nestedForLoop(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(String.format("Product of %s and %s is %s", i, j, i*j));
            }
        }
        System.out.println("This is O(n^2) complexity");
    }

    public static void main(String[] args) {
        ifStatement(9);


    }
}
