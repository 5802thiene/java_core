package oop_1;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Staff> listStaff = new ArrayList<>();

    public void addStaff(Staff staff) {
        listStaff.add(staff);
        System.out.println("ADD SUCCESS.");
    }

    public void findByName(String name) {
        for (Staff staff : listStaff) {
            if (staff.getFullName().equalsIgnoreCase(name)) {
                staff.showStaff();
                return;
            }
        }
        System.out.println("NO SUCH NAME.");
    }

    public void fullList() {
        if (listStaff.isEmpty()) {
            System.out.println("LIST IS EMPTY.");
        }

        for (Staff staff : listStaff) {
            staff.showStaff();
            System.out.println("--------------");
        }
    }

    public int enterInteger() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            }
            catch (Exception e) {
                System.out.println("INCORRECT FORMAT. PLEASE RE-ENTER.");
            }
        }
    }

    public void menu() {
        while (true) {
            System.out.println("STAFF MANAGER");
            System.out.println("1. Add staff.");
            System.out.println("2. Find by name.");
            System.out.println("3. Show all staff.");
            System.out.println("4. Exit.");
            System.out.println("CHOOSE MENU.");
            int choose = enterInteger();

            switch (choose) {
                case 1:
                    System.out.println("ADD STAFF");
                    System.out.println("1. Worker.");
                    System.out.println("2. Engineer.");
                    System.out.println("3. Employerr.");
                    System.out.println("CHOOSE STAFF.");
                    int chooseStaff = enterInteger();

                    System.out.print("Full name: ");
                    String fullName = sc.nextLine();
                    System.out.print("Age: ");
                    int age = enterInteger();
                    System.out.print("Gender: ");
                    String gender = sc.nextLine();
                    System.out.print("Address: ");
                    String address = sc.nextLine();

                    if (chooseStaff == 1) {
                        System.out.print("Rank (1-10): ");
                        int rank = enterInteger();
                        listStaff.add(new Worker(fullName, age, gender, address, rank));
                    }
                    else if (chooseStaff == 2) {
                        System.out.print("Major: ");
                        String major = sc.nextLine();
                        listStaff.add(new Engineer(fullName, age, gender, address, major));
                    }
                    else if (chooseStaff == 3) {
                        System.out.print("Job: ");
                        String job = sc.nextLine();
                        listStaff.add(new Employeer(fullName, age, gender, address, job));
                    }

                    break;

                case 2:
                    System.out.print("ENTER NAME YOU WANT FIND: ");
                    String name = sc.nextLine();
                    findByName(name);
                    break;

                case 3:
                    System.out.println("SHOW FULL LIST: ");
                    fullList();
                    break;

                case 4:
                    System.out.print("EXIT.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("PLEASE RE-ENTER.");
            }
        }
    }
}
