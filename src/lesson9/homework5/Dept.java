package lesson9.homework5;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-05 18:31
 * @Description:
 */

public class Dept {
    // 编号
    private int serialNumber;
    // 部门名
    private String departmentName;
    // 部门介绍
    private String departmentIntroduction;
    // 分机号
    private int ext;

    public Dept() {
    }

    public Dept(int serialNumber, String departmentName, String departmentIntroduction, int ext) {
        this.serialNumber = serialNumber;
        this.departmentName = departmentName;
        this.departmentIntroduction = departmentIntroduction;
        this.ext = ext;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getDepartmentNumber() {
        return departmentName;
    }

    public void setDepartmentNumber(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentIntroduction() {
        return departmentIntroduction;
    }

    public void setDepartmentIntroduction(String departmentIntroduction) {
        this.departmentIntroduction = departmentIntroduction;
    }

    public int getExt() {
        return ext;
    }

    public void setExt(int ext) {
        this.ext = ext;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "serialNumber=" + serialNumber +
                ", departmentName=" + departmentName +
                ", departmentIntroduction='" + departmentIntroduction + '\'' +
                ", ext=" + ext +
                '}';
    }
}