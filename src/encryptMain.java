import java.util.Scanner;

/**
 *The main method for the program written to perform encryption and decryption of the value entered by users
 */
public class encryptMain {

    static Scanner message = new Scanner(System.in);
    public static void main(String[] args) {

        //array declaration
        int pinHolder[] = new int [4];
        int placeHolder[];

        /*Receive digits entered by users. The value
        entered is parsed (delimited by white-space) and then
        stored in an array
        */
        System.out.print("Enter 4 digit code: ");
        String line1 = message.nextLine();
        String[] numbers1 = line1.split("");
        for (int i=0;i<numbers1.length;i++) {
            pinHolder[i] = Integer.parseInt(numbers1[i]);
        }

        //Instance of the encrypt class
        encrypt enc = new encrypt(pinHolder);

        //Calling the encryptMethod and storing the value returned in an array
        placeHolder=enc.encryptMethod();

        //Instance of the decrypt class and passing the encrypted value as parameter
        decrypt dec = new decrypt(placeHolder);

        //Calling the decryptMethod
        dec.decryptMethod();
    }
}
