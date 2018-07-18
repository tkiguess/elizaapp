import java.util.Scanner;

public class elizaeasy {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String initializer, response,quit;


        System.out.println("wat up big boi, I heard you need some therapy");
        response= keyboard.nextLine();


        while (!response.equalsIgnoreCase("q")) {

            if (response.contains("boss") ){

                System.out.println("If I was a boos I would never hire you. Type q to quit");
            }

            else if (response.contains("dog")){

                System.out.println("exterminate your pets, they will get rid of a lot of hassle for you.");
            }
            else if (response.contains("girlfriend") ){
                System.out.println("Whatevers happening, just find someone new. Type q to quit");
            }

            else if (response.contains("family") ){
                System.out.println("Just abandon your entire family tree, go into a cave and meditate. Type q to quit");
            }
            else System.out.println("didnt get that big boi, try a question about your family, boss, or girlfriend. type q to quit");
            response = keyboard.next();
        }
    }
}
