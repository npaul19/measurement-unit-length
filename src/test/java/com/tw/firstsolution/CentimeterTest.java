package com.tw.firstsolution;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class CentimeterTest {

    @Test
    void should_equate_1_cm_to_1_cm() {
        Centimeter oneCentimeter = new Centimeter(1);
        Centimeter anotherOneCentimeter = new Centimeter(1);

        assertThat(oneCentimeter, is(equalTo(anotherOneCentimeter)));
    }

    @Test
    void should_not_equate_1_cm_to_2_cm() {
        Centimeter oneCentimeter = new Centimeter(1);
        Centimeter twoCentimeter = new Centimeter(2);

        assertThat(oneCentimeter, is(not(equalTo(twoCentimeter))));
    }

    @Test
    void should_equate_100_cm_to_1_m() {
        Centimeter hundredCentimeter = new Centimeter(100);
        Meter oneMeter = new Meter(1);

        assertThat(hundredCentimeter, is(equalTo(oneMeter)));
    }

}
