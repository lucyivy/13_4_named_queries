package com.kodilla.patterns.observer;

import org.junit.Assert;
import org.junit.Test;

public class MentorTestSuite {

    @Test
    public void testMentorUpdate() {
        //Given
        TaskList johnTaskList = new TaskList("John's task list", "Johny Bravo");
        TaskList laraTaskList = new TaskList("Lara's task list", "Lara Hobbes");
        TaskList richardTaskList = new TaskList("Richard's task list", "Richard Swak");

        Mentor rambo = new Mentor("Rambo Pine");
        Mentor gary = new Mentor("Gary Oak");


        johnTaskList.registerObserver(gary);
        laraTaskList.registerObserver(rambo);
        richardTaskList.registerObserver(gary);


        //When
        johnTaskList.addTask("John's task one");
        laraTaskList.addTask("Lara's first task");
        laraTaskList.addTask("Lara's second task");
        richardTaskList.addTask("Richard's first task");
        richardTaskList.addTask("Richard's second task");
        richardTaskList.addTask("Richard's third task");

        //Then
        Assert.assertEquals(4,  gary.getCount());
        Assert.assertEquals(2,  rambo.getCount());
    }
}
