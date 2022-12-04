package qa.pragmatic.novalunium;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    private Address address;


    @Autowired
    private Salary salary;


    public void printDetailes(){
        System.out.println("Address : "+this.address.getAddress());
        System.out.println("salary : "+this.salary.getAmount());
    }
}
