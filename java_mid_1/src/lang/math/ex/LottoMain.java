package lang.math.ex;

import java.util.Arrays;

public class LottoMain {

    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();

        lottoGenerator.generate();
        System.out.println("�ζ� ��ȣ: " + Arrays.toString(lottoGenerator.getLottoNumber()));
    }
    
}
