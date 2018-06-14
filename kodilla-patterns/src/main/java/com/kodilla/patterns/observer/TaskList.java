package com.kodilla.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class TaskList implements Observable {
    private final String user;
    private final String name;
    private final List<Observer> observers;
    private final List<String> tasks;


    public TaskList(String name, String user) {
        this.tasks = new ArrayList<>();
        this.observers = new ArrayList<>();
        this.name = name;
        this.user = user;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }

    public String getUser() {
        return user;
    }

}
