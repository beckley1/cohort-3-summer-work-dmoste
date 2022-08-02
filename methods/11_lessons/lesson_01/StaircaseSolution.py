from Arrow import *

arrow = Arrow()

## Build a function that creates a single step.
## A step looks like the following:
## ----
## |
## |
def step():
  ## Replace with step() code
  arrow.forward()
  arrow.forward()
  arrow.right()
  arrow.forward()
  arrow.forward()
  arrow.forward()
  arrow.forward()

## Build a function that creates a staircase
## A staircase looks like the following:
##         ----
##         |
##     ----|
##     |
## ----|
## |
## |
def staircase():
  ## Replace with staircase() code
  step()
  arrow.left()
  step()
  arrow.left()
  step()

## CHALLENGE
## Build a function that creates an entire diamond.
## This should be four sides placed together.
def diamond():
  ## Replace with diamond() code
  pass

def main():
  arrow.left()
  staircase()
  arrow.printRoute()

main()