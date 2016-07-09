package model;

/**
 * Created by sarasumit on 6/25/2016.
 */
public class Student {
    Integer id;
    String name;
    Integer batch;
    Integer roll;
    String email;
    String address;

    public Student(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public Student(String name,Integer roll,Integer batch,String email,String address){
        this.name = name;
        this.roll = roll;
        this.batch = batch;
        this.email= email;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBatch() {
        return batch;
    }

    public void setBatch(Integer batch) {
        this.batch = batch;
    }

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
