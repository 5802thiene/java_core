package oop_1;

public class Staff {
    private String fullName;
    private int age;
    private String gender;
    private String address;

    public Staff() {
    }

    public Staff(String fullName, int age, String gender, String address) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showStaff() {
        System.out.println("Full name: " + getFullName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender:: " + getGender());
        System.out.println("Address: " + getAddress());
    }
}
