package students;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import interfaces.ITutoringServer;
import interfaces.IAppointment;
import interfaces.IStudent;
import interfaces.ITeacher;

public class StudentMain {
    public static void main(String[] args) {

        try {
            ITutoringServer server = (ITutoringServer) Naming.lookup("TutoringPlatform");

            
            Scanner scanner = new Scanner(System.in);

            Student s1 = new Student("s1");

            while (true) {
                String text = scanner.nextLine();
                if (text.equals("m")) {
                    Map<ITeacher,Set<IAppointment>> teachers= server.search_availability_for_specific_subject("Math");
                    for (Map.Entry<ITeacher, Set<IAppointment>> entry : teachers.entrySet()) {
                        System.out.println("For teacher: " + entry.getKey().to_string());
                        for (IAppointment app: entry.getValue())
                            System.out.println("    " + app.to_string());
                        if (entry.getValue().isEmpty()){
                            IStudent is1 = s1;
                            entry.getKey().add_student_to_waiting_list(is1, "Math");
                        }
                    
                    }
                    if (teachers != null) {
                        for (Map.Entry<ITeacher, Set<IAppointment>> entry : teachers.entrySet()) {
                            if (!entry.getValue().isEmpty()) {
                                for (IAppointment app: entry.getValue()) {
                                    IStudent is1 = s1;
                                    app.book_appointment(is1);
                                    System.out.println(s1.to_string());
                                    break;
                                }
                            }
                        }
                        
                        
                    }
        

                } else if (text.equals("p")) {
                    Map<ITeacher,Set<IAppointment>> teachers = server.search_availability_for_specific_subject("Physics");
                    for (Map.Entry<ITeacher, Set<IAppointment>> entry : teachers.entrySet()) {
                        System.out.println("For teacher: " + entry.getKey());
                        for (IAppointment app: entry.getValue())
                            System.out.println("    " + app.to_string());
                    }

                }

            }
            
            

        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
