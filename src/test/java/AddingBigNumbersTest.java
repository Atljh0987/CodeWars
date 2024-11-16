import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AddingBigNumbersTest {
    public static String add(String a, String b) {
        int mem = 0;

        String maxStr = a.length() > b.length() ? a : b;
        String minStr = a.equals(maxStr) ? b : a;

        int[] max = Arrays.stream(maxStr.split("")).mapToInt(Integer::parseInt).toArray();
        int[] min = new int[max.length];
        int[] minMiddleArray = Arrays.stream(minStr.split("")).mapToInt(Integer::parseInt).toArray();

        int diff = maxStr.length() - minStr.length();
        System.arraycopy(minMiddleArray, 0, min, diff, maxStr.length() - diff);

        int[] result = new int[max.length + 1];

        for(int i = result.length - 1; i >= 0 ; i--) {
            int sum = (i < 1)? 0 : max[i - 1] + min[i - 1];

            if(mem > 0) {
                sum++;
                mem--;
            }

            if(sum > 9) {
                result[i] = sum - 10;
                mem++;
            } else {
                result[i] = sum;
            }
        }

        return Arrays.toString(result)
                .replaceAll("\\[|]|,|\\s", "")
                .replaceFirst("^0*", "");
    }

    @Test
    void test() {
//        assertThat(add("1", "1")).isEqualTo("2");
//        assertThat(add("123", "456")).isEqualTo("579");
//        assertThat(add("888", "222")).isEqualTo("1110");
        assertThat(add("1372", "69")).isEqualTo("1441");
        assertThat(add("12", "456")).isEqualTo("468");
        assertThat(add("100", "101")).isEqualTo("201");
        assertThat(add("63829983432984289347293874", "90938498237058927340892374089")).isEqualTo("91002328220491911630239667963");
    }
}
