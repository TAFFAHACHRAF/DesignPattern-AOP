package TD1.exercice1.figure;

import java.util.ArrayList;
import java.util.List;

public class GroupFigure extends Figure{
    private List<Figure> figures=new ArrayList<>();
    public void addFigure(Figure figure){
        figures.add(figure);
    }
    public void removeFigure(Figure figure){
        figures.remove(figure);
    }

    public List<Figure> getFigures() {
        return figures;
    }

    @Override
    public void show() {
        System.out.println("Group of figures");
    }
}
