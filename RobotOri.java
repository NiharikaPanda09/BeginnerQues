import java.util.*;
public class RobotOri {
    public static void main(String[] args) {
        String moves = "LR";
        boolean res = judgeCircle(moves);
        System.out.println(res);


    }
    public static boolean judgeCircle(String moves) {
     int x=0;
     int y=0;

     for(char move: moves.toCharArray()){
         switch (move){
             case 'U':
                 y++;
                 break;
             case 'D':
                 y--;
                 break;
             case 'L':
                 x--;
                 break;
             case 'R':
                 x++;
                 break;
             default:
                 return false;
         }

     }
     return x==0 && y==0;

    }
}
