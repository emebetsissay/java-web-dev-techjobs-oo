package org.launchcode.techjobs_oo;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class JobTest {
    public Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    public Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));



    @org.junit.jupiter.api.Test
    void testEquals() {
    }

    @org.junit.jupiter.api.Test
    void testSettingJobId() {

        int result1 = 9;
        int result2 = 10;

        assertEquals(result1, job1.getId());
        assertEquals(result2, job2.getId());

    }

    @org.junit.jupiter.api.Test
    void testSettingEmployer() {
        Employer emp = new Employer("ACME");


        assertEquals(emp.getValue(), job1.getEmployer().getValue());

    }
    @org.junit.jupiter.api.Test
    void testSettingLocation(){
        Location name = new Location("Desert");

        assertEquals(name.getValue(), job1.getLocation().getValue());
    }

    @org.junit.jupiter.api.Test
    void testSettingPostion(){
        PositionType name = new PositionType("Quality control");

        assertEquals(name.getValue(), job1.getPositionType().getValue());
    }

    @org.junit.jupiter.api.Test
    void testSettingCoreCompetency(){
        CoreCompetency name = new CoreCompetency("Persistence");

        assertEquals(name.getValue(), job1.getCoreCompetency().getValue());
    }

    @org.junit.jupiter.api.Test
    void testJobsForEqualityEmployer(){
        Employer emp = new Employer("ACME");

        assertEquals(emp.getValue(), job1.getEmployer().getValue());


    }

    @org.junit.jupiter.api.Test
    void testJobsForEqualityLocation(){
        Location name = new Location("Desert");

        assertEquals(name.getValue(), job1.getLocation().getValue());
    }


    @org.junit.jupiter.api.Test
    void testJobsForEqualityPostion(){
        PositionType name = new PositionType("Quality control");

        assertEquals(name.getValue(), job1.getPositionType().getValue());
    }

    @org.junit.jupiter.api.Test
    void testJobsForEqualityCoreCompetency(){
        CoreCompetency name = new CoreCompetency("Persistence");

        assertEquals(name.getValue(), job1.getCoreCompetency().getValue());
    }

    @org.junit.jupiter.api.Test
    void testJobsForEquality(){

        assertFalse(job1.equals(job2));

    }

    @org.junit.jupiter.api.Test
    void testJobsFortoString(){
        String result = " id:2\n" +
                " name: Web Developer\n" +
                " employer: LaunchCode\n" +
                " location: St. Louis\n" +
                " positionType: Front-end developer\n" +
                " coreCompetency: JavaScript";
        assertEquals(result, job2.toString());


    }
}




