package StringOperations;

public class ReverseAStringXor {
    public static void main(String[] args) {
        System.out.println(reverseAStringWithOutUsingThirdVariable("Sreeni"));
    }

    public static String reverseAStringWithOutUsingThirdVariable(String stringToReverse){
        char[] str = stringToReverse.toCharArray();
        int begin = 0;
        int end = str.length -1;
        while (begin < end){
            str[begin]  = (char)(str[begin] ^ str[end]);
            str[end] = (char) (str[begin] ^ str[end]);
            str[begin] = (char) (str[begin] ^ str[end]);
            begin ++;
            end --;
        }
        System.out.println(str);
        return str.toString();
    }
}
