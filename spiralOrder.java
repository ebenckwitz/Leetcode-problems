/*
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
*/

import java.util.*;
import java.lang.*;

class Main {
  public static List<Integer> spiralOrder(int[][] matrix){
    List<Integer> list = new ArrayList<Integer>();
    for(int i = 0; i < matrix[0].length; i++){
      list.add(matrix[0][i]);
    }
    for(int i = 1; i < matrix.length; i++){
      list.add(matrix[i][matrix[0].length - 1]);
    }
    for(int i = matrix[0].length - 1; i > 0; i--){
      list.add(matrix[matrix.length - 1][i-1]);
    }
    for(int i = 0; i < matrix[0].length - 1; i++){
      list.add(matrix[1][i]);
    }
    return list;
  }
}
