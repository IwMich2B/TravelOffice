package pl.accenture;

public class DomesticTrip extends Trip {
    private double ownArrivalDiscount;

    public DomesticTrip(Date start, Date end, String destynation, double price, double ownArrivalDiscount) {
        super(start, end, destynation, price);
        this.ownArrivalDiscount = ownArrivalDiscount;
    }



    public void setOwnArrivalDiscount(double ownArrivalDiscount) {
        this.ownArrivalDiscount = ownArrivalDiscount;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * ownArrivalDiscount;
    }
}
