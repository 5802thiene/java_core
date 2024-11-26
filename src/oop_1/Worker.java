package oop_1;

public class Worker extends Staff {
    private int rank;

    public Worker() {
    }

    public Worker(String fullName, int age, String gender, String address, int rank) {
        super(fullName, age, gender, address);
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public void showStaff() {
        super.showStaff();
        System.out.println("Rank: " + getRank());
    }
}
