package org.launchcode.techjobs.oo;

import org.junit.Test;

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


}

