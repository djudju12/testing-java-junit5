package guru.springframework.sfgpetclinic.services.springdatajpa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgpetclinic.model.Owner;

public class OwnerSDJpaServiceTest {

    private OwnerSDJpaService service;

    @BeforeEach
    void setUp() {
        service = new OwnerSDJpaService(null, null, null);
    }

    @Test
    void testDelete() {

    }

    @Test
    void testDeleteById() {

    }

    @Test
    void testFindAll() {

    }

    @Test
    void testFindAllByLastNameLike() {

    }

    @Test
    void testFindById() {

    }

    @Disabled
    @Test
    void testFindByLastName() {
        Owner foundOwner = service.findByLastName("Buck");
    }

    @Test
    void testSave() {

    }
}
