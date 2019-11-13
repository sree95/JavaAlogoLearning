package BitWiseOperators;

public class BitwiseLogics {
    public static void main(String[] args) {
        System.out.println(AndOperator(12,25));
        System.out.println(OrOperator(12,25));
        System.out.println(XorOperator(12,25));
        System.out.println(ComplementOperator(12));
    }

    public static int AndOperator(int a, int b){
        return  a & b;
    }

    public static int OrOperator(int a, int b){
        return  a | b;
    }

    public static int XorOperator(int a, int b){
        return  a ^ b;
    }

    public static int ComplementOperator(int a){
        return  ~a;
    }
}
