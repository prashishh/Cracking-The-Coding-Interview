
/*
 * Given an image represented by an NXN matrix, where each pixel in the image is 4 
 * bytes, write a method to rotate the image by 90 degrees. Can you do this in  
 * place?
 * 
 * 
 */

/* First Attempt */
public class ImageRotation {
    
    int SIZE = 5;
    int[][] image = new int[SIZE][SIZE];
    int[][] result = new int[SIZE][SIZE];
    public ImageRotation() {};
    
    public void createImageMatrix() {
        for( int i = 0; i < SIZE; i++ ) {
            for( int j = 0; j < SIZE; j++ ) {
                image[i][j] = (int) (Math.random() * (9));
            }
        }
    }

    public void printImageMatrix() {
        for( int i = 0; i < SIZE; i++ ) {
            for( int j = 0; j < SIZE; j++ ) {
                System.out.print(image[i][j] + " ");
            }
            System.out.print("\n");
        }

                    System.out.print("\n");

            System.out.print("\n");


        for( int i = 0; i < SIZE; i++ ) {
            for( int j = 0; j < SIZE; j++ ) {
                System.out.print(result[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    // trick is to store a temp value and swap value respectively
    public void rotateImageMatrix() {
        for( int i = 1; i < SIZE; i++ ) {
            for( int j = 0; j < SIZE; j++ ) {
                result[i-1][j] = image[i][j]; 
            }
        }
        
    }

    public static void main( String args[] ) {
        ImageRotation ir = new ImageRotation();
        ir.createImageMatrix();
        ir.printImageMatrix();

        ir.rotateImageMatrix();
        ir.printImageMatrix();

    }
}
