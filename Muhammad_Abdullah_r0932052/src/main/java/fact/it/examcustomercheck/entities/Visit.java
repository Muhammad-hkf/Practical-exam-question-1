package fact.it.examcustomercheck.entities;

import java.util.Calendar;

public class Visit {

    private int enterWeight;
    private int exitWeight;

    private Customer customer;

    public int getEnterWeight() {
        return enterWeight;
    }

    public void setEnterWeight(int enterWeight) {
        this.enterWeight = enterWeight;
    }

    public int getExitWeight() {
        return exitWeight;
    }

    public void setExitWeight(int exitWeight) {
        this.exitWeight = exitWeight;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getDepositedWeight() {
        return this.enterWeight - this.exitWeight;
    }

    public int getMembershipAge(){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year-this.customer.getYearOfRegistration();
    }

    public  int getCost(){
        if(getDepositedWeight()<=7 && getMembershipAge()>5){
            return 0;
        } else if (getDepositedWeight()<=50) {
            return getDepositedWeight()*2;
        }else {
            return getDepositedWeight()*3;
        }

    }

    @Override
    public String toString() {
        return  this.customer.getName() +" registered in "+this.customer.getYearOfRegistration() +" has deposited "+getDepositedWeight()+"kg. of waste: Cost = "+ getCost()+" euro.";
    }
}
