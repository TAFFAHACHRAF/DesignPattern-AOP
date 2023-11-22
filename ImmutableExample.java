import javax.management.ImmutableDescriptor;
import java.util.ArrayList;


public class ImmutableExample extends ImmutableDescriptor {
    public ImmutableExample(){
        list.add(74);
        list.add(74);
        list.add(74);
    }
    private ArrayList<Integer> list=new ArrayList<>();
    public ArrayList<Integer> getList(){
         /*ArrayList<Integer> newList=new ArrayList<>();
         for(int i=0;i<list.size();i++){
             newList.add(list.get(i));
         }
         return  newList;*/
        return list;
    }
    public void afficher(){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
