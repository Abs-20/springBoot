package com.example.demo.json;

public class Assignment {

    private String name;
    private String craft;

    public String getName() {
        return name;
    }

    public String getCraft() {
        return craft;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCraft(String craft) {
        this.craft = craft;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "name='" + name + '\'' +
                ", craft='" + craft + '\'' +
                '}';
    }
}
