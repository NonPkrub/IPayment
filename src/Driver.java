public class Driver implements IPayment {

    private int noOfTrip;
    private int rate;

    private String name;
    public Driver(String name,int noOfTrip, int rate) {
        this.name = name;
        this.noOfTrip = noOfTrip;
        this.rate = rate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfTrip() {
        return noOfTrip;
    }

    public void setNoOfTrip(int noOfTrip) {
        this.noOfTrip = noOfTrip;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public int getPayment() {
        return noOfTrip * rate;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getTax(){return 0; }
}
