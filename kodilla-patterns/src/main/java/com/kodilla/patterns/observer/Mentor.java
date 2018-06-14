package com.kodilla.patterns.observer;

public class Mentor implements Observer {

    private final String name;
    private int count;

    public Mentor(String name) {
        this.name = name;
        count = 0;
    }

    @Override
    public void update(TaskList taskList) {

        System.out.println(name + ": new task: \"" + taskList.getTasks().get(taskList.getTasks().size()-1) + "\" added to Task List of user: " + taskList.getUser() + ";\n"
                + "Total numer of tasks for this student: " + taskList.getTasks().size());
        count++;
    }

    public int getCount() {
        return count;
    }

}