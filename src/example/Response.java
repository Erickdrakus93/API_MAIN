package example;
import example.Person_example;
import javax.xml.bind.annotation.XmlRootElement;
// This is the response element as we can see in the next lines of the code
@XmlRootElement
public class Response {
    private boolean Status;
    private String Message;
    // Methods as we can see in the next examples in the next manner //

    public boolean is_Status(){
        return Status;
    }
    public void Set_Status(boolean status){
        this.Status = status;
    }
    // The last example is the next manner in the next manner in the main example //
    public String get_message(){
        return Message;
    }
    public void Set_message(String message){
        this.Message = message;
    }

}
