package taffah.enset.aopapp1.codegenaration;

import taffah.enset.aopapp1.metier.entities.*;



public class JavaCodeGenerationStrategy implements CodeGenerationStrategy {
    public JavaCodeGenerationStrategy(){}
    @Override
    public String generateCode(UMLClass umlDiagram) {
        StringBuilder code = new StringBuilder();

        // Générer le code pour chaque élément du diagramme de classes
        for (Attribute attribute : umlDiagram.getAttributes()) {
            code.append(generateCodeForElement(attribute));
        }

        // Générer le code pour chaque relation du diagramme de classes
        for (Method method : umlDiagram.getMethods()) {
            code.append(generateCodeForElement(method));
        }

        return code.toString();
    }

    // Méthode pour générer le code pour un élément (classe, interface, énumérateur, annotation, etc.)
    private String generateCodeForElement(UMLElement element) {
        return "Generated code for " + element.getName() + "\n";
    }

    // Méthode pour générer le code pour une relation entre entités
    private String generateCodeForRelationship(UMLRelationship relationship) {

        return "Generated code for relationship between " +
                relationship.getSource().getName() + " and " +
                relationship.getDestination().getName() + "\n";
    }
}