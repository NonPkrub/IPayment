 public abstract class Staff implements IPayment {
    public Staff(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    protected int salary;
    protected String name;


     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }



    public abstract int getPayment();

     public int getTax(){
         return this.getPayment()*3/100;
     }

}
