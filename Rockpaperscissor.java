import java.util.Scanner;

public class Rockpaperscissor {
    Scanner in = new Scanner(System.in);
    String username = "";
    int userScore = 0;
    int computerScore = 0;

   Rockpaperscissor() {
        System.out.println("Enter your name:");
        String user = in.nextLine();
        System.out.println("Welcome " + user);
        username = user;
    }

    void play() {
        int userChoice;
        do {
            System.out.println("Choose an option ..");
            System.out.println("1 : Rock , 2 : Paper , 3 : Scissors , 4 : Quit");
            userChoice = in.nextInt();
            if (userChoice == 4) {
                System.out.println("Goodbye, " + username + "!");
                break;
            }

            int computerChoice = (int) (Math.random() * 3) + 1;

            switch (userChoice) {
                case 1:
                    switch (computerChoice) {
                        case 1:
                            System.out.println(username + " Rock - Computer Rock (TIE)");
                            break;
                        case 2:
                            System.out.println(username + " Rock - Computer Paper (Computer wins)");
                            computerScore++;
                            break;
                        case 3:
                            System.out.println(username + " Rock - Computer Scissors (" + username + " wins)");
                            userScore++;
                            break;
                        default:
                            System.out.println("Enter a valid input!");
                    }
                    break;

                case 2:
                    switch (computerChoice) {
                        case 1:
                            System.out.println(username + " Paper - Computer Rock (" + username + " wins)");
                            userScore++;
                            break;
                        case 2:
                            System.out.println(username + " Paper - Computer Paper (TIE)");
                            break;
                        case 3:
                            System.out.println(username + " Paper - Computer Scissors (Computer wins)");
                            computerScore++;
                            break;
                        default:
                            System.out.println("Enter a valid input!");
                    }
                    break;

                case 3:
                    switch (computerChoice) {
                        case 1:
                            System.out.println(username + " Scissors - Computer Rock (Computer wins)");
                            computerScore++;
                            break;
                        case 2:
                            System.out.println(username + " Scissors - Computer Paper (" + username + " wins)");
                            userScore++;
                            break;
                        case 3:
                            System.out.println(username + " Scissors - Computer Scissors (TIE)");
                            break;
                        default:
                            System.out.println("Enter a valid input!");
                    }
                    break;

                default:
                    System.out.println("Please choose a valid option.");
            }
            System.out.println("Score: " + username + " " + userScore + " - Computer " + computerScore);

        } while (userChoice != 4);
        System.out.println("Final Score: " + username + " " + userScore + " - Computer " + computerScore);
    }

    public static void main(String[] args) {
        Rockpaperscissor game = new Rockpaperscissor();
        game.play();
    }
}