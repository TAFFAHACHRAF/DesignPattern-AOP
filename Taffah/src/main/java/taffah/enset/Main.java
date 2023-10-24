package taffah.enset;

import taffah.enset.td1.exercice1.cas1.Cercle;
import taffah.enset.td1.exercice1.cas1.Group;
import taffah.enset.td1.exercice1.cas1.Rectangle;
import taffah.enset.td1.exercice1.cas2.Design;
import taffah.enset.td1.exercice1.cas2.Implementation1;
import taffah.enset.td1.exercice1.cas2.Implementation2;

public class Main {
    public static void main(String[] args) {
        Group group=new Group();
        group.addFigure(new Cercle());
        group.addFigure(new Rectangle());
        group.addFigure(new Cercle());
        group.addFigure(new Rectangle());
        group.display();

        Design design=new Implementation1();
        design.displayContent();
        design=new Implementation2();
        design.displayContent();
    }
}