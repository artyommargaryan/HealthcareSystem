package healthcareoperation;

import appointments.Appointment;
import doctor.Doctor;
import patient.Patient;

import java.util.List;

public interface HealthcareOperations {
    List<Patient> getPatients();
    List<Doctor> getDoctors();
    List<Appointment> viewPatientHistory(Patient patient);
    void addToDoctorSchedule(Doctor doctor, Appointment appointment);
    void addPatient(Patient patient);
    void addDoctor(Doctor doctor);

}
