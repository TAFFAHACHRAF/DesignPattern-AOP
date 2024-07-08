package taffah.enset.aopapp1.metier.entities;

public class UMLEnumElement implements UMLElement {

    private String name;

    public UMLEnumElement(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
