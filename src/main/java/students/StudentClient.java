package students;

import java.rmi.RemoteException;
import java.util.Scanner;

import javax.xml.rpc.ServiceException;

import service.*;


public class StudentClient {
	
	public static void main(String[] args) throws ServiceException, RemoteException {
		GustaveTutorService service = new GustaveTutorServiceServiceLocator().getGustaveTutorService();
		
		Scanner scanner = new Scanner(System.in);
        while (true) {
            String name = scanner.nextLine();
            System.out.println("Name: " + name);
            service.setStudent(name);
            AppointmentsAvailable[] appointments_available = service.searchAvailabilityForSpecificSubject("Math");
    		System.out.println("Number of teachers: " + appointments_available.length);
    		for (AppointmentsAvailable app_per_teacher : appointments_available) {
    			String res = "Teacher: " + app_per_teacher.getTeacher();
    			for (String app: app_per_teacher.getAppointments()) {
    				res += "\n\t"+app;
    			}
    			System.out.println(res);
    		}
            
        }

		
		
		
		
	}

}
