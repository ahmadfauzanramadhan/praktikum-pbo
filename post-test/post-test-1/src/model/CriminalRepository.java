package model;

import java.util.ArrayList;

public class CriminalRepository {
    private ArrayList<Criminal> criminals = new ArrayList<>();

    public void addCriminal(Criminal c) { criminals.add(c); }
    public ArrayList<Criminal> getAllCriminals() { return criminals; }
    public Criminal findById(String id) {
        for (Criminal c : criminals) {
            if (c.getId().equals(id)) return c;
        }
        return null;
    }
    public void removeCriminal(String id) {
        criminals.removeIf(c -> c.getId().equals(id));
    }
}