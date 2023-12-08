package taffah.enset.aopapp1.codegenaration;

import taffah.enset.aopapp1.metier.entities.UMLClass;

interface CodeGenerationStrategy {
    String generateCode(UMLClass umlDiagram);
}