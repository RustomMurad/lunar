package qa.pragmatic.novalunium;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Address {

    private String address;

    public Address() {
        this.address = "123 non main st.";
    }


    public String getAddress() {
        return address;
    }
}
