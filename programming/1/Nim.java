/**
 * Game of Nim by...
 * David Moste
 * collaborators: Nicole Cojuangco, Christine Marra, Parmanand Mohanlall
 */

import java.io.*;
import java.util.*;

public class Nim{
  public static void main(String[] args){
    int stones = 12;
    
    while(stones > 0){
      stones = userTurn(stones);
      if(stones > 0){
        stones = aiTurn(stones);
        if(stones < 1){
          System.out.println("The AI won :(");
        }
      } else{
        System.out.println("You won!");
      }
    }
  }

  public static int userTurn(int stones){
    Scanner input = new Scanner(System.in);
    
    int stonesTaken;
    
    System.out.printf("There are %d stones left in the bag.\n", stones);
    System.out.print("How many stones do you want to pick? ");
    stonesTaken = input.nextInt();
      
    stones -= stonesTaken;
    System.out.printf("There are %d stones remaining.\n", stones);

    return stones;
  }

  public static int aiTurn(int stones){
    Random rand = new Random();
    
    int stonesTaken;
    
    if(stones < 3){
      stonesTaken = rand.nextInt(stones) + 1;
      } else{
        stonesTaken = rand.nextInt(3) + 1;
      }

    System.out.printf("The AI removed %d stones.\n", stonesTaken);
    stones -= stonesTaken;
    System.out.printf("There are %d stones remaining.\n", stones);

    return stones;
  }
}