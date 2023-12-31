package JavaCollection;

public class Node<T> {
    private T data;
    private Node left;
    private Node right;
    public Node(){
        data=null;
        left=null;
        right=null;
    }
    public void setData(T data){
        this.data=data;
    }
    public T getData(){
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
