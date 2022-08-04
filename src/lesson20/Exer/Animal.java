package lesson20.Exer;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-30 15:10
 * @Description:
 */

public class Animal {

    private String kid;

    public Animal() {
    }

    public Animal(String kid) {
        this.kid = kid;
    }

    public String getKid() {
        return kid;
    }

    public void setKid(String kid) {
        this.kid = kid;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "kid='" + kid + '\'' +
                '}';
    }

    public void cry() {
        
    }
}