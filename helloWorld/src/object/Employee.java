package object;

/**
 * Created by jpmc on 9/28/2016.
 */
public class Employee extends Person  {

    private String department;
    private Float payGrade;
    private Integer employeeID;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Float getPayGrade() {
        return payGrade;
    }

    public void setPayGrade(Float payGrade) {
        this.payGrade = payGrade;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public  String getIntroduceYourself(){
        return "Hi I'm" + " " + getFirstName() + " " + getLastName();
    }

    public String getIWorkHere(){
        return "I work at" + " " + department;
    }


}
