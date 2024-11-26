package oop_1;

public class Engineer extends Staff {
    private String major;

    public Engineer() {
    }

    public Engineer(String fullName, int age, String gender, String address, String major) {
        super(fullName, age, gender, address);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void showStaff() {
        super.showStaff();
        System.out.println("Major: " + getMajor());
    }
}
