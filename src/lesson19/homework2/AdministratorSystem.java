package lesson19.homework2;

import java.util.*;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-21 16:43
 * @Description:
 */

public class AdministratorSystem {
    Map<Integer, Dishes> map = new HashMap<>();
    Map<Integer, Customer> map2 = new HashMap<>();

    private static final int DATA_PER_PAGE = 10;

    private static int maxPage = 0;

    Queue<Integer> queue = new LinkedList();


    // 添加菜品
    public void addDishes(Dishes dishes) {
        map.put(dishes.getId(), dishes);
        maxPage = map.size() / DATA_PER_PAGE + 1;

    }

    //查看菜品所有信息
    public void showALLDishes() {
        Set<Map.Entry<Integer, Dishes>> entries = map.entrySet();
        for (Map.Entry<Integer, Dishes> entry : entries) {
            System.out.println("菜品编号:" + entry.getKey() + " 菜品信息:" + entry.getValue());
        }
    }

    //查看指定类别的菜品信息
    public void showSpecifiedDishes(int typesOfDishes) {
        int count = 1;
        Set<Map.Entry<Integer, Dishes>> entries = map.entrySet();
        for (Map.Entry<Integer, Dishes> entry : entries) {
            if (entry.getValue().getTypeOfDish() == typesOfDishes) {
                System.out.println("菜品编号:" + entry.getKey() + " 菜品信息:" + entry.getValue());
            }
        }
    }

    //根据菜品id修改菜品价格
    public void modifyThePrice(int dishId, int unitPrice) {
        if (!map.containsKey(dishId)) {
            System.out.println("没有此菜品");
        } else {
            map.get(dishId).setUnitPrice(unitPrice);
        }
    }

    //删除指定id的菜品
    public void deleteDishes(int dishId) {
        if (!map.containsKey(dishId)) {
            System.out.println("没有此菜品");
        } else {
            map.remove(dishId);
        }


    }


    // 添加客户


}