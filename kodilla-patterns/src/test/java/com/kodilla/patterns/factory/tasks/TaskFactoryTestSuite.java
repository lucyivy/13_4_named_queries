package com.kodilla.patterns.factory.tasks;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @After
    public void separateTests(){
        System.out.println();
    }

    @Test
    public void shoppingTaskTest(){
        //given
        TaskFactory factory = new TaskFactory();
        //when
        Task shoppingTask = factory.executeTask(TaskFactory.SHOPPING);
        shoppingTask.executeTask();
        //then
        Assert.assertEquals("Buy bread", shoppingTask.getTaskName());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }
    @Test
    public void paintingTaskTest(){
        //given
        TaskFactory factory = new TaskFactory();
        //when
        Task paintingTask = factory.executeTask(TaskFactory.PAINTING);
        paintingTask.executeTask();
        //then
        Assert.assertEquals("Painting hallway", paintingTask.getTaskName());
        Assert.assertTrue(paintingTask.isTaskExecuted());

    }
    @Test
    public void drivingTaskTest(){
        //given
        TaskFactory factory = new TaskFactory();
        //when
        Task drivingTask = factory.executeTask(TaskFactory.DRIVING);
        drivingTask.executeTask();
        //then
        Assert.assertEquals("Airport lift", drivingTask.getTaskName());
        Assert.assertTrue(drivingTask.isTaskExecuted());

    }
}
