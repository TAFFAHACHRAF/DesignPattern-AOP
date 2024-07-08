package taffah.enset.aopapp1.metier.entities;

import java.util.List;

// Classe représentant un Record UML
public class UMLRecord implements UMLElement {
    // Liste des paramètres du constructeur du Record
    private List<UMLElement> constructorParameters;

    // Constructeur avec paramètres
    public UMLRecord(String name, List<UMLElement> constructorParameters) {
        this.constructorParameters = constructorParameters;
    }

    // Getter pour la liste des paramètres du constructeur
    public List<UMLElement> getConstructorParameters() {
        return constructorParameters;
    }

    // Méthode pour ajouter un paramètre au constructeur
    public void addConstructorParameter(UMLElement parameter) {
        constructorParameters.add(parameter);
    }

    @Override
    public String getName() {
        return null;
    }
}

