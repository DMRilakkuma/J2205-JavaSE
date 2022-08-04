package Exam2.exer30;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-08 16:09
 * @Description:
 */

public class Host {
    public void feeding(Pet pet) {
        System.out.println(pet.getNickname() + "喂食成功");
        pet.fedding();
    }
}