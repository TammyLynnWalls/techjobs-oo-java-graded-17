package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId(){
        Job a = new Job();
        Job b = new Job();

        assertNotEquals(a,b);
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


        String jobName = testJob.getName();
        String employerName = testJob.getEmployer().getValue();
        String jobLocation = testJob.getLocation().getValue();
        String jobPostionType = testJob.getPositionType().getValue();
        String jobCoreCompetency = testJob.getCoreCompetency().getValue();


        assertEquals("Product tester", jobName);
        assertTrue(testJob instanceof Job);

        assertEquals("ACME", employerName);
        assertTrue(testJob.getEmployer() instanceof Employer);

        assertEquals("Desert", jobLocation);
        assertTrue(testJob.getLocation() instanceof Location);

        assertEquals("Quality control", jobPostionType);
        assertTrue(testJob.getPositionType() instanceof PositionType);

        assertEquals("Persistence", jobCoreCompetency);
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);

    }
}
