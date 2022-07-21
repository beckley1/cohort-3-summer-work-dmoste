import java.io.*;
import java.util.*;

public class AnimatedSearchDriver {
    public static void main(String[] args) {
    	AnimatedSearch ss = new AnimatedSearch(20);
      ss.sort();
    	int index = ss.binarySearchAnimated(2);
      System.out.println("The value was at: " + index);
    }
}