package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job(){
        id = nextId;
        nextId= nextId + 1;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }

    @Override
    public String toString() {
        String nameStr= "Data not available";
        String employerStr = "Data not available";
        String locationStr= "Data not available";
        String positionTypeStr= "Data not available";
        String coreCompetencyStr= "Data not available";
        if(name == null){
            nameStr ="Data not available";
        } else {
            nameStr = name;
        }
        if(employer.getValue() == null){
            employerStr ="Data not available";
        } else {
            employerStr = employer.getValue();
        }
        if(location.getValue() == null){
            locationStr ="Data not available";
        } else {
            locationStr = location.getValue();
        }
        if(positionType.getValue() == null){
            positionTypeStr ="Data not available";
        } else {
            positionTypeStr = positionType.getValue();
        }
        if(coreCompetency.getValue() == null){
            coreCompetencyStr ="Data not available";
        } else {
            coreCompetencyStr = coreCompetency.getValue();
        }





        return "ID:" + id +
                "\nName: " + nameStr +
                "\nEmployer: " + employerStr +
                "\nLocation: " + locationStr +
                "\nPositionType: " + positionTypeStr +
                "\nCoreCompetency: " + coreCompetencyStr ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public static void main(String[] args) {
        Job job1 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        System.out.println(job1.toString());
    }
}
