package nested.test;

public class LibraryMain {
    public static void main(String[] args) {
    Library library = new Library(4); // �ִ� 4���� ������ ������ �� �ִ� ������ ����
    library.addBook("å1", "����1");
    library.addBook("å2", "����2");
    library.addBook("å3", "����3");
    library.addBook("�ڹ� ORM ǥ�� JPA ���α׷���", "�迵��");
    library.addBook("OneMoreThing", "�⽺");
    library.showBooks(); // �������� ��� ���� ���� ���
    }
   }
