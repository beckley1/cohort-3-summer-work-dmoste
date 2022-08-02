## PROVIDE
from Arrow import *

## PROVIDE
myArrow = Arrow()
myArrow.show()

## ----------Live coding starts here----------

## STUDENT PROMPT: What is a possible algorithm that can get my arrow to face to the right?
myArrow.left()
myArrow.left()
myArrow.left()

## STUDENT PROMPT: Based on prior code written above, how can I view the current direction of my arrow?
myArrow.show()

## BIG IDEA: There's a way to make this algorithm operate much easier for the person writing the code: we can build something called a function.

## Build the right function in Arrow.py

## BIG IDEA: Let's look at how we can implement our new function

## PROVIDE
newArrow = Arrow()
newArrow.show()

## BEEG REVEAL:This is now the entire set of code we need to write in order to make our new arrow face to the right.
newArrow.right()
newArrow.show()