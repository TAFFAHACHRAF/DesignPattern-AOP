package taffah.enset.aopapp1.metier.entities;

import taffah.enset.aopapp1.aspects.Log;

import java.util.ArrayList;
import java.util.List;

public class UMLClassGroup extends UMLClass implements Observer {
    private String groupName;
    private List<UMLClass> classesInGroup = new ArrayList<>();

    @Log
    public void addClassToGroup(UMLClass umlClass) {
        classesInGroup.add(umlClass);
    }

    @Log
    public void removeClassFromGroup(UMLClass umlClass) {
        classesInGroup.remove(umlClass);
        notifyObservers("classesInGroup", classesInGroup);
    }


    @Override
    public void update(Object value) {

    }
}
