package students;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import interfaces.IAppointment;
import interfaces.IStudent;
import interfaces.AppointmentComparator;

public class Student extends UnicastRemoteObject implements IStudent {
	
	private Set<IAppointment> student_appointments;
	private String name;

	protected Student(String name) throws RemoteException {
		super();
		// this.student_appointments = new TreeSet<IAppointment>(new AppointmentComparator());
		this.student_appointments = new HashSet<IAppointment>();
		this.name = name;
	}

	public Set<IAppointment> get_student_appointments() {
		return student_appointments;
	}

	@Override
	public void appointment_available(IAppointment appointments) throws RemoteException {
		
		System.out.println();
	}

	@Override
	public void add_appointment(IAppointment appointment) throws RemoteException {
		student_appointments.add(appointment);
	}

	@Override
	public String to_string() throws RemoteException {
		return "Student [number of student_appointments=" + student_appointments.size() + "]" + " name: " + name;
	}

}
