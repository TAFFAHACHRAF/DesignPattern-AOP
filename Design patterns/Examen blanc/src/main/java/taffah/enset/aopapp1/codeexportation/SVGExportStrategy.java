package taffah.enset.aopapp1.codeexportation;

import taffah.enset.aopapp1.metier.entities.UMLClass;

public class SVGExportStrategy implements ExportStrategy {
    @Override
    public void export(UMLClass classDiagram, String filePath) {
        System.out.println("Exported to SVG file: " + filePath);
    }
}