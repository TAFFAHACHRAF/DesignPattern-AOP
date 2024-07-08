package taffah.enset.aopapp1.codeexportation;

import taffah.enset.aopapp1.metier.entities.UMLClass;

public class DiagramExporter {
    private ExportStrategy exportStrategy;

    // Setter pour la stratégie d'exportation
    public void setExportStrategy(ExportStrategy exportStrategy) {
        this.exportStrategy = exportStrategy;
    }

    // Méthode pour exporter le diagramme de classes en utilisant la stratégie
    public void exportDiagram(UMLClass classDiagram, String filePath) {
        if (exportStrategy != null) {
            exportStrategy.export(classDiagram, filePath);
        } else {
            throw new IllegalStateException("Stratégie d'exportation non définie.");
        }
    }
}