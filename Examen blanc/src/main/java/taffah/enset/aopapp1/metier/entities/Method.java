package taffah.enset.aopapp1.metier.entities;

import java.util.List;

public class Method implements UMLElement{

    private String name;
    private DataType returnType;
    private Visibility visibility;
    private boolean isStatic;
    private boolean isFinal;
    private boolean isAbstract;
    private List<Parameter> parameters;

    public Method(String name, DataType returnType, Visibility visibility, boolean isStatic, boolean isFinal, boolean isAbstract, List<Parameter> parameters) {
        this.name = name;
        this.returnType = returnType;
        this.visibility = visibility;
        this.isStatic = isStatic;
        this.isFinal = isFinal;
        this.isAbstract = isAbstract;
        this.parameters = parameters;
    }

    @Override
    public String getName() {
        return name;
    }
}
