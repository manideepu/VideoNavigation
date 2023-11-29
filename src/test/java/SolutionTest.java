import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.deepu.example.Solution.level;

import org.junit.jupiter.api.Test;

public class SolutionTest {

  @Test
  void demoTestMethod() {
    int[] obstacles_1 = {4, 6};
    int[] obstacles_2 = {2, 9, 4};
    int[] obstacles_3 = {};

    String instructions_1 = "RRRJJRRR";
    boolean status = level(obstacles_1, instructions_1);
    assertThat(status).isTrue();

    String instructions_2 = "RRRLJ";
    status = level(obstacles_1, instructions_2);
    assertThat(status).isFalse();

    String instructions_3 = "RRRJJRRRL";
    status = level(obstacles_1, instructions_3);
    assertThat(status).isTrue();

    String instructions_4 = "RRRLRJJRRR";
    status = level(obstacles_1, instructions_4);
    assertThat(status).isTrue();

    String instructions_5 = "RRRRRRRRRR";
    status = level(obstacles_1, instructions_5);
    assertThat(status).isFalse();

    String instructions_6 = "RRJJJJ";
    status = level(obstacles_1, instructions_6);
    assertThat(status).isFalse();

    String instructions_7 = "RLRRRJJRRLLJJJLRRRJJRRR";
    status = level(obstacles_1, instructions_7);
    assertThat(status).isTrue();

    String instructions_8 = "RRRJJRLJJJRRR";
    status = level(obstacles_1, instructions_8);
    assertThat(status).isFalse();

    String instructions_9 = "R";
    status = level(obstacles_1, instructions_9);
    assertThat(status).isFalse();

    String instructions_10 = "RJJJJR";
    status = level(obstacles_1, instructions_10);
    assertThat(status).isTrue();

    String instructions_11 = "RJJRRRJ";
    status = level(obstacles_2, instructions_11);
    assertThat(status).isTrue();

    status = level(obstacles_3, instructions_9);
    assertThat(status).isFalse();
  }
}
