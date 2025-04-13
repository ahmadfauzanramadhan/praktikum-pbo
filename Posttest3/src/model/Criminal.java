package model;

public class Criminal extends Person {
    private int age;
    private String crimeType;

    public Criminal(String id, String name, int age, String crimeType) {
        super(id, name);
        this.age = age;
        this.crimeType = crimeType;
    }

    public int getAge() { return age; }
    public String getCrimeType() { return crimeType; }
    public void setAge(int age) { this.age = age; }
    public void setCrimeType(String crimeType) { this.crimeType = crimeType; }

    @Override
    public void display() {
        super.display();
        System.out.println("Umur: " + age);
        System.out.println("Jenis Kejahatan: " + crimeType);
    }
}
