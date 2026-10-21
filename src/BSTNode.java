public class BSTNode<T> {
    //f
    private T info;
    private BSTNode<T> left;
    private BSTNode<T> right;
    //c
    BSTNode(T element){
        this.info = element;
    }
    //m
    public T getInfo(){
        return info;
    }
    public BSTNode<T> getLeft(){
        return left;
    }
    public BSTNode<T> getRight(){
        return right;
    }
    public void setInfo(T info){
        this.info = info;
    }
    public void setLeft(BSTNode<T> node){
        this.left = node;
    }
    public void setRight(BSTNode<T> node){
        this.right = node;
    }
}
