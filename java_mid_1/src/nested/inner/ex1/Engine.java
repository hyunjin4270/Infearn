package nested.inner.ex1;

// Car������ ���
public class Engine {

    private Car car;

    public Engine(Car car) {
        this.car = car;
    }

    public void start() {
        System.out.println("���� ���� Ȯ��: " + car.getChargeLevel());
        System.out.println(car.getModel() + "�� ������ �����մϴ�.");
    }
    
}
