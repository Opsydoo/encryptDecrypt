/**
 * The purpose of this class is to decrypt the value that has been received (this has supposedly been transmitted over
 * the Internet. The decrypted value should match the original value entered by the user at the beginning.
 */
public class decrypt {

    //Array declaration, no need to explicitly define array
    private int [] encryptedValue;

    //Constructor declaration
    public decrypt (int encryptedValue[]) {
        this.encryptedValue = encryptedValue;
    }

    //Definition of the actual decryption method, where the magic happens
    public int [] decryptMethod() {
        int j = 0;
        int k = 0;
        int l=0;
        int q= 0;
        int r = 0;
        int m =0;

        int[] tempArray = new int[4];

        //While loop that decrements the elements of the array by 7
        while (j < encryptedValue.length) {
            encryptedValue[j] = encryptedValue[j] -7;
            j++;
        }

        //While loop that adds the value of 10 to the elements of the array
        while (l < encryptedValue.length) {
            encryptedValue[l] = encryptedValue[l] + 10;
            l++;
        }

        //While loop that gets the remainder of the elements after dividing by 10
        while (m < encryptedValue.length) {
            encryptedValue[m] = encryptedValue[m] %10;
            m++;
        }

        //For loop that copies the elements of the main array to a buffer array
        for (int c=0; c <4; c++) {
            tempArray[c] = encryptedValue[c];
        }

        //Initialising the q variable
        q=tempArray.length-1;

        //While loops to manipulate the positions of the elements
        while (q > 0) {
            for (r=1;r < encryptedValue.length;r +=2) {
                encryptedValue[r] = tempArray[q];
                q -=2;
            }
            //q -=2;
        }
        int u=tempArray.length-2;
        int  v=1;
        while (u>=0){
            for (v=0;v < encryptedValue.length;v +=2) {
                encryptedValue[u] = tempArray[v];
                u -=2;
            }
        }

        System.out.println("The decrypted value is printed below: ");

        //Print out the values after the positions have been manipulated
        while (k < encryptedValue.length){
            System.out.println(encryptedValue[k]);
            k++;
        }

        return encryptedValue;
    }
}
