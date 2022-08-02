class Board:
  def __init__(self):
    self.board = []
    for i in range(0, 50):
      self.board.append([])
      for j in range(0, 50):
        self.board[i].append(" ")

  def printBoard(self):
    for i in range(0, 50):
      line = ""
      for j in range(0, 50):
        line += self.board[i][j]
      print(line)

  def addCharacter(self, character, x_loc, y_loc):
    self.board[y_loc][x_loc] = character