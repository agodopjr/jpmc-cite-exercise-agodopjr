package object;

/**
 * Created by jpmc on 9/28/2016.
 */
public abstract class Person {

    private String firstName;
    private String lastName;
    private String email;
    private Integer age;

    public Person(){

    }

    public Person(String firstName, String lastName, String email, Integer age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName() {
        return  firstName;

    }

    /* TODO create some methods public name is introduceYourself */
    /* Hi  I'm firstName&lastName*/

    public String getIntroduceYourself(){
        return "Hi I'm" + " " + firstName + " " + lastName + " " + "I'm" + " " + " " + age + " " + "years old.";
    }


}
