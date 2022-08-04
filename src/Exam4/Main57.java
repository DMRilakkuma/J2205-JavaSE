package Exam4;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-22 09:38
 * @Description:
 */

public class Main57 {
    interface A {
        void show();
    }

    interface B {
        int add(int a, int b);
    }

    class C implements A, B {

        @Override
        public void show() {

        }

        @Override
        public int add(int a, int b) {
            return 0;
        }
    }

    public void main(String[] args) {
        C c = new C();
        c.add(4, 2);
        c.show();
    }
}