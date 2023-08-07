package Test1;

public class Matrixmulti {

// main method
public static void main(String[] args) {

// declare and initialize a 3x2 matrix
int a[][] = { { 1, 2 }, { 3, 4 }, {5, 6} };
// declare and initialize a 2x4 matrix
int b[][] = { { 6, 7, 8, 9 }, { 1, 2, 3, 4 } };

// find row size of first matrix
int row = a.length; // 3
// find column size of second matrix
int  column = b[0].length; // 4

// declare new matrix to store result (3x4)
int c[][] = new int[row][column];

// multiplication of matrix
c = multiplyMatrix(a, b);

// display all matrices
System.out.println("Matrix A = ");
displayMatrix(a);
System.out.println("Matrix B = ");
displayMatrix(b);
System.out.println("Matrix C (Product) = ");
displayMatrix(c);
  }

// method to display the matrix
public static void displayMatrix(int[][] matrix) {
// outer loop for row
for(int i=0; i<matrix.length; i++) {
// inner loop for column
for(int j=0; j<matrix[i].length; j++) {
System.out.print(matrix[i][j]+" ");
      }
System.out.println(); // new line
    }
  }

// method to calculate product of two matrix
// matrices can be square or non-square matrix
public static int[][] multiplyMatrix(int[][] a, int[][] b) {

// find row size of first matrix
int row = a.length;
// find column size of second matrix
int column = b[0].length;

// declare new matrix to store result
int product[][] = new int[row][column];

// find product of both matrices
// outer loop upto row of A
for (int  i = 0; i<row; i++) {
// inner-1 loop utp0 column of B
for (int j = 0; j<column; j++) {
// assign 0 to the current element
product[i][j] = 0;

// inner-2 loop utpoA[0].length
for (int k = 0; k<a[0].length; k++) {
product[i][j] += a[i][k] * b[k][j];
        }
      }
    }

return product;
  }

}



