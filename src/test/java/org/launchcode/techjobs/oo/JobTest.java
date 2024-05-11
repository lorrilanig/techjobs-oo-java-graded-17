package org.launchcode.techjobs.oo;

import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    //Test the empty constructor
    @Test
    public void testSettingJobId(){
    Job test_job1 = new Job();
    Job test_job2 = new Job();
    assertNotEquals(test_job1.getId(), test_job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
       Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
         assertEquals(test_job.getName(), "Product tester");
         assertEquals(test_job.getEmployer().toString(), "ACME");
         assertEquals(test_job.getLocation().toString(), "Desert");
         assertEquals(test_job.getPositionType().toString(), "Quality control");
         assertEquals(test_job.getCoreCompetency().toString(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse( test_job1.getId() == test_job2.getId());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(test_job.getName(), "Product tester");
        String firstChar = String.valueOf(test_job.toString().charAt(0));
        String lastChar = String.valueOf(test_job.toString().charAt(test_job.toString().length()-1));
        assertEquals(firstChar, lineSeparator());
        assertEquals(lastChar, lineSeparator());
    }

    //TODO test string has correct labels and data in appropriate place
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String name = test_job.getName();
        assertEquals("Name: " + name, "Name: " + name);
    }

    //TODO test to see if string handles empty field
    @Test
    public void testToStringHandlesEmptyField() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobString = test_job.toString();
        assertEquals(jobString, test_job.toString());
    }
}

