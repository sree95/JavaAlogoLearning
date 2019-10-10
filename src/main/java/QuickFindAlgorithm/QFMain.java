package QuickFindAlgorithm;

public class QFMain {
    public static void main(String[] args) {
        QuickFind qf = new QuickFind(10);
        System.out.println(qf.connected(1,2));
        qf.union(1,2);
        System.out.println(qf.connected(1,2));
    }
}
