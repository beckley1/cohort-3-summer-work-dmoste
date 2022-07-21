import java.io.*;
import java.util.*;

public class AnimatedSearchDriver {
    public static void main(String[] args) {
    	AnimatedSearch ss = new AnimatedSearch(20);
      ss.sort();
    	ss.binarySearchAnimated(5);
    }
}