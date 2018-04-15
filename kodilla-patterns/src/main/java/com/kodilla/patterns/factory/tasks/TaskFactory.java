package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task executeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Buy bread", "Bread", 2);
            case PAINTING:
                return new PaintingTask("Painting hallway", "Baby blue", "Hallway's walls");
            case DRIVING:
                return new DrivingTask("Airport lift", "Airport", "Toyota");
            default:
                return null;
        }
    }
}
