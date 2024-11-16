import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MakeASpiralTest {

    public static int[][] spiralize(int size) {
        int[][] result = new int[size][size];

        for(int i = 0; i <= size / 2; i += 2) {
            for(int j = i; j < size - i; j++) result[i][j - ((i == 0)? 0 : 1)] = 1;
            for(int j = i; j < size - i; j++) result[j][size - i - 1] = 1;
            for(int j = i; j < size - i - 1; j++) result[size - i - 1][size - j - 1] = 1;
            for(int j = i; j < size - i - 2; j++) result[size - j - 1][i] = 1;
        }

        return result;
    }

    @Test
    public void test10() {
        assertThat(spiralize(10)).isEqualTo(
                new int[][] {
                        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                        { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1 },
                        { 1, 0, 0, 0, 0, 0, 0, 1, 0, 1 },
                        { 1, 0, 1, 1, 1, 1, 0, 1, 0, 1 },
                        { 1, 0, 1, 0, 0, 1, 0, 1, 0, 1 },
                        { 1, 0, 1, 0, 0, 0, 0, 1, 0, 1 },
                        { 1, 0, 1, 1, 1, 1, 1, 1, 0, 1 },
                        { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                });
    }

    @Test
    public void test9() {
        assertThat(spiralize(9)).isEqualTo(
                new int[][] {
                        { 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                        { 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                        { 1, 1, 1, 1, 1, 1, 1, 0, 1 },
                        { 1, 0, 0, 0, 0, 0, 1, 0, 1 },
                        { 1, 0, 1, 1, 1, 0, 1, 0, 1 },
                        { 1, 0, 1, 0, 0, 0, 1, 0, 1 },
                        { 1, 0, 1, 1, 1, 1, 1, 0, 1 },
                        { 1, 0, 0, 0, 0, 0, 0, 0, 1 },
                        { 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                });
    }

    @Test
    public void test7() {
        assertThat(spiralize(7)).isEqualTo(
                new int[][] {
                        { 1, 1, 1, 1, 1, 1, 1 },
                        { 0, 0, 0, 0, 0, 0, 1 },
                        { 1, 1, 1, 1, 1, 0, 1 },
                        { 1, 0, 0, 0, 1, 0, 1 },
                        { 1, 0, 1, 1, 1, 0, 1 },
                        { 1, 0, 0, 0, 0, 0, 1 },
                        { 1, 1, 1, 1, 1, 1, 1 },
                });
    }

    @Test
    public void test5() {
        assertThat(spiralize(5)).isEqualTo(
                new int[][] {
                        { 1, 1, 1, 1, 1 },
                        { 0, 0, 0, 0, 1 },
                        { 1, 1, 1, 0, 1 },
                        { 1, 0, 0, 0, 1 },
                        { 1, 1, 1, 1, 1 }
                });
    }

    @Test
    public void test8() {
        assertThat(spiralize(8)).isEqualTo(
                new int[][] {
                        { 1, 1, 1, 1, 1, 1, 1, 1 },
                        { 0, 0, 0, 0, 0, 0, 0, 1 },
                        { 1, 1, 1, 1, 1, 1, 0, 1 },
                        { 1, 0, 0, 0, 0, 1, 0, 1 },
                        { 1, 0, 1, 0, 0, 1, 0, 1 },
                        { 1, 0, 1, 1, 1, 1, 0, 1 },
                        { 1, 0, 0, 0, 0, 0, 0, 1 },
                        { 1, 1, 1, 1, 1, 1, 1, 1 },
                });
    }

    @Test
    public void test6() {
        assertThat(spiralize(6)).isEqualTo(
                new int[][] {
                        { 1, 1, 1, 1, 1, 1 },
                        { 0, 0, 0, 0, 0, 1 },
                        { 1, 1, 1, 1, 0, 1 },
                        { 1, 0, 0, 1, 0, 1 },
                        { 1, 0, 0, 0, 0, 1 },
                        { 1, 1, 1, 1, 1, 1 }
                });
    }
}
