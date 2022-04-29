package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.AddSampleImpl;
import guru.springframework.sfgdi.services.SubSampleImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathControllerTest {
    private MathController controller;


    @BeforeEach
    void setUp() {
        this.controller = new MathController(new AddSampleImpl());
    }

    @Test
    void add() {
        controller.add(8,2);
    }
}