Alicia Wade, Marieke Thomas, Erwin Lara, David Moste

### STRATEGIES USED:
* Intentional mistake
* [Javatutor](https://pythontutor.com/java.html#mode=edit)
* Written rubber duck: go through the code and comment what each line is doing
* Trace diagram


### ACTIVITY: Give students the code with errors:
```{java}
public static int fib(int n){
    return fib(n-1)+fib(n-2);
}
```

Students should run the code. Observe what happens (stack overflow error).

Run code together in [javatutor](https://pythontutor.com/java.html#mode=edit).

**Discuss with partner:** What is happening to the value of n? What should happen to it?

**Now code out this:**
```{java}
public static int fib(int n){
  if(n == 0 && n == 1){
    return n;
  }else{return fib(n-1)+fib(n-2)}
}
```

**Rubber duck:** Students should go through the code and add a comment for each line

**Discuss:** What comment did you put for line 16? What is the error with line 16?

Fix code to be working (see below for working code)

**Trace diagram:** In pairs, students go through the code and draw a trace diagram for fib(5)


***
### WORKING RECURSIVE FIBONACCI CODE
```{java}
// nth Fibonacci number generator

public class Fib
{

  public static int fib(int n){
    if(n == 0 || n == 1){
      return n;
    }else{
      return fib(n-1) + fib(n-2);
    }
  }


  public static void main( String[] args )
  {
      System.out.println( fib(0) ); // -> 0
      System.out.println( fib(1) ); // -> 1
      System.out.println( fib(2) ); // -> 1
      System.out.println( fib(3) ); // -> 2
      System.out.println( fib(4) ); // -> 3
      System.out.println( fib(5) ); // -> 5

      //now go big:
      System.out.println( fib(10) ); // -> 55
      System.out.println( fib(20) ); // -> 6765
      System.out.println( fib(40) ); // -> 102334155

  }//end main()

}//end class Fib
```