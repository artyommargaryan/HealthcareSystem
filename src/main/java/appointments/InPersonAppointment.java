package appointments;

import doctor.Doctor;
import patient.Patient;

public class InPersonAppointment extends Appointment{
    public InPersonAppointment(Patient patient, Doctor doctor, String time) {
        super(patient, doctor, time, "In-Person");
    }
}
