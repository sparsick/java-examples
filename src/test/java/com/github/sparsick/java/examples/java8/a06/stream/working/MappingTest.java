package com.github.sparsick.java.examples.java8.a06.stream.working;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MappingTest {

    private final Mapping mappingUnderTest = new Mapping();

    @Test
    void map() {
        List<String> carColors = mappingUnderTest.map();

        assertThat(carColors).hasSize(4)
                .contains("yellow", "blue", "green", "red");
    }

    @Test
    void flatMap() {
        List<String> carColors = mappingUnderTest.flatMap();

        assertThat(carColors).hasSize(7)
                .contains("N", "i", "c", "e", "c", "a", "r");
    }

}