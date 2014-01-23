
/*
 * Write an algorithm such that if an element in an MXN matrix is zero, 
 * its entire row and column is set to 0.
 * 
 * 
 */

/* First Attempt */
public class RowColZero {
    
    int SIZE = 5;
    int[][] matrix = new int[SIZE][SIZE];
    boolean[] row = new boolean[SIZE];
    boolean[] col = new boolean[SIZE];

    public RowColZero() {};
    
    public void createImageMatrix() {
        for( int i = 0; i < SIZE; i++ ) {
            for( int j = 0; j < SIZE; j++ ) {
                matrix[i][j] = (int) (Math.random() * (9));
            }
        }
        this.printImageMatrix();
    }

    public void printImageMatrix() {
        for( int i = 0; i < SIZE; i++ ) {
            for( int j = 0; j < SIZE; j++ ) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

    }

    public void makeZero() {
        for( int i = 0; i < SIZE; i++ ) {
            for( int j = 0; j < SIZE; j++ ) {
                if( matrix[i][j] == 0 ) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for( int i = 0; i < SIZE; i++ ) {
            for( int j = 0; j < SIZE; j++ ) {
                if( row[i] || col[j] ) 
                    matrix[i][j] = 0;
            }
        }

        this.printImageMatrix();
    }        

    public static void main( String args[] ) {
        RowColZero rzero = new RowColZero();
        rzero.createImageMatrix();
        rzero.makeZero();
    }
}
