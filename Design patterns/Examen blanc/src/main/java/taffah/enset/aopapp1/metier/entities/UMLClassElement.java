package taffah.enset.aopapp1.metier.entities;

public class UMLClassElement implements UMLElement {

    private String name;

    public UMLClassElement(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}