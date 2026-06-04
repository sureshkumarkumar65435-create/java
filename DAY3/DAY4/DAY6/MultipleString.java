public class MultipleString {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");

        sb.append(" Programming");
        sb.insert(4, " Language");
        sb.delete(4, 13);
        sb.reverse();

        System.out.println(sb);
    }
}
