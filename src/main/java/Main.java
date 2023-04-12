import appointments.Appointment;
import appointments.InPersonAppointment;
import appointments.VirtualAppointment;
import doctor.Doctor;
import healthcareoperation.Hospital;
import patient.Patient;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient("name1", "cInf1");
        Patient patient2 = new Patient("name2", "cInf2");
        Doctor doctor1 = new Doctor("Dname1", "dcInf1", "spec1");
        Doctor doctor2 = new Doctor("Dname2", "dcInf2", "spec2");
        Hospital hospital = new Hospital();
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        Appointment appointment1 = createInPersonAppointment(patient1, doctor1);
        Appointment appointment2 = createVirtualAppointment(patient1, doctor1);

        hospital.addToDoctorSchedule(doctor1, appointment1);
        hospital.addToDoctorSchedule(doctor2, appointment2);
    }

    private static VirtualAppointment createVirtualAppointment(Patient patient1, Doctor doctor1) {
        return new VirtualAppointment(patient1, doctor1, "some Time");
    }

    private static InPersonAppointment createInPersonAppointment(Patient patient1, Doctor doctor1) {
        return new InPersonAppointment(patient1, doctor1, "some Time");
    }
}
