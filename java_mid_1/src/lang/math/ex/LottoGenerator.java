package lang.math.ex;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private final int[] lottoNumber = new int[6];

    void generate() {
        for (int i = 0; i < lottoNumber.length; i++) {
            boolean system = true;
            while (system) {
                system = false;
                int randomNumber = random.nextInt(45) + 1;
                for (int j = 0; j < lottoNumber.length; j++) {
                    if (lottoNumber[j] == randomNumber) {
                        system = true;
                    }
                    
                }
                lottoNumber[i] = randomNumber;
            }
        }
    }

    public int[] getLottoNumber() {
        return lottoNumber;
    }

    
}
