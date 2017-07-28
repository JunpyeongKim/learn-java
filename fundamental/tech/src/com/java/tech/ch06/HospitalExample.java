/**
 * 6.1 상속을 알아야 유연한 설게를 할 수 있다
 *
 * 6-5.
 *  - $ javac com/java/tech/ch06/HospitalExample.java
 *  - $ java com/java/tech/ch06/HospitalExample
 */

package com.java.tech.ch06;

public class HospitalExample {
    public static void main(String[] args) {
        DoctorValue doctorVo = new DoctorValue();
        NurseValue nurseVo = new NurseValue();
        PatientValue patientVo = new PatientValue();
        PersonValue personVo = new PersonValue();

        System.out.println("Doctor Info : " + doctorVo.getInfo());
        System.out.println("Nurse Info : " + nurseVo.getInfo());
        System.out.println("Patient Info : " + patientVo.getInfo());
        System.out.println("Person Info : " + personVo.getInfo());
    }
}
