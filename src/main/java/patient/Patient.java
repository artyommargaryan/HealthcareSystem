package patient;

import appointments.Appointment;

import java.util.LinkedList;
import java.util.List;

public class Patient {
    private final String name;
    private String contactInformation;

    private final List<Appointment> history = new LinkedList<>();

    public Patient(String name, String contactInformation) {
        this.name = name;
        this.contactInformation = contactInformation;
    }

    public String getName() {
        return name;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public List<Appointment> getHistory() {
        return history;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public void addToHistory(Appointment appointment) {
        history.add(appointment);
    }
}
