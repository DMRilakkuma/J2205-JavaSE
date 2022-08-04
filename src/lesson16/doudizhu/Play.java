package lesson16.doudizhu;

import java.util.List;

/**
 * @program: day1
 * @description:
 * @author: DY
 * @create: 2022-07-15 16:57
 **/

public class Play {
    public static void main(String[] args) {
        Game game = new Game();
        List<Poke> list = game.getAllPoke();
        for (Poke p : list
        ) {
            System.out.println(p.toString());
        }
        game.fapai();
    }
}
