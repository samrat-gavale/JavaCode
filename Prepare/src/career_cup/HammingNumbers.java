package career_cup;

public class HammingNumbers
{
	     public static int[] hammSeq(int aLen) {

         int seq[] = new int[aLen];
         int i, i2, i3, i5, x, x2, x3, x5;
         
         seq[0] = 1; i = 0; x = 1;
         i2 = i3 = i5 = -1; x2 = 2; x3 = 3; x5 = 5;
         while (++i < aLen) {
             seq[i] = x = (x2 <= x3 && x2 <= x5) ? x2 : (x3 <= x5) ? x3 : x5;
             while (x2 <= x) x2 = 2 * seq[++i2];
             while (x3 <= x) x3 = 3 * seq[++i3];
             while (x5 <= x) x5 = 5 * seq[++i5];
         }
         return seq;
     }
     
     public static void main(String args[]) {
         for (int i : hammSeq(20))
             System.out.print(" " + i);
         System.out.println();
     }
}