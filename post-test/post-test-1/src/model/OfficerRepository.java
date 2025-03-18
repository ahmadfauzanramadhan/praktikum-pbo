package model;

import java.util.ArrayList;

public class OfficerRepository {
    private ArrayList<Officer> officers = new ArrayList<>();

    public void addOfficer(Officer o) { officers.add(o); }
    public ArrayList<Officer> getAllOfficers() { return officers; }
    public Officer findById(String id) {
        for (Officer o : officers) {
            if (o.getId().equals(id)) return o;
        }
        return null;
    }
    public void removeOfficer(String id) {
        officers.removeIf(o -> o.getId().equals(id));
    }
}