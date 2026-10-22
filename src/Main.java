public class Main {
    public static void main() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        int[] samples = {8, 19, 27, 2, 54, 99, 72};
        int[] sampleb = {50,25,75,10,30,60,85};
        for(int i: sampleb){
            bst.add(i);
        }

        System.out.println("Data added to archive!");
        System.out.println("Height = " + bst.height());
    }
}
