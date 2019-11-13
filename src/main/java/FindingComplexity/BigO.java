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

    public static void twoForLoops(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("Printing "+ i);
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("Printing "+ i);
        }
        System.out.println("This is O(n) complexity");
    }

    public static void twoForLoopsNM(int n, int m){
        for (int i = 0; i < n; i++) {
            System.out.println("Printing "+ i);
        }
        for (int i = 0; i < m; i++) {
            System.out.println("Printing "+ i);
        }
        System.out.println("This is O(n+m) complexity");
    }

    public static void twoForLoopsNAndM(int n, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Printing "+ i * j);
            }
        }
        System.out.println("This is O(n * m) complexity");
    }

    public static void twoForLoopsNestedAndNonNested(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(String.format("Product of %s and %s is %s", i,j, i*j));
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Printing "+ i);
        }
        System.out.println("This is O(n* n) complexity");
    }

    public static void twoLoopsNotCompleteStraightForward(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n; j < n/2; j--) {
                System.out.println(String.format("Value of i: %s j: %s", i,j));
            }
        }
        System.out.println("This is O(n * n/2) == O(n^2) complexity");
    }

    public static void doublingLoopVariable(int n){
        for (int i = 0; i < n;) {
            System.out.println("Value of i is: "+ i);
            i = i *2;
        }
        System.out.println("This is O(n/2) or O(nlogn) complexity");
    }

    public static void main(String[] args) {
        ifStatement(9);


    }
}
