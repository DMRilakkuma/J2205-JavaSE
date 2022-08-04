package lesson8;

import java.util.Arrays;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-04 13:48
 * @Description: 集合方法
 */
public class MyArrayList {
    // 创建一个object的null数组
    private Object[] objects;
    //  当前数组中元素总数
    private int arrayindex;


    // 创建构造,初始化数组
    public MyArrayList() {
        objects = new Object[10];
    }

    public Object get(int index) {
        /*
         * @author MC
         * @description //TODO 查询根据索引在数组中对应的对象
         * @createTime  2022-07-04 13:57
         * @param get
         * @return java.lang.Object
         **/

        if (!outIndexOf(index)) {
            // 查询前先判断一下要查询的索引和当前元素的总长度
            return objects[index];
        } else {
            return null;
        }
    }

    public Object set(int index, Object newObject) {
        /*
         * @author MC
         * @description //TODO 根据索引更新集合中的元素
         * @createTime  2022-07-04 14:02
         * @param set
         * @return Object
         **/

        Object oldObject = new Object();
        if (!outIndexOf(index)) {
            // 根据索引,将新的object对象重新赋值给旧的地址上
            oldObject = objects[index];
            objects[index] = newObject;
        }
        return oldObject;


    }

    public boolean outIndexOf(int index) {
        /*
         * @author MC
         * @description //TODO 判断索引是否越界
         * @createTime  2022-07-04 14:03
         * @param outIndexOf
         * @return boolean
         **/

        boolean result = true;
        if (index <= arrayindex) {
            result = false;
        }
        return result;

    }

    public void add(Object object) {
        /*
         * @author MC
         * @description //TODO 添加元素
         * @createTime  2022-07-04 14:38
         * @param add
         * @return void
         **/

        // arrayIndex == 当前数组的长度
        if (arrayindex == objects.length) {
            // 数组中已经放不下新元素了,就需要对数组扩容
            grow1();
            objects[arrayindex++] = object;
        }

    }

    public void add(int index, Object object) {
        /*
         * @author MC
         * @description //TODO 添加
         * @createTime  2022-07-04 14:49
         * @param add
         * @return void
         **/

        // arrayIndex == 当前数组的长度
        if (arrayindex == objects.length) {
            // 数组中已经放不下新元素了,就需要对数组扩容
            grow2();
            objects[arrayindex++] = object;
        }


    }

    private void grow1() {
        /*
         * @author MC
         * @description //TODO 扩容1
         * @createTime  2022-07-04 14:45
         * @param grow
         * @return void
         **/

        // 扩容位原容积的1.5倍
        arrayindex = arrayindex + (arrayindex >> 1);
        // 接下来就是要把旧数组copy到扩容后的新数组

        Arrays.copyOf(objects, arrayindex);

    }

    private void grow2() {
        /*
         * @author MC
         * @description //TODO 扩容2
         * @createTime  2022-07-04 14:45
         * @param grow
         * @return void
         **/

        // 扩容位原容积的1.5倍
        arrayindex = arrayindex + (arrayindex >> 1);
        Object[] newObject = new Object[arrayindex];
        // 接下来就是要把旧数组copy到扩容后的新数组
        System.arraycopy(objects, 0, newObject, 0, arrayindex);
        // 把cope的数组重新赋值给旧数组就可以
        objects = newObject;

    }

}