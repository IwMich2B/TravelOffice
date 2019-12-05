package pl.accenture;

public class Trip {
    private Date start;
    private Date end;
    private String destynation;
    private double price;

    public Trip(Date start, Date end, String destynation, double price) {
        this.start = start;
        this.end = end;
        this.destynation = destynation;
        this.price = price;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getDestynation() {
        return destynation;
    }

    public void setDestynation(String destynation) {
        this.destynation = destynation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Trip start: " + start.toString() + ", " + "Trip end: " + end.toString() + ", " + "Destynation: " + destynation + ", " + "Price: " + getPrice();
    }
}
