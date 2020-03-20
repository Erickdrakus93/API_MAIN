package example;
import java.util.*;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="Person")
public class Person_example {
    private  String Name;
    private int age;
    private Boolean Sex;
    private int Id;
    private int Age;
    //Here we can set the main examples in the encapsulations manner Tactic
    public String get_name(){
        return Name;
    }
    // The setter method
    public void set_name(String name){
        this.Name = name;
    }
    public Boolean get_Sex(){
        return Sex;
    }
    public void Set_sex(Boolean sex){
        this.Sex = sex;
    }
    public int get_id(){
        return Id;
    }
    public void set_id(int id){
        this.Id = id;
    }
    public int get_age(){
        return Age;
    }
    public void set_age(int age){
        this.Age = age;
    }
    // Here we can set an Overrider form
    //@Override
    public String To_String(){
        return Id + "::" + Name + "::" + Sex;
    }
}
