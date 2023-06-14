package guru.springframework.sfgpetclinic.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgpetclinic.fauxspring.Model;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.SpecialtyService;
import guru.springframework.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.services.map.SpecialityMapService;
import guru.springframework.sfgpetclinic.services.map.VetMapService;

public class VetControllerTest {

    VetService vetService;
    SpecialtyService service;
    VetController controller;
    ModelTest modelTest;

    class ModelTest implements Model {

        private Map<String, Object> map;

        @Override
        public void addAttribute(String key, Object o) {
            if (map == null) map = new HashMap<>();
            map.put(key, o);
        }

        @Override
        public void addAttribute(Object o) {}
        
    }

    @BeforeEach
    void setUp() {
        service = new SpecialityMapService();
        vetService = new VetMapService(service);
        controller = new VetController(vetService);
        modelTest = new ModelTest(); 
    }

    @Test
    void testListVets() {
        assertEquals("vets/index", controller.listVets(modelTest));
    }
}
