package model;

public class Officer {
    private String id;
    private String name;
    private String rank;

    public Officer(String id, String name, String rank) {
        this.id = id;
        this.name = name;
        this.rank = rank;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getRank() { return rank; }

    public void setName(String name) { this.name = name; }
    public void setRank(String rank) { this.rank = rank; }

    public void display() {
        System.out.println("ID: " + id + ", Nama: " + name + ", Pangkat: " + rank);
    }
}
