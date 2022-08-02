from Board import *

class Arrow:
  def __init__(self):
    self.x_loc = 0
    self.y_loc = 24
    self.direction = "→"
    self.board = Board()
    self.board.addCharacter(self.direction, self.x_loc, self.y_loc)

  def printRoute(self):
    self.board.printBoard()