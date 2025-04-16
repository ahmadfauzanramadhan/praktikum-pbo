package model;

public class Officer extends Person {
    private String rank;

    public Officer(String id, String name, String rank) {
        super(id, name);
        this.rank = rank;
    }

    public String getRank() { return rank; }
    public void setRank(String rank) { this.rank = rank; }

    @Override
    public void display() {
        super.display();
        System.out.println("Pangkat: " + rank);
    }
}
