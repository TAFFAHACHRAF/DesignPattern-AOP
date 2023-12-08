package taffah.enset.aopapp1.metier.entities;

import taffah.enset.aopapp1.aspects.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class UMLClass {

    private String name;
    private Visibility visibility;
    private boolean isStatic;
    private boolean isFinal;
    private boolean isAbstract;

    private List<Attribute> attributes = new ArrayList<>();
    private List<Method> methods = new ArrayList<>();
    private List<Constructeur> constructeurs=new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    // Constructeur
    public UMLClass(String name, Visibility visibility, boolean isStatic, boolean isFinal, boolean isAbstract) {
        this.name = name;
        this.visibility = visibility;
        this.isStatic = isStatic;
        this.isFinal = isFinal;
        this.isAbstract = isAbstract;
    }
    public UMLClass() {

    }

    // un observateur pour les changements d'attributs
    @Log
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Une Méthode pour changer la valeur d'un attribut
    @Log
    public void setAttribute(String attributeName, Object value) {
        for (Attribute attribute : attributes) {
            if (attribute.getName().equals(attributeName)) {
                attribute.setValue(value);
                notifyObservers(attributeName, value);
                break;
            }
        }
    }

    // Un attribut à la classe
    @Log
    public void addAttribute(String name, DataType type, Visibility visibility, boolean isStatic, boolean isFinal) {
        Attribute attribute = new Attribute(name, type, visibility, isStatic, isAbstract, isFinal,"");
        attributes.add(attribute);
    }

    // Une méthode à la classe
    @Log
    public void addMethod(String name, DataType returnType, Visibility visibility, boolean isStatic, boolean isFinal, boolean isAbstract, List<Parameter> parameters) {
        Method method = new Method(name, returnType, visibility, isStatic, isFinal, isAbstract, parameters);
        methods.add(method);
    }

    // Les observateurs du changement d'état d'un attribut
    @Log
    void notifyObservers(String attributeName, Object newValue) {
        /*for (Attribute observer : observers) {
            observer.(newValue);
        }*/
    }
    @Log
    public String getName() {
        return name;
    }
    @Log
    public void setName(String name) {
        this.name = name;
    }
    @Log
    public Visibility getVisibility() {
        return visibility;
    }
    @Log
    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }
    @Log
    public boolean isStatic() {
        return isStatic;
    }
    @Log
    public void setStatic(boolean aStatic) {
        isStatic = aStatic;
    }
    @Log
    public boolean isFinal() {
        return isFinal;
    }
    @Log
    public void setFinal(boolean aFinal) {
        isFinal = aFinal;
    }
    @Log
    public boolean isAbstract() {
        return isAbstract;
    }
    @Log
    public void setAbstract(boolean anAbstract) {
        isAbstract = anAbstract;
    }
    @Log
    public List<Attribute> getAttributes() {
        return attributes;
    }
    @Log
    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }
    @Log
    public List<Method> getMethods() {
        return methods;
    }
    @Log
    public void setMethods(List<Method> methods) {
        this.methods = methods;
    }
    @Log
    public List<Observer> getObservers() {
        return observers;
    }
    @Log
    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }
}
