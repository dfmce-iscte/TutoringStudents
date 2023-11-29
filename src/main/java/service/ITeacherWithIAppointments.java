/**
 * ITeacherWithIAppointments.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class ITeacherWithIAppointments  implements java.io.Serializable {
    private java.lang.String IAppointments;

    private java.lang.String ITeacher;

    private java.lang.String teacher;

    private java.lang.String appointments;

    public ITeacherWithIAppointments() {
    }

    public ITeacherWithIAppointments(
           java.lang.String IAppointments,
           java.lang.String ITeacher,
           java.lang.String teacher,
           java.lang.String appointments) {
           this.IAppointments = IAppointments;
           this.ITeacher = ITeacher;
           this.teacher = teacher;
           this.appointments = appointments;
    }


    /**
     * Gets the IAppointments value for this ITeacherWithIAppointments.
     * 
     * @return IAppointments
     */
    public java.lang.String getIAppointments() {
        return IAppointments;
    }


    /**
     * Sets the IAppointments value for this ITeacherWithIAppointments.
     * 
     * @param IAppointments
     */
    public void setIAppointments(java.lang.String IAppointments) {
        this.IAppointments = IAppointments;
    }


    /**
     * Gets the ITeacher value for this ITeacherWithIAppointments.
     * 
     * @return ITeacher
     */
    public java.lang.String getITeacher() {
        return ITeacher;
    }


    /**
     * Sets the ITeacher value for this ITeacherWithIAppointments.
     * 
     * @param ITeacher
     */
    public void setITeacher(java.lang.String ITeacher) {
        this.ITeacher = ITeacher;
    }


    /**
     * Gets the teacher value for this ITeacherWithIAppointments.
     * 
     * @return teacher
     */
    public java.lang.String getTeacher() {
        return teacher;
    }


    /**
     * Sets the teacher value for this ITeacherWithIAppointments.
     * 
     * @param teacher
     */
    public void setTeacher(java.lang.String teacher) {
        this.teacher = teacher;
    }


    /**
     * Gets the appointments value for this ITeacherWithIAppointments.
     * 
     * @return appointments
     */
    public java.lang.String getAppointments() {
        return appointments;
    }


    /**
     * Sets the appointments value for this ITeacherWithIAppointments.
     * 
     * @param appointments
     */
    public void setAppointments(java.lang.String appointments) {
        this.appointments = appointments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ITeacherWithIAppointments)) return false;
        ITeacherWithIAppointments other = (ITeacherWithIAppointments) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IAppointments==null && other.getIAppointments()==null) || 
             (this.IAppointments!=null &&
              this.IAppointments.equals(other.getIAppointments()))) &&
            ((this.ITeacher==null && other.getITeacher()==null) || 
             (this.ITeacher!=null &&
              this.ITeacher.equals(other.getITeacher()))) &&
            ((this.teacher==null && other.getTeacher()==null) || 
             (this.teacher!=null &&
              this.teacher.equals(other.getTeacher()))) &&
            ((this.appointments==null && other.getAppointments()==null) || 
             (this.appointments!=null &&
              this.appointments.equals(other.getAppointments())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getIAppointments() != null) {
            _hashCode += getIAppointments().hashCode();
        }
        if (getITeacher() != null) {
            _hashCode += getITeacher().hashCode();
        }
        if (getTeacher() != null) {
            _hashCode += getTeacher().hashCode();
        }
        if (getAppointments() != null) {
            _hashCode += getAppointments().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ITeacherWithIAppointments.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service", "ITeacherWithIAppointments"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IAppointments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service", "IAppointments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ITeacher");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service", "ITeacher"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teacher");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service", "teacher"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appointments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service", "appointments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
