import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PriorityQueueTest {
    static Stream<Arguments> streamProvider() {
        // TODO: return Stream

        return Stream.of(
                Arguments.of(new int[] {1,2,3,4,5}, new int[] {1,2,3,4,5}),
                Arguments.of(new int[] {5,4,3,2,1}, new int[] {1,2,3,4,5}),
                Arguments.of(new int[] {4,1,7,3,2}, new int[] {1,2,3,4,7}),
                Arguments.of(new int[] {0, -1, 1}, new int[] {-1, 0, 1}),
                Arguments.of(new int[] {1}, new int[] {1}),
                Arguments.of(new int[] {}, new int[] {})
        );
    }

    @ParameterizedTest(name="#{index} - Test with Argument={0},{1}")
    @MethodSource("streamProvider")
    public void PriorityQueue_RunTest(int[] random_array, int[] correct_array) {
        PriorityQueue<Integer> test = new PriorityQueue<Integer>();
        int index = 0;
        Integer s;
        int[] result = new int[random_array.length];

        for (int i = 0; i < random_array.length; i++) {
            test.add(random_array[i]);
        }

        for (int i = 0; i < random_array.length; i++) {
            result[i] = test.poll();
        }

        assertArrayEquals(correct_array, result);
    }

    @Test
    public void constructor_InitialCapacityLessThanOne() {
        assertThrows(IllegalArgumentException.class, () -> {
            new PriorityQueue<>(0);
        });
    }

    @Test
    public void constructor_CollectionBeNull() {
        assertThrows(NullPointerException.class, () -> {
            Integer i = null;
            new PriorityQueue<Integer>(i);
        });
    }

    @Test
    public void add_ElementBeNull() {
        assertThrows(NullPointerException.class, () -> {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            Integer i = null;

            pq.add(i);
        });
    }

    @Test
    public void offer_ElementBeNull() {
        assertThrows(NullPointerException.class, () -> {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            Integer i = null;

            pq.add(i);
        });
    }

    @Test
    public void failTest() {
        assertThrows(NullPointerException.class, () -> {
            PriorityQueue<Integer> pq = new PriorityQueue<>(0);
        });
    }
}
