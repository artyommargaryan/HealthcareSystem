package appointments;

import doctor.Doctor;
import patient.Patient;

public class VirtualAppointment extends Appointment{
    public VirtualAppointment(Patient patient, Doctor doctor, String time) {
        super(patient, doctor, time, "Virtual");
    }
}
