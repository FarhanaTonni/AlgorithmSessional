
public class Prim_algorithm
{

   public static void main(String[] args)
   {

//                        0  1  2  3  4 
// ===================================================
      int conn[][] = {{0,3,0,2,0,0,0,0,4},  // 0         
                      {3,0,0,0,0,0,0,4,0},  // 1
                      {0,0,0,6,0,1,0,2,0},  // 2
                      {2,0,6,0,1,0,0,0,0},  // 3
                      {0,0,0,1,0,0,0,0,8},  // 4
                      {0,0,1,0,0,0,8,0,0},  // 5
                      {0,0,0,0,0,8,0,0,0},  // 6
                      {0,4,2,0,0,0,0,0,0},  // 7
                      {4,0,0,0,8,0,0,0,0}   // 8
                     };

      Graph G = new Graph(conn);
      G.Prim();
     

   }
}
