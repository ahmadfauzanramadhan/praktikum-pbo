package model;
import java.util.ArrayList;
import java.util.List;

public class OfficerRepository {
    private List<Officer> officers = new ArrayList<>();

    public void addOfficer(Officer officer) {
        officers.add(officer);
    }

    public List<Officer> getAllOfficers() {
        return officers;
    }

    public Officer findById(String id) {
        for (Officer o : officers) {
            if (o.getId().equals(id)) {
                return o;
            }
        }
        return null;
    }

    public void removeOfficer(String id) {
        officers.removeIf(o -> o.getId().equals(id));
    }
}
