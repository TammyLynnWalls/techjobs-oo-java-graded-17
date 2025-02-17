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

        String jobIdString = (this.getId() == -1) ? "Data not available" : String.valueOf(this.getId());

        String jobNameString = (Objects.equals(this.getName(), "")) ? "Data not available" : this.getName();

        String jobEmployerString = (Objects.equals(this.getEmployer().getValue(), "")) ? "Data not available" : this.getEmployer().getValue();

        String jobLocationString = (Objects.equals(this.getLocation().getValue(), "")) ? "Data not available" : this.getLocation().getValue();

        String jobPositionTypeString = (Objects.equals(this.getPositionType().getValue(), "")) ? "Data not available" : this.getPositionType().getValue();

        String jobCoreCompetencyString = (Objects.equals(this.getCoreCompetency().getValue(), "")) ? "Data not available" : this.getCoreCompetency().getValue();

//        String string;
//
//        if(Objects.equals(jobNameString, "Data not available") && Objects.equals(jobEmployerString, "Data not available") && Objects.equals(jobLocationString, "Data not available") && Objects.equals(jobPositionTypeString, "Data not available") && Objects.equals(jobCoreCompetencyString, "Data not available")){
//            string = "OOPS! This job does not seem to exist.";
//        }

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
