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
        String jobPositionType = testJob.getPositionType().getValue();
        String jobCoreCompetency = testJob.getCoreCompetency().getValue();


        assertEquals("Product tester", jobName);
        assertTrue(testJob instanceof Job);

        assertEquals("ACME", employerName);
        assertTrue(testJob.getEmployer() instanceof Employer);

        assertEquals("Desert", jobLocation);
        assertTrue(testJob.getLocation() instanceof Location);

        assertEquals("Quality control", jobPositionType);
        assertTrue(testJob.getPositionType() instanceof PositionType);

        assertEquals("Persistence", jobCoreCompetency);
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);

    }

    @Test
    public void testJobsForEquality(){
        Job testJobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Job testJobB = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(testJobA.equals(testJobB));

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
         //System.out.println(testJob);

        //changed expected from: System.lineSeparator() to  "\n"
         assertEquals("\n", String.valueOf(testJob.toString().charAt(0)));


         //changed expected from: System.lineSeparator() to  "\n"
         assertEquals("\n", String.valueOf(testJob.toString().charAt(testJob.toString().length()-1)));
    }//"\n"

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String newLine = "\n";

        String expectedString = newLine +
                "ID:  " + testJob.getId() + newLine +
                "Name:  " + testJob.getName() + newLine +
                "Employer:  " + testJob.getEmployer() + newLine +
                "Location:  " + testJob.getLocation() + newLine +
                "Position Type:  " + testJob.getPositionType() + newLine +
                "Core Competency:  " + testJob.getCoreCompetency() + newLine;


        assertEquals(expectedString, testJob.toString());

    }
    //Follow the same TDD process for the third requirement, creating a test named testToStringHandlesEmptyField
    @Test

    public void testToStringHandlesEmptyField(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType(""), new CoreCompetency(""));
        String newLine = "\n";
        String expectedString = newLine +
                "ID:  " + testJob.getId() + newLine +
                "Name:  " + testJob.getName() + newLine +
                "Employer:  " + testJob.getEmployer().getValue() + newLine +
                "Location:  " + "Data not available" + newLine +
                "Position Type:  " + "Data not available" + newLine +
                "Core Competency:  " + "Data not available" + newLine;

        assertEquals(expectedString, testJob.toString());

    }



}
