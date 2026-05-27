public class Guess{
    public static void main(String[]args){
        int secret=33;
        int guess;
        do{
            guess = in.nextInt();

            if(guess<secret)
            {
                System.out.println("guess is smaller");
            }
            else if(guess>secret)
            {
                System.out.println("guess is higher");
            }
        }while(guess!=secret);
        System.out.println("guess is correct");
    }
}
