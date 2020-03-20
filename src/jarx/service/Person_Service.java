package jarx.service;
import example.Response; // All the methods here we can set in the next example as we can see in the next lines of the code
// This is the interface in the name example //
import example.Person_example;
public interface Person_Service {
    // Here we can set the main example as we can see in the next lines of the code CRUD operations: //
    public Response add_Person(Person_example p);
    public Person_example get_Person(int id); // Here the solution is with the identifiders as we can see in the next examples
    public Response delete_Person(int id); // Here the sol is with the id //
    public Person_example[] get_all_Persons();


}
