package lesson12.test3;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-11 16:22
 * @Description:
 */
/*Employee和Manger不是子父集关系，但是当Employeec实现Manger时,还要将接口类的方法都实现*/
/*一个类只能继承一个父类,但是可以实现多个接口*/
public class Employee extends People implements Manger {

    @Override
    public void getName() {

    }

    @Override
    public void add() {
        System.out.println("员工的添加");
    }

    @Override
    public void update() {

    }

    @Override
    public void insert() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void play(String name) {

    }

    @Override
    public void eat() {

    }
}