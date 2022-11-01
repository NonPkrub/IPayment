import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<IPayment> staffs = new ArrayList<>();

        Developer bank = new Developer(35000,"Bank",20,500);
        staffs.add(bank);
        int payment = bank.getPayment();
        CEO non = new CEO(80000,"Non",20,500);
        staffs.add(non);
        int ceoPayment = non.getPayment();
        Marketing krit = new Marketing(25000,"Krit",20,500);
        staffs.add(krit);
        int mPayment = krit.getPayment();

        System.out.println("Name: " + bank.getName() +" Total payment:"+payment +" tax: "+bank.getTax());
        System.out.println("Name: " + non.getName() +" Total payment:"+ceoPayment +" tax: "+non.getTax());
        System.out.println("Name: " + krit.getName() +" Total payment:"+mPayment +" tax: "+krit.getTax());


        Driver grab = new Driver("Ammar",100,50);
        int dPayment = grab.getPayment();
        staffs.add(grab);
        System.out.println("Name:" +grab.getName() +" Payment: "+ dPayment);
        Cleaner clean = new Cleaner("Ammuay",100,50);
        int cPayment = clean.getPayment();
        staffs.add(clean);
        System.out.println("Name: " + clean.getName() + " Payment: "+ cPayment);
        Electricity electro = new Electricity(200,50);
        System.out.println("Electircity Payment: " + electro.getPayment() );
        InternetAccess net = new InternetAccess(2000);
        System.out.println("Internet Payment: " + net.getPayment() );
        Rental rent = new Rental (2000);
        System.out.println("Rental Payment: " + rent.getPayment() );
        int otherPayment = electro.getPayment() + net.getPayment() + rent.getPayment();
        int totalPayment = 0;
        int totalTax =0;
        for (IPayment staff : staffs) {
            System.out.println(staff.getName() +" Payment: "+ staff.getPayment()+" tax: "+staff.getTax());
            totalPayment = totalPayment + staff.getPayment();
            totalTax += staff.getTax();


        }
        int realTotal = totalPayment + otherPayment;
        System.out.println("Total payment: " + realTotal +" Total Tax: "+ totalTax);



    }
}