
public class Graph
{
 
   private static int infinite = 9999;

   int  LinkCost[][];
   int      NNodes;


 
   Graph(int mat[][])
   {
      int i, j;

      NNodes = mat.length;
      LinkCost = new int[NNodes][NNodes];
      for ( i=0; i < NNodes; i++)
      {
         for ( j=0; j < NNodes; j++)
         {
            LinkCost[i][j] = mat[i][j];

            if ( LinkCost[i][j] == 0 )
               LinkCost[i][j] = infinite;
         }
      }

      for ( i=0; i < NNodes; i++)
      {
         for ( j=0; j < NNodes; j++)
            if ( LinkCost[i][j] < infinite )
               System.out.print( " " + LinkCost[i][j] + " " );
            else
               System.out.print(" * " );

         System.out.println();
      }
   }


   public void Prim( )
   {
      int i, j, k, x, y;

      boolean Reached[] = new boolean[NNodes];	
      Reached[0] = true;
      for ( k = 1; k < NNodes; k++ )
      {
         Reached[k] = false;
      }

      printReachSet( Reached );
   for (k = 1; k < NNodes; k++)
      {
     x = y = 0;
   for ( i = 0; i < NNodes; i++ )
            for ( j = 0; j < NNodes; j++ )
            {
                if ( Reached[i] && !Reached[j] &&
                     LinkCost[i][j] < LinkCost[x][y] )
                {
		   x = i;
		   y = j;
                }
            }

         System.out.println("Min cost edge: (" + 
				+ x + "," + 
				+ y + ")" +
				"cost = " + LinkCost[x][y]);

         Reached[y] = true;

         printReachSet( Reached );     
         System.out.println();
      }

     
   }

   void printReachSet(boolean Reached[] )
   {
      System.out.print("ReachSet = ");
      for (int i = 0; i < Reached.length; i++ )
         if ( Reached[i] )
           System.out.print( i + " ");
      System.out.println();
   }

}






