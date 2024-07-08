package taffah.enset.aopapp1.codeexportation;

import taffah.enset.aopapp1.metier.entities.UMLClass;

public class XMLExportStrategy implements ExportStrategy {
    @Override
    public void export(UMLClass classDiagram, String filePath) {
        System.out.println("Exported to XML file: " + filePath);
    }
}
