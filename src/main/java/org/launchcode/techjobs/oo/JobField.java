package org.launchcode.techjobs.oo;

public abstract class JobField {
    int id;
    static int nextId = 1;
    String value;

//    public JobField() {
//        id = nextId;
//        nextId++;
//    }

    public JobField(String value) {
        id = nextId;
        nextId++;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public abstract String toString();

    public abstract boolean equals(Object o);

    public abstract int hashCode();
}
