package students;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Set;
import java.util.TreeSet;

import interfaces.IAppointment;
import interfaces.IStudent;
import interfaces.AppointmentComparator;

public class Student extends UnicastRemoteObject implements IStudent {
	
	private Set<IAppointment> student_appointments;

	protected Student() throws RemoteException {
		super();
		this.student_appointments = new TreeSet<IAppointment>(new AppointmentComparator());
	}

	@Override
	public void appointment_available(Set<IAppointment> appointments) throws RemoteException {
		System.out.println();
	}

	@Override
	public String to_string() throws RemoteException {
		return "Student [student_appointments=" + student_appointments + "]";
	}

}
