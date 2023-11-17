package students;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.Set;

import interfaces.ITutoringServer;
import interfaces.ITeacher;

public class StudentMain {
    public static void main(String[] args) {

        try {
            ITutoringServer server = (ITutoringServer) Naming.lookup("TutoringPlatform");

            
            Scanner scanner = new Scanner(System.in);

            while (true) {
                String text = scanner.nextLine();
                if (text.equals("m")) {
                    Set<ITeacher> teachers = server.search_for_teachers_for_specific_subject("Math");
                    for (ITeacher teacher : teachers) {
                        System.out.println(teacher.to_string());
                    }
                } else if (text.equals("p")) {
                    Set<ITeacher> teachers = server.search_for_teachers_for_specific_subject("Physics");
                    for (ITeacher teacher : teachers) {
                        System.out.println(teacher.to_string());
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
