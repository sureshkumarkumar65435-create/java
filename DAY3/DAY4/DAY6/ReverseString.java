public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";

        StringBuffer sb = new StringBuffer(str);
        sb.reverse();

        System.out.println("Reversed String: " + sb);
    }
}
