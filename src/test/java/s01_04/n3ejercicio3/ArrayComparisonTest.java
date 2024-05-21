package s01_04.n3ejercicio3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayComparisonTest {
    @Test
     void testArraysAreIdentical() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        Assertions.assertThat(array1).isEqualTo(array2);
    }

    @Test
     void testArraysAreNotIdentical() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 6};

        Assertions.assertThat(array1).isNotEqualTo(array2);
    }
}
