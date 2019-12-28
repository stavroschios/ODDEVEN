import java.util.Scanner;

public class ODDEVEN {

    public static void main(String[] args) {
        int[] array = new int[7];
        int even = 0;
        int odd = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers: ");

        String lotto = scanner.nextLine();
        String[] number1 = lotto.split(" ");
        int counter = 0;
        for (int i=0; i < number1.length; i++) {
            array[i] = Integer.parseInt(number1[i]);
            counter++;
            if ( i % 2 == 0 ) {
                even++;
            }
            else{
                odd++;
            }
            if ( counter == 7 )
                break;
        }

            System.out.println("The numbers have " + even +
                            " even, and " + odd + " odd numbers.");

    } // end main
} // end public
