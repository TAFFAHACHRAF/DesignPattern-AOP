package taffah.enset.aopapp1.test;

import taffah.enset.aopapp1.codeexportation.*;
import taffah.enset.aopapp1.metier.entities.UMLClass;

public class TestExportation {
    public static void main(String[] args) {
        // Sample usage

        // Create a UMLClassDiagram instance
        UMLClass classDiagram = new UMLClass();
        // Populate the class diagram with classes, interfaces, etc.

        // Create a DiagramExporter instance
        DiagramExporter diagramExporter = new DiagramExporter();

        // Set the export strategy to Binary
        diagramExporter.setExportStrategy(new BinaryExportStrategy());
        // Export the diagram to binary
        diagramExporter.exportDiagram(classDiagram, "output.bin");

        // Set the export strategy to XML
        diagramExporter.setExportStrategy(new XMLExportStrategy());
        // Export the diagram to XML
        diagramExporter.exportDiagram(classDiagram, "output.xml");

        // Set the export strategy to JSON
        diagramExporter.setExportStrategy(new JSONExportStrategy());
        // Export the diagram to JSON
        diagramExporter.exportDiagram(classDiagram, "output.json");

        // Set the export strategy to SVG
        diagramExporter.setExportStrategy(new SVGExportStrategy());
        // Export the diagram to SVG
        diagramExporter.exportDiagram(classDiagram, "output.svg");
    }
}
