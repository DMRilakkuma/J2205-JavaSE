package lesson6.homework1;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-29 15:06
 * @Description:
 */
public class Hero {
    private int number;
    private String nickname;
    private String name;
    private String type;
    private int attackPower;
    private int defense;
    private int bloodVolume;
    private int magicalValue;

    public Hero() {
    }

    public Hero(int number, String nickname, String name, String type, int attackPower, int defense, int bloodVolume, int magicalValue) {
        this.number = number;
        this.nickname = nickname;
        this.name = name;
        this.type = type;
        this.attackPower = attackPower;
        this.defense = defense;
        this.bloodVolume = bloodVolume;
        this.magicalValue = magicalValue;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getBloodVolume() {
        return bloodVolume;
    }

    public void setBloodVolume(int bloodVolume) {
        this.bloodVolume = bloodVolume;
    }

    public int getMagicalValue() {
        return magicalValue;
    }

    public void setMagicalValue(int magicalValue) {
        this.magicalValue = magicalValue;
    }

    // 攻击
    public void attack(Hero h) {
        h.bloodVolume = h.bloodVolume + h.defense - this.attackPower;
    }

    //判断是否死亡
    public boolean death() {
        return this.bloodVolume <= 0;
    }

    // 重生
    public boolean rebirth() {
        int n = (int) (Math.random() * 100 + 1);
        // 重生率百分之5
        if (n <= 5) {
            this.bloodVolume = 1;
            return true;
        }
        return false;
    }

    // 移动
    public void mobile() {

    }

}