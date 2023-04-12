package doctor;

import appointments.Appointment;

import java.util.LinkedList;
import java.util.List;

public class Doctor {
    private final String name;
    private String contactInformation;
    private final String speciality;

    private final List<Appointment> scheduled = new LinkedList<>();

    public Doctor(String name, String contactInformation, String speciality) {
        this.name = name;
        this.contactInformation = contactInformation;
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public List<Appointment> getScheduled() {
        return scheduled;
    }

    public void addToSchedule(Appointment appointment) {
        scheduled.add(appointment);
        appointment.getPatient().addToHistory(appointment);
    }


}
