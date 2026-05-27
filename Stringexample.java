public class Stringexample {
    public static void main(String[] args) {

        String s = "red";

        switch (s) {

            case "red":
                System.out.println("Stop");
                break;

            case "green":
                System.out.println("Go");
                break;

            case "yellow":
                System.out.println("Wait");
                break;

            default:
                System.out.println("Invalid Signal");
        }
    }
}
