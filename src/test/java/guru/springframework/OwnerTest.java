package guru.springframework;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import guru.springframework.sfgpetclinic.model.Owner;

public class OwnerTest {
    
    @Test
    void dependentAssertions() {
        Owner owner = new Owner(11l, "Joe", "Buck");

        owner.setCity("Key West");
        owner.setTelephone("995172551");

        assertAll("Properties Test", 
            () -> assertAll("Person Properties",
                () -> assertEquals("Joe", owner.getFirstName()),
                () -> assertEquals("Buck", owner.getLastName()),
            () -> assertAll("Owner Properties",
                () -> assertEquals("Key West", owner.getCity()),
                () -> assertEquals("995172551", owner.getTelephone()))
            ));
    }
}
