package students;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Set;
import java.util.TreeSet;

import interfaces.IAppointment;
import interfaces.IStudent;

public class Student extends UnicastRemoteObject implements IStudent {
	
	private Set<IAppointment> student_appointments;

	protected Student() throws RemoteException {
		super();
		this.student_appointments = new TreeSet<IAppointment>();
		// pensar como passar a class do comparator
	}

	@Override
	public void appointment_available(Set<IAppointment> appointments) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
