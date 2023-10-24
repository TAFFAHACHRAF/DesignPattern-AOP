package taffah.enset.td1.exercice1.cas1;

import java.util.ArrayList;
import java.util.List;

public class Group extends Figure{
    private List<Figure> figureGroup=new ArrayList<>();
    public void addFigure(Figure figure){
        this.figureGroup.add(figure);
    }
    public void removeFigure(Figure figure){
        this.figureGroup.remove(figure);
    }
    public Figure getFigure(int index){
        return this.figureGroup.get(index);
    }

    @Override
    public void display() {
        for (Figure figure : figureGroup){
            figure.display();
        }
    }
}
