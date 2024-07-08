package taffah.enset.aopapp1.test;

import taffah.enset.aopapp1.codegenaration.JavaCodeGenerationStrategy;
import taffah.enset.aopapp1.metier.entities.Visibility;
import taffah.enset.aopapp1.metier.entities.UMLClass;

public class TestCodeGeneration {

    public static void main(String[] args) {

        // Create a sample UML class
        UMLClass umlClass = new UMLClass("SampleClass",Visibility.PUBLIC,false,false,false);


        // Create a sample relationship between two entities
        UMLClass sourceClass = new UMLClass("SourceClass",Visibility.PUBLIC,false,false,false);
        UMLClass destinationClass = new UMLClass("DestinationClass",Visibility.PUBLIC,false,false,false);
        //UMLRelationship relationship = new UMLRelationship(sourceClass, destinationClass,Cardinality.ONE_OR_MANY,null);

        // Set up the code generation strategy
        JavaCodeGenerationStrategy codeGenerationStrategy = new JavaCodeGenerationStrategy();

        // Generate code for the UML class using the Java code generation strategy
        String generatedCode = codeGenerationStrategy.generateCode(umlClass);

        // Output the generated code
        System.out.println("Generated Code:\n" + generatedCode);
    }
}
