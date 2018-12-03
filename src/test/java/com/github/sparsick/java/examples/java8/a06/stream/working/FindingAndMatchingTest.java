package com.github.sparsick.java.examples.java8.a06.stream.working;

import java.util.Optional;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FindingAndMatchingTest {

    private final FindingAndMatching findingAndMatchingUnderTest = new FindingAndMatching();

    @Test
    void anyMatch() {
        boolean match = findingAndMatchingUnderTest.anyMatch();
        assertThat(match).isTrue();
    }

    @Test
    void allMatch() {
        boolean match = findingAndMatchingUnderTest.allMatch();
        assertThat(match).isTrue();
    }

    @Test
    void noneMatch() {
        boolean match = findingAndMatchingUnderTest.noneMatch();
        assertThat(match).isTrue();
    }

    @Test
    void findAny(){
        Optional<Car> any = findingAndMatchingUnderTest.findAny();

        assertThat(any.isPresent()).isTrue();
    }

    @Test
    void findFirst(){
        Optional<Car> any = findingAndMatchingUnderTest.findFirst();

        assertThat(any.isPresent()).isTrue();
    }
}