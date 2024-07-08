package taffah.enset.aopapp1.codegenaration;

import taffah.enset.aopapp1.metier.entities.UMLClass;

public class JavaCodeGenerationSecondStrategy implements CodeGenerationStrategy{
    AncienneJavaCodeGenerationStrategy ancienneJavaCodeGenerationStrategy=new AncienneJavaCodeGenerationStrategy();
    @Override
    public String generateCode(UMLClass umlDiagram) {
        return ancienneJavaCodeGenerationStrategy.generateCode(umlDiagram);
    }
}
