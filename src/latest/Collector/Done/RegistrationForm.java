package latest.Collector.Done;

import java.util.List;

public class RegistrationForm {
    int id;
    List<Candidate> candidates;

    public RegistrationForm(int id, List<Candidate> candidates) {
        this.id = id;
        this.candidates = candidates;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Candidate> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<Candidate> candidates) {
        this.candidates = candidates;
    }

    @Override
    public String toString() {
        return "Done.RegistrationForm{" +
                "id=" + id +
                ", candidates=" + candidates +
                '}';
    }
}
