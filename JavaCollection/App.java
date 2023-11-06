package JavaCollection;

public class App {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(78);
        list.add(74);
        list.add(74);
        list.delete(0);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
