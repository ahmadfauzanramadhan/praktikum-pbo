package model;

public class Person {
    protected String id;
    protected String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Nama: " + name);
    }
}