public class Main {
    public static void main() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        int[] samples = {8, 19, 27, 2, 54, 99, 72};
        int[] sampleB = {50,25,75,10,30,60,85};
        int[] sampleC = {50, 25, 75, 10, 30, 60, 85};
        int[] skewedSample = {1, 3, 5, 7, 9, 11, 13, 15};
        for(int i: sampleC){
            bst.add(i);
        }
        BinarySearchTree<Integer> empty = new BinarySearchTree<>();
        System.out.println("Data added to archive!");
        System.out.println("Height = " + bst.height());
        System.out.println("Inorder = ");
        bst.inOrderTraversal();
        System.out.println("\nPreorder = ");
        bst.preOrderTraversal();
        System.out.println("\nEmpty Test = " + empty.height());
        BinarySearchTree<Integer> skewed = new BinarySearchTree<>();
        for(int i: skewedSample){
            skewed.add(i);
        }
        System.out.println("Skewed Test- inorder");
        skewed.inOrderTraversal();
        System.out.println("\npreorder- ");
        skewed.preOrderTraversal();

    }
}
