package fact.it.examcustomercheck.entities;


public class Customer {

    private String name;
    private boolean citizen;
    private int yearOfRegistration;

    public Customer() {

    }

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, boolean citizen, int yearOfRegistration) {
        this.name = name;
        this.citizen = citizen;
        this.yearOfRegistration = yearOfRegistration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCitizen() {
        return citizen;
    }

    public void setCitizen(boolean citizen) {
        this.citizen = citizen;
    }

    public int getYearOfRegistration() {
        return yearOfRegistration;
    }

    public void setYearOfRegistration(int yearOfRegistration) {
        this.yearOfRegistration = yearOfRegistration;
    }

    @Override
    public String toString() {
        if(citizen){
            return this.name+" (citizen) registered in "+this.yearOfRegistration;
        }else {
            return this.name+" registered in "+this.yearOfRegistration;
        }

    }
}
