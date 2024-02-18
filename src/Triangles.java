import java.util.Scanner;

public class Triangles {

    public static void main(String[] args) {
        //initialize scanner and variables
        Scanner in = new Scanner(System.in);
        int sizeRange;
        char fillChar;
        char buildAnother = 'Y';

        //loop to give the user the option to build another triangle
        while (buildAnother == 'Y' || buildAnother == 'y') {
            //asks for size to read in to sizeRange
            System.out.print("Enter Size from 1 - 50: ");
            sizeRange = in.nextInt();

            //nested loop that keeps asking user if correct range isn't entered in
            while (sizeRange > 50 || sizeRange < 1) {
                //asks for size and reiterates the range to them
                System.out.println("Size must be between 1 - 50!");
                System.out.print("Enter size from 1 - 50: ");
                sizeRange = in.nextInt();
            }
            //asks for fill symbol to read in to fillChar
            System.out.print("Enter Fill Symbol: ");
            fillChar = in.next().charAt(0);
            //function call to build triangle based on user entered information
            triangleBuilder(fillChar, sizeRange);
            //gives user the option to make another triangle hitting Y keeps loop reiterating N terminates the loop
            System.out.print("Would you like another triangle Y/N? ");
            buildAnother = in.next().charAt(0);
        }

    }

    //function to build triangles with two parameters
    public static void triangleBuilder(char symbol, int rows) {
        //declared variable outside of while loop
        int r = 1;
        //loop that iterates sizeRange/row input by user
        while (r <= rows) {
            //nested loop that prints spaces
            for (int sp = rows; sp >= r; sp--) {
                System.out.print(" ");
            }
            //nested loop that prints fillChar/symbol
            for (int sy = 1; sy <= r; sy++) {
                System.out.print(symbol + " ");
            }
            //increment while loop by 1 each time
            r += 1;
            //adds a newline between to make the triangle
            System.out.println();
        }

    }


}
