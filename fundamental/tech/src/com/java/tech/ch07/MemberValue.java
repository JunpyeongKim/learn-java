package com.java.tech.ch07;


/**
 * Knowhow 7.3 : ValueObject 디자인 패턴과 Get/Set 메소드
 *
 *  7-14. MemberValue.java
 */
public class MemberValue {
    private int memberId;
    private String phoneNumber;
    private String name;
    private long mileage;

    public MemberValue() {
        this.memberId = 0;
        this.mileage = 0;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memeberId) {
        this.memberId = memeberId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
