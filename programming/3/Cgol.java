import java.io.*;
import java.util.*;

/**
 * Conway's Game of Life by...
 * David Moste
 * collaborators: Taylor Grant-Knight, Jessica Novillo Argudo
 */

/**
   The Rules of Life:
   Survivals:
   * A living cell with 2 or 3 living neighbours will survive for the next generation.
   Deaths:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.
   Births:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.
   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation.
*/

public class Cgol
{

  //create, initialize, and return  empty board (all cells dead)
  public static char[][] createNewBoard( int rows, int cols )
  {
    char[][] board = new char[rows][cols];
    
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        board[i][j] = '-';
      }
    }
    
    return board;
  }


  //print the board to the terminal
  public static void printBoard( char[][] board )
  {
    for(char[] row : board){
      for(char value : row){
        System.out.print(value);
      }
      System.out.println("");
    }
  }


  //set cell (r,c) to val
  public static void setCell( char[][] board, int r, int c, char val )
  {
    board[r][c] = val;
  }


  //return number of living neigbours of board[r][c]
  public static int countNeighbours( char[][] board, int r, int c )
  {
    int neighbours = 0;
    
    for(int i = r-1; i <= r+1; i++){
      if(i >= 0 && i < board.length){
        for(int j = c-1; j <= c+1; j++){
          if(j >= 0 && j < board[0].length){
            if(board[i][j] == 'X' && !(i == r && j == c)){
              neighbours++;
            } 
          }
        } 
      }
    }

    return neighbours;
  }


  /**
     precond: given a board and a cell
     postcond: return next generation cell state based on CGOL rules
     (alive 'X', dead ' ')
  */
  public static char getNextGenCell( char[][] board,int r, int c )
  {
    int neighbours = countNeighbours(board, r, c);
    char newState;

    if(neighbours == 3){
      newState = 'X';
    }else if(neighbours == 2 && board[r][c] == 'X'){
      newState = 'X';
    }else{
      newState = '-';
    }

    return newState;
  }


  //generate and return a new board representing next generation
  public static char[][] generateNextBoard( char[][] board )
  {
    char[][] newBoard = new char[board.length][board[0].length];

    for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board[i].length; j++){
        newBoard[i][j] = getNextGenCell(board, i, j);
      }
    }
    
    return newBoard;
  }


  public static void main( String[] args )
  {
    char[][] board;
    board = createNewBoard(25,25);
    
    //breathe life into some cells:
    Random rand = new Random();
    
    for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board[i].length; j++){
        if(rand.nextInt(100) < 80){
          setCell(board, i, j, '-');
        }else{
          setCell(board, i, j, 'X');
        }
      }
    }
    
    // TASK:
    // Once your initial version is running,
    // try out different starting configurations of living cells...
    // (Feel free to comment out the above three lines.)
    System.out.println("Gen X:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    board = generateNextBoard(board);
    System.out.println("Gen X+1:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    board = generateNextBoard(board);
    System.out.println("Gen X+2:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class