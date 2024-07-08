package taffah.enset.aopapp1.metier.entities;

public class UMLRelationship {

    private UMLElement source;
    private UMLElement destination;
    private RelationshipType type;
    private Cardinality[] cardinalities;

    public UMLRelationship(UMLElement source, UMLElement destination, RelationshipType type, Cardinality[] cardinalities) {
        this.source = source;
        this.destination = destination;
        this.type = type;
        this.cardinalities = cardinalities;
    }

    public UMLElement getSource() {
        return source;
    }

    public void setSource(UMLElement source) {
        this.source = source;
    }

    public UMLElement getDestination() {
        return destination;
    }

    public void setDestination(UMLElement destination) {
        this.destination = destination;
    }

    public RelationshipType getType() {
        return type;
    }

    public void setType(RelationshipType type) {
        this.type = type;
    }

    public Cardinality[] getCardinalities() {
        return cardinalities;
    }

    public void setCardinalities(Cardinality[] cardinalities) {
        this.cardinalities = cardinalities;
    }
}