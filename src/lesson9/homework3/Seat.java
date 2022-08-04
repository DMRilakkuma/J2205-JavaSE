package lesson9.homework3;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-05 18:10
 * @Description:
 */

public class Seat {
    private boolean[][] place;

    public Seat() {
        place = new boolean[10][10];
    }

    public void seatSelection(int m, int n) {
        if (place[m][n]) {
            System.out.println("对不起这里有人了");
        } else {
            place[m][n] = true;
            System.out.println("选座成功,你的座位为第"+m+"排"+n+"位");
        }
    }

}