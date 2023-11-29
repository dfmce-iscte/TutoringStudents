package service;

public class GustaveTutorServiceProxy implements service.GustaveTutorService {
  private String _endpoint = null;
  private service.GustaveTutorService gustaveTutorService = null;
  
  public GustaveTutorServiceProxy() {
    _initGustaveTutorServiceProxy();
  }
  
  public GustaveTutorServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initGustaveTutorServiceProxy();
  }
  
  private void _initGustaveTutorServiceProxy() {
    try {
      gustaveTutorService = (new service.GustaveTutorServiceServiceLocator()).getGustaveTutorService();
      if (gustaveTutorService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)gustaveTutorService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)gustaveTutorService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (gustaveTutorService != null)
      ((javax.xml.rpc.Stub)gustaveTutorService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public service.GustaveTutorService getGustaveTutorService() {
    if (gustaveTutorService == null)
      _initGustaveTutorServiceProxy();
    return gustaveTutorService;
  }
  
  public service.AppointmentsAvailable[] searchAvailabilityForSpecificSubject(java.lang.String subject) throws java.rmi.RemoteException{
    if (gustaveTutorService == null)
      _initGustaveTutorServiceProxy();
    return gustaveTutorService.searchAvailabilityForSpecificSubject(subject);
  }
  
  public void addStudentToWaitingList(java.lang.String teacher, java.lang.String subject) throws java.rmi.RemoteException{
    if (gustaveTutorService == null)
      _initGustaveTutorServiceProxy();
    gustaveTutorService.addStudentToWaitingList(teacher, subject);
  }
  
  public service.StudentWaitingList[] getStudentWaitingList() throws java.rmi.RemoteException{
    if (gustaveTutorService == null)
      _initGustaveTutorServiceProxy();
    return gustaveTutorService.getStudentWaitingList();
  }
  
  public java.lang.String[] getStudentAppointments() throws java.rmi.RemoteException{
    if (gustaveTutorService == null)
      _initGustaveTutorServiceProxy();
    return gustaveTutorService.getStudentAppointments();
  }
  
  public java.lang.String[] getAppoimentsNotified() throws java.rmi.RemoteException{
    if (gustaveTutorService == null)
      _initGustaveTutorServiceProxy();
    return gustaveTutorService.getAppoimentsNotified();
  }
  
  public void removeStudentToWaitingList(java.lang.String teacher, java.lang.String subject) throws java.rmi.RemoteException{
    if (gustaveTutorService == null)
      _initGustaveTutorServiceProxy();
    gustaveTutorService.removeStudentToWaitingList(teacher, subject);
  }
  
  public void setStudent(java.lang.String name) throws java.rmi.RemoteException{
    if (gustaveTutorService == null)
      _initGustaveTutorServiceProxy();
    gustaveTutorService.setStudent(name);
  }
  
  public void book_appointment(java.lang.String teacher, java.lang.String appointment) throws java.rmi.RemoteException{
    if (gustaveTutorService == null)
      _initGustaveTutorServiceProxy();
    gustaveTutorService.book_appointment(teacher, appointment);
  }
  
  
}