package pl.accenture;

public class AbroadTrip extends Trip{
    private double insurance;



    public AbroadTrip(Date start, Date end, String destynation, double price, double insurance) {
        super(start, end, destynation, price);
        this.insurance = insurance;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + insurance;
    }

    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }


}
