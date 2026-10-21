# Journal
Write your Journal questions and notes here.

Phase 1-
The foundation for our Binary Search Tree and it's node classes were created, and a test was completed. The add method uses a recursive help function with the base case of node == null to check and see if its null then we are creating a new node here, if not we are comparing the payload passed in against the nodes payload, then checking if its less or equal, or greater. if less or equal we are checking its left to see if it has a node, or if greater checking to its right, then repeating untill a null spot is found witht he base case. The Comparable<T> is needed because generic<T> doesn't normally have Comparable so with Extend T with Comparable<T> to enable this capability. 
