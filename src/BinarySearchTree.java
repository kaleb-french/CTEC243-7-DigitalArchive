public class BinarySearchTree<T extends Comparable<T>>{
    //f
    private BSTNode<T> root;
    //c
    BinarySearchTree(){

    }
    //m
    public void add(T element){
        root = recAdd(element, root);
    }
    private BSTNode<T> recAdd(T element, BSTNode<T> node){
        if(node == null){
            return new BSTNode<>(element);
        }
        if (element.compareTo(node.getInfo()) <= 0){
            node.setLeft(recAdd(element, node.getLeft()));
        } else {
            node.setRight(recAdd(element, node.getRight()));
        }
        return node;
    }
    public int height(){
        return recHeight(root);
    }
    private int recHeight(BSTNode<T> node){
        if(node == null){
            return -1;
        }
        int heightL = recHeight(node.getLeft());
        int heightR = recHeight(node.getRight());

        return 1 + Math.max(heightL, heightR);
    }
    public void inOrderTraversal() {
        recInOrder(root);
    }

    private void recInOrder(BSTNode<T> node) {
        if (node == null) {
            return;
        }

        recInOrder(node.getLeft());
        System.out.print(node.getInfo() + " ");
        recInOrder(node.getRight());
    }
    public void preOrderTraversal() {
        recPreOrder(root);
    }

    private void recPreOrder(BSTNode<T> node) {
        if (node == null) {
            return;
        }

        System.out.print(node.getInfo() + " ");
        recPreOrder(node.getLeft());
        recPreOrder(node.getRight());
    }
}
