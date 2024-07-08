package JavaCollection;

public class Tree<Integer> {
    private Node<Integer> root;
    private static int size=0;
    public Tree(){
        root= new Node();
    }
    public void add(Integer data){
        Node node=new Node<>();
        node.setData(data);
        if(size==0){
            root=node;
        } else {
            int d=(int)data;
            int r=(int)root.getData();
            if(d < r){

            } else {

            }
        }
        size++;
    }
    public void showAllValues(){
        Node<Integer> temp=root;
        while (temp!=null){
            System.out.println(temp.getData());
            temp=temp.getLeft();
        }
    }
}
