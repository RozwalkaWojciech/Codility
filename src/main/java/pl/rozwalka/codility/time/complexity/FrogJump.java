package pl.rozwalka.codility.time.complexity;

public class FrogJump {
    public static void main(String[] args) {

        int x = 10;
        int y = 85;
        int d = 30;

        int jump = 0;

        System.out.println((y-x)/d);

        jump = (y-x)/d;
        if ((y-x)%d != 0) {
            jump++;
        }
        System.out.println(jump);
    }
    public int solution(int X, int Y, int D) {

        int jump = 0;

        if(Y-X == 0) {
            return jump;
        }

        jump = (Y-X)/D;

        if((Y-X)%D != 0) {
            jump++;
        }

        return jump;
    }
}
