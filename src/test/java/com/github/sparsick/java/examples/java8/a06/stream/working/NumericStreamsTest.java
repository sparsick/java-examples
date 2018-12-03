package com.github.sparsick.java.examples.java8.a06.stream.working;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NumericStreamsTest {

    private NumericStreams numericStreamsUnderTest = new NumericStreams();

    @Test
    void mappingToNumericStream() {
        int sumOfHorsepower = numericStreamsUnderTest.mappingToNumericStream();

        assertThat(sumOfHorsepower).isEqualTo(500);
    }
}