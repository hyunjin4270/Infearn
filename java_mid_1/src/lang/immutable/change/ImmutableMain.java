package lang.immutable.change;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj obj2 = obj1.add(20);

        //계산 이후에도 기존값과 신규값 모두 확인 가능
        System.out.println("obj = " + obj1.getValue());
        System.out.println("obj = " + obj2.getValue());
    }
    
}

