package ucu.edu.ua.com;

import java.util.Random;
import org.reflections.Reflections;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class CharacterFactory {
    private static final Random RANDOM = new Random();

    public Characterr createCharacter() {
        Reflections reflections = new Reflections("ucu.edu.ua.com");
        return instantiateClass(getRandomConcreteClass(reflections));
    }

    private Class<? extends Characterr> getRandomConcreteClass(Reflections reflections) {
        Set<Class<? extends Characterr>> allSubTypes = reflections.getSubTypesOf(Characterr.class);
        
        if (allSubTypes.isEmpty()) {
            throw new RuntimeException("No subclasses of Characterr found");
        }

        // Filter to get only concrete classes (classes that have no subclasses)
        List<Class<? extends Characterr>> concreteClasses = new ArrayList<>();
        for (Class<? extends Characterr> clazz : allSubTypes) {
            @SuppressWarnings("unchecked")
            Set<Class<? extends Characterr>> subTypesOfCurrent = (Set<Class<? extends Characterr>>) (Set<?>) reflections.getSubTypesOf((Class<?>) clazz);
            if (subTypesOfCurrent.isEmpty()) {
                concreteClasses.add(clazz);
            }
        }

        if (concreteClasses.isEmpty()) {
            throw new RuntimeException("No concrete subclasses found (all classes have further subclasses)");
        }

        // Select random concrete class
        return concreteClasses.get(RANDOM.nextInt(concreteClasses.size()));
    }

    private Characterr instantiateClass(Class<? extends Characterr> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException("Failed to create character instance: " + clazz.getSimpleName(), e);
        }
    }
}