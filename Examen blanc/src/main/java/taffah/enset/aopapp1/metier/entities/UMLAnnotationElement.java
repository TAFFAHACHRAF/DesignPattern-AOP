package taffah.enset.aopapp1.metier.entities;

public class UMLAnnotationElement implements UMLElement {

    private String name;

    public UMLAnnotationElement(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}