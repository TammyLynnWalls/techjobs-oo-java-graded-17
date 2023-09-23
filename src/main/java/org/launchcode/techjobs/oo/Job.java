package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
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
    public String toString(){
        String newLine = "\n";//System.lineSeparator();

        int jobId = this.getId();
        String jobIdString = (jobId == -1) ? "Data not available" : String.valueOf(jobId);

        String jobName = this.getName();
        String jobNameString = (jobName == null ) ? "Data not available" : String.valueOf(jobName);

        String jobEmployer = this.getEmployer().getValue();
        String jobEmployerString = (jobEmployer == null ) ? "Data not available" : String.valueOf(jobEmployer);

        String jobLocation = this.getLocation().getValue();
        String jobLocationString = (jobLocation == null ) ? "Data not available" : String.valueOf(jobLocation);

        String jobPositionType = this.getPositionType().getValue();
        String jobPositionTypeString = (jobPositionType == null ) ? "Data not available" : String.valueOf(jobPositionType);


        String jobCoreCompetency = this.getCoreCompetency().getValue();
        String jobCoreCompetencyString = (jobCoreCompetency == null ) ? "Data not available" : jobCoreCompetency.toString();

        String string = newLine +

                "ID:  " + jobIdString + newLine +
                "Name:  " + jobNameString + newLine +
                "Employer:  " + jobEmployerString + newLine +
                "Location:  " + jobLocationString + newLine +
                "Position Type:  " + jobPositionTypeString + newLine +
                "Core Competency:  " + jobCoreCompetencyString + newLine;

        return string;
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job job)) return false;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
