package guru.springframework;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgpetclinic.model.Person;

public class PersonTest implements EntityTest {
    
    @Test
    @DisplayName("Test Properties")
    void groupedAssertions() {
        Person person = new Person(11l, "Joe", "Buck");
        System.out.println("hi");
        assertAll("Test props set",
            () -> assertEquals("Joe", person.getFirstName()),
            () -> assertEquals("Buck", person.getLastName())
            );
    }
}
