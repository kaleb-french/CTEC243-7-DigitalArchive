public class Main {
    public static void main() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        int[] samples = {8, 19, 27, 2, 54, 99, 72};

        for(int i: samples){
            bst.add(i);
        }

        System.out.println("Data added to archive!");
    }
}
