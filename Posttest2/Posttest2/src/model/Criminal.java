package model;

public class Criminal {
    private String id;
    private String name;
    private String crimeType;
    private int age;

    public Criminal(String id, String name, int age, String crimeType) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.crimeType = crimeType;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCrimeType() { return crimeType; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setCrimeType(String crimeType) { this.crimeType = crimeType; }

    public void display() {
        System.out.println("ID: " + id + ", Nama: " + name + ", Umur: " + age + ", Jenis Kejahatan: " + crimeType);
    }
}