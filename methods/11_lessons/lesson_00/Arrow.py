class Arrow:
  def __init__(self):
    self.currentState = "↑"

  def show(self):
    print(self.currentState)
  
  def left(self):
    if self.currentState == "↓":
      self.currentState = "→"
    elif self.currentState == "←":
      self.currentState = "↓"
    elif self.currentState == "↑":
      self.currentState = "←"
    elif self.currentState == "→":
      self.currentState = "↑"

  def right(self):
    self.left()
    self.left()
    self.left()