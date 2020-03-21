package example;
import java.io.Serializable; // This is for the serializable manner as we can see in the next lines of the code
import java.util.*;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlRootElement;
@WebService
@XmlRootElement(name="Person")
public class Person_example implements Serializable {
    private  String Name;
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
