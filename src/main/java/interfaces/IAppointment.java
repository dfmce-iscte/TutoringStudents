package interfaces;

import java.rmi.RemoteException;

public interface IAppointment {

	public void book_appointment(IStudent student) throws RemoteException;
	
	// ver melhor esta função
	public void cancel_appointment() throws RemoteException;
}
