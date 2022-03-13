import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PriorityQueueTest {
    static Stream<Arguments> streamProvider() {
        // TODO: return Stream

        return Stream.of(
                Arguments.of(new int[] {1,2,3,4,5}, new int[] {1,2,3,4,5}),
                Arguments.of(new int[] {5,4,3,2,1}, new int[] {1,2,3,4,5}),
                Arguments.of(new int[] {4,1,7,3,2}, new int[] {1,2,3,4,7}),
                Arguments.of(new int[] {1}, new int[] {1})
        );
    }

    @ParameterizedTest(name="#{index} - Test with Argument={0},{1}")
    @MethodSource("streamProvider")
    public void PriorityQueue_RunTest(int[] random_array, int[] correct_array) {
        PriorityQueue<Integer> test = new PriorityQueue<Integer>();
        int index = 0;
        Integer s;
        int[] result = new int[random_array.length];

        // TODO: random_array add to PriorityQueue

        for (int i = 0; i < random_array.length; i++) {
            test.add(random_array[i]);
        }

        // TODO: get PriorityQueue result

        for (int i = 0; i < random_array.length; i++) {
            result[i] = test.poll();
        }

        assertArrayEquals(correct_array, result);

        // TODO: 3 unique Exceptions
    }
}
