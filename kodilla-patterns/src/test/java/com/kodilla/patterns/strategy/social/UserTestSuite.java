package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserTestSuite {
    private static int testCounter = 0;

    @Before
    public void separateTests(){
        testCounter ++;
        System.out.println("\nTest no. " + testCounter);
    }

    @Test
    public void testDefaultSharingStrategies() {
        // given
        User ninaSmith = new Millenials("Nina Smith");
        User amberKelly = new YGeneration("Amber Kelly");
        User laraMower = new ZGeneration("Lara Mower");

        // when
        String ninaSmithShares = ninaSmith.sharePost();
        System.out.println("Nina should prefer: " + ninaSmithShares);

        String amberKellyShares = amberKelly.sharePost();
        System.out.println("Amber should prefer: " + amberKellyShares);

        String laraMowerShares = laraMower.sharePost();
        System.out.println("Lara should prefer: " + laraMowerShares);

        //then
        Assert.assertEquals("Facebook", ninaSmithShares);
        Assert.assertEquals("Twitter", amberKellyShares);
        Assert.assertEquals("Snapchat", laraMowerShares);

    }

    @Test
    public void testIndividualSharingStrategy() {
        // given
        User laraMower = new ZGeneration("Lara Mower");

        // when
        String laraMowerShares = laraMower.sharePost();
        System.out.println("Lara should prefer: " + laraMowerShares);
        laraMower.setSocialPublisher(new TwitterPublisher());
        String laraMowerActuallyShares = laraMower.sharePost();
        System.out.println("However, Lara actually prefers: " + laraMowerActuallyShares);

        // then
        Assert.assertEquals("Twitter", laraMowerActuallyShares);
    }
}