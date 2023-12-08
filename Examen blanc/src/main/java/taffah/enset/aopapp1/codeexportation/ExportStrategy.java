package taffah.enset.aopapp1.codeexportation;

import taffah.enset.aopapp1.metier.entities.UMLClass;

public interface ExportStrategy {
    void export(UMLClass classDiagram, String filePath);
    }
