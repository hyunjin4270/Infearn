package enumeration.ex2;

public class ClassGrade {

    static final ClassGrade BASIC = new ClassGrade();
    static final ClassGrade GOLD = new ClassGrade();
    static final ClassGrade DIAMOND = new ClassGrade();
    

    //private 생성자 추가
    private ClassGrade() {}
}
