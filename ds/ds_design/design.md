# Phonebook Design Challenge

## Structure
The pnhonebook will contain two structures:
* An unsorted LinkedList
* A sometimes sorted ArrayList

### add
The add method will simply add the new person to the front of a LinkedList and the end of an ArrayList. This has a constant runtime.

### find
We would use a mergeSort to sort the ArrayList and then a binary search to find the value. This will run in O(nLog(n)).

### remove
Remove can be done through any type of search and remove. We chose a linear search since the ArrayList may or may not be sorted at this point. This would need to be applied to both the LinkedList and the ArrayList. The runtime for remove would be O(n).

### printList
printList will run through the ArrayList and print every element. The runtime of printList would be O(n).