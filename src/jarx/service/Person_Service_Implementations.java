package jarx.service;
import java.util.*;

// Here we can set in the next lines of the code

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

// Here we can include the main example as we can set in the next terms
import example.Person_example;
import example.Response;

@Path("/person")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Person_Service_Implementations implements Person_Service {
    private static Map<Integer, Person_example> persons = new HashMap<Integer, Person_example>();
    @Override
    @POST
    @Path("/add")
    public Response add_Person(Person_example p) {
        Response response = new Response();
        if(persons.get(p.get_id()) != null){
                response.Set_Status(false);
                response.Set_message("Person Created Sucefull");
                return response;
        }
        persons.put(p.get_id(), p);
        response.Set_Status(true);
        response.Set_message("Person Created Sucefull");
        return response;
    }
    @Override
    @GET
    @Path("/{id}/get")
    public Person_example get_Person(@PathParam("id") int id) {
        return persons.get(id);
    }

    @Override
    @DELETE
    @Path("{id}/delete")
    public Response delete_Person(@PathParam("id") int id) {
        Response response = new Response();
        // The logic in the program as we can set //
        if(persons.get(id) == null){
            response.Set_Status(false);
            response.Set_message("Person Doesn't exist");
            return response;
        }
        persons.remove(id);
        response.Set_Status(true);
        response.Set_message("Person Deleted Sucefully");
        return response;
    }
    // Here we can set the next example as we can see in the next lines of the code
    @GET
    @Path("/{id}/getDummy")
    public Person_example get_dummy_person(@PathParam("id") int id){
        Person_example p = new Person_example();
        p.set_age(72);
        p.set_name("Liz");
        p.set_id(id);
        return p;
    }

    @Override
    @GET
    @Path("/getAll")
    public Person_example[] get_all_Persons() {
        Set<Integer> ids = persons.keySet();
        Person_example[] p = new Person_example[ids.size()];
        int i =0;
        for(Integer id:ids){
            p[i] = persons.get(id);
            i++;
        }
        return p;
    }
}
