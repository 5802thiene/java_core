package oop_1;

public class Employeer extends Staff {
    private String job;

    public Employeer() {
    }

    public Employeer(String fullName, int age, String gender, String address, String job) {
        super(fullName, age, gender, address);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void showStaff() {
        super.showStaff();
        System.out.println("Job: " + getJob());
    }
}
