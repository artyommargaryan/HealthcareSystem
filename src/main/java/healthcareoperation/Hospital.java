package healthcareoperation;

import appointments.Appointment;
import doctor.Doctor;
import patient.Patient;

import java.util.ArrayList;
import java.util.List;

public class Hospital implements HealthcareOperations{
    private List<Patient> patients = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();

    @Override
    public List<Patient> getPatients() {
        return patients;
    }

    @Override
    public List<Doctor> getDoctors() {
        return doctors;
    }

    @Override
    public List<Appointment> viewPatientHistory(Patient patient) {
        validatePatient(patient);
        return patient.getHistory();
    }

    @Override
    public void addToDoctorSchedule(Doctor doctor, Appointment appointment) {
        validateDoctor(doctor);
    }

    private void validateDoctor(Doctor doctor) {
        if (!isValidDoctor(doctor)){
            throw new IllegalArgumentException("No such doctor");
        }
    }

    private boolean isValidDoctor(Doctor doctor) {
        return doctors.contains(doctor);
    }

    private void validatePatient(Patient patient) {
        if(!isValidPatient(patient)) {
            throw new IllegalArgumentException("No such  patient");
        }
    }

    private boolean isValidPatient(Patient patient) {
        return patients.contains(patient);
    }

    @Override
    public void addPatient(Patient patient) {
        if (!isValidPatient(patient)) {
            patients.add(patient);
        }
    }

    @Override
    public void addDoctor(Doctor doctor) {
        if (!isValidDoctor(doctor)) {
            doctors.add(doctor);
        }
    }
}
