# Journal
Write your Journal questions and notes here.

Phase 1-
The foundation for our Binary Search Tree and it's node classes were created, and a test was completed. The add method uses a recursive help function with the base case of node == null to check and see if its null then we are creating a new node here, if not we are comparing the payload passed in against the nodes payload, then checking if its less or equal, or greater. if less or equal we are checking its left to see if it has a node, or if greater checking to its right, then repeating untill a null spot is found witht he base case. The Comparable<T> is needed because generic<T> doesn't normally have Comparable so with Extend T with Comparable<T> to enable this capability. 

Phase 2-
I rough drafted a prototype without realising the Math.max but was overly bloated then recreated a smaller version with Math.max. Created a base case that returns -1 when it hits null, assigns a heightL and calls recAdd for node.getLeft does the same for heightR and node.getRight and at the bottom returns 1 + Math.max comparing left and right. This will return the deepest path via a int that will represent the height.

Phase 3-
I created methods to taverese and print in either a inorder or preorder fashion. By chosing to go left before right a each node you naturally get the data in an ordered fashion, due to the smaller data always being store left and larger being stored on the right, by traversing in this way we can print at each step and get the data output in an ordered way.

Phase 4-
Tested different edge cases such as empty tree and only root, Running the early smaples vs the presorted data the inorder and preorder are the same when the data is presorted.
