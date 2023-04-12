package appointments;

import doctor.Doctor;
import patient.Patient;

public abstract class Appointment {
    private final Patient patient;
    private final Doctor doctor;
    private final String time;

    private final String appointmentType;

    public Appointment(Patient patient, Doctor doctor, String time, String appointmentType) {
        this.patient = patient;
        this.doctor = doctor;
        this.time = time;
        this.appointmentType = appointmentType;
    }

    public String getAppointmentType() {
        return appointmentType;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getTime() {
        return time;
    }
}
