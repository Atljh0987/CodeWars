import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MakeTheDeadfishSwimTest {
    public static int[] parse(String data) {
        int number = 0;
        LinkedList<Integer> result = new LinkedList<>();

        String[] split = data.split("");

        for(var letter : split) {
            switch (letter) {
                case "i": number++; break;
                case "s": number *= number; break;
                case "d": number--; break;
                case "o": result.add(number); break;
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    @Test
    void test() {
        assertArrayEquals(new int[] {8, 64}, parse("iiisdoso"));
        assertArrayEquals(new int[] {8, 64, 3600}, parse("iiisdosodddddiso"));
    }
}
