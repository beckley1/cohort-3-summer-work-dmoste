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
        board[i][j] = ' ';
      }
    }
    
    return board;
  }


  //print the board to the terminal
  public static void printBoard( char[][] board )
  {
    for(char[] row : board){
      for(char value : row){
        System.out.print(value + " ");
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
      newState = ' ';
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

  public static void setBoard(char[][] board, int alivePerc)
  {
    Random rand = new Random();
    
    for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board[i].length; j++){
        if(rand.nextInt(100) < alivePerc){
          setCell(board, i, j, 'X');
        }else{
          setCell(board, i, j, ' ');
        }
      }
    }
  }

  public static void delay(int n)
  {
    try {
      Thread.sleep(n);
    }
    catch(InterruptedException e) {}
  }

  public static void animate(char[][] board, int n)
  {
    //place cursor at origin (upper left)
    System.out.print("\033[0;0H\n");

    System.out.printf("Generation %d\n", n);
    printBoard(board);
    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - ");

    delay(100);
  }

  public static void main( String[] args )
  {
    //clear the shell and hide the cursor
    System.out.print("\033[2J\033[?25l");

    //create the board
    char[][] board;
    board = createNewBoard(25,25);
    
    //breathe life into some cells
    setBoard(board, 20);

    //generate and animate the generations
    for(int i = 0; i < 101; i++){
      animate(board, i);
      board = generateNextBoard(board);
    }

    //show the cursor
    System.out.print("\033[?25h");
  }//end main()

}//end class