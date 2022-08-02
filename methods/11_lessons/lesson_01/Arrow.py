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

  def forward(self):
    if self.direction == "→":
      self.board.addCharacter("-", self.x_loc, self.y_loc)
      self.x_loc += 1
      self.board.addCharacter(self.direction, self.x_loc, self.y_loc)
    elif self. direction == "←":
      self.board.addCharacter("-", self.x_loc, self.y_loc)
      self.x_loc -= 1
      self.board.addCharacter(self.direction, self.x_loc, self.y_loc)
    elif self. direction == "↓":
      self.board.addCharacter("|", self.x_loc, self.y_loc)
      self.y_loc += 1
      self.board.addCharacter(self.direction, self.x_loc, self.y_loc)
    elif self. direction == "↑":
      self.board.addCharacter("|", self.x_loc, self.y_loc)
      self.y_loc -= 1
      self.board.addCharacter(self.direction, self.x_loc, self.y_loc)

  def left(self):
    if self.direction == "↓":
      self.direction = "→"
    elif self.direction == "←":
      self.direction = "↓"
    elif self.direction == "↑":
      self.direction = "←"
    elif self.direction == "→":
      self.direction = "↑"

    self.board.addCharacter(self.direction, self.x_loc, self.y_loc)

  def right(self):
    self.left()
    self.left()
    self.left()