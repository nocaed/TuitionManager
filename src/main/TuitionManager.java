package main;
import java.util.Scanner;
/**
 * @author Thomas Brewer
 * @author Michael McLaughlin
 */

public class TuitionManager {
    Scanner stdin = new Scanner(System.in);
    StudentList cs213 = new StudentList();

    public void run() {
        String input;
        String[] params;
        boolean done = false;

        while(!done) {
            input = stdin.nextLine();
            params = input.split("\\s+");
            command = input.charAt(0);
            switch(command) {
                case 'I': case 'O': case 'N':
                    // add here
                    break;
                case 'R':
                    // remove here
                    break;
                case 'P':
                    // print here
                    break;
                case 'Q':
                    // terminate here
                    break;
                default:
                    // invalid command
                    break;
            }
            System.out.println("Program terminated");
        }
    }

    private void add(String member, char studentType) {
        // add a new Student here
    }

    private void remove(String member) {
        // remove a Student here
    }

    private void print() {
        // print all Students here
    }
}