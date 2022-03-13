import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PriorityQueueTest {
    static Stream<Argument> streamProvider() {
        // TODO: return Stream
    }

    @ParameterizedTest(name="#{index} - Test with Argument={0},{1}")
    @MethodSource("streamProvider")
    public void PriorityQueue_RunTest(int[] random_array, int[] correct_array) {
        PriorityQueue<Integer> test = new PriorityQueue<Integer>();
        int index = 0;
        Integer s;
        int[] result = new int[random_array.length];

        // TODO: random_array add to PriorityQueue

        // TODO: get PriorityQueue result

        assertArrayEquals(correct_array, result);

        // TODO: 3 unique Exceptions
    }
}
