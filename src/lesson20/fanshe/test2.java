package lesson20.fanshe;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-30 14:17
 * @Description:
 */

public class test2 {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        // 创建一个map
        Map<String, Object> map = new HashMap<>();
        map.put("name", "张三");
        map.put("age", 20);
        map.put("sex", '男');
        map.put("height", 180.5);

        // 将这个map对象转换为Student对象
        Student student = mapToBean(Student.class, map);
        System.out.println(student);
    }

    // 第一个参数:需要转换的bean的字节码文件
    // 第二个参数:map 需要被转化为bean对象的集合
    public static <T> T mapToBean(Class<T> tClass, Map<String, Object> map) throws InstantiationException, IllegalAccessException {
        // 根据传来的tClass找到该类的字节码文件
        T t = tClass.newInstance();

        // 核心:将map转为bean
        map.forEach((k, v) -> {
            // 将map中的value放入到bean对象中,也就是T对象中
            try {
                // 根据map中的key去bean对象中找到对应的属性
                Field field = tClass.getDeclaredField(k);
                // 不管属性是否为私有的暴力释放
                if (Objects.nonNull(field)) {
                    field.setAccessible(true);
                    field.set(t, v);
                }
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        });

        return t;
    }
}