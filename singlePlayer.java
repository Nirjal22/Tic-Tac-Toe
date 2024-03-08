class singlePlayer {

  public void structure() {
    int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    // display matrix using for loops
    // outer loop for row
    for (int row = -0; row < matrix.length; row++) {
      // inner loop for column
      for (int column = 0; column < matrix[row].length; column++) {
        System.out.print(matrix[row][column] + " ");
      }
      System.out.println(); // new line
    }
  }

  public void mySinglePlayer() {
    structure();

  }
}