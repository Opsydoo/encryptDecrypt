/**
 * The purpose of this is class is to create an application that encrypts (or pretends to) data that is entered by the user
 * so that when transmitting over the Internet the actual value entered cannot be determined.
 * The user enters a 4 digit code, the program then rearranges this and arranges/decrypts it at the recipient end
 *
 * The program makes use of arrays with a lot of manipulation using For and While loops.
 */

public class encrypt {

    //Array declaration, no need to explicitly define array
    private int [] valueEntered;

    //Constructor declaration
    public encrypt (int valueEntered[]) {
        this.valueEntered = valueEntered;
    }

    //Definition of the actual encryption method, where the magic happens

    public int [] encryptMethod () {

//Declaration and initialization of variables
        int j = 0;
        int k = 0;
        int q;
        int r;
        int m =0;

/*Declaration and initialization of array which will act as a buffer to hold the original values
  entered by the user prior to being manipulated/encrypted
*/
        int[] tempArray = new int[4];

        //While loop that increments the elements of the array by 7
        while (j < valueEntered.length) {
            valueEntered[j] = valueEntered[j] +7;
            j++;
        }

        //While loop that gets the remainder of the elements in the array after dividing by 10
        while (m < valueEntered.length) {
            valueEntered[m] = valueEntered[m] %10;
            m++;
        }

        //For loop that copies the elements of the main array to a buffer array
        for (int c=0; c <4; c++) {
            tempArray[c] = valueEntered[c];
        }

        //Initialising the q variable
        q=tempArray.length-1;

        //While loops to manipulate the positions of the elements
        while (q > 0) {
            for (r=1;r < valueEntered.length;r +=2) {
                valueEntered[r] = tempArray[q];
                q -=2;
            }
            //q -=2;
        }
        int u=tempArray.length-2;
        int  v=1;
        while (u>=0){
            for (v=0;v < valueEntered.length;v +=2) {
                valueEntered[u] = tempArray[v];
                u -=2;
            }
        }

        //Print out the values after the positions have been manipulated
        while (k < valueEntered.length){
            System.out.println(valueEntered[k]);
            k++;
        }
        return valueEntered;
    }

}
