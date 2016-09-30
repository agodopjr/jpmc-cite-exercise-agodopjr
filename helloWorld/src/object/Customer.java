package object;

/**
 * Created by jpmc on 9/28/2016.
 */
public class Customer extends Person{

    private String address;
    private Integer telNo;
    private Integer customerID;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getTelNo() {
        return telNo;
    }

    public void setTelNo(Integer telNo) {
        this.telNo = telNo;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public  String getIntroduceYourself(){
        return "Hi I'm" + " " + getFirstName() + " " + getLastName();
    }
    public String getCustomer(){
        return "I live at" + " " + address;
    }

    public String getIntroduceYourself(String product){
        return "Hi I'm " + getFirstName() + " " + getLastName() +" " + "I want to buy" + " " + product;
    }

    public Integer getIntroduceYourself(int money) {
        return money;
    }

}
