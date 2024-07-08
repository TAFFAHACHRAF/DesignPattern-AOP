package taffah.enset.aopapp1.metier.entities;

public class UMLInterfaceElement implements UMLElement {

    private String name;

    public UMLInterfaceElement(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}