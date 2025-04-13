package model;
import java.util.ArrayList;
import java.util.List;

public class CriminalRepository {
    private List<Criminal> criminals = new ArrayList<>();

    public void addCriminal(Criminal criminal) {
        criminals.add(criminal);
    }

    public List<Criminal> getAllCriminals() {
        return criminals;
    }

    public Criminal findById(String id) {
        for (Criminal c : criminals) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    public void removeCriminal(String id) {
        criminals.removeIf(c -> c.getId().equals(id));
    }
}
