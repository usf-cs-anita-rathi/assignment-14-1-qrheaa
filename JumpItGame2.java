public class JumpItGame2
{
     // Calculate cost of game
    public static int lowestCost(int []board,int current,int total)
    {
        total+=board[current];

        // If board is at the last position, stop recursion and end the method
        if(current == board.length -1)
            return total;
   
        else if(current == board.length -2)
            return lowestCost(board,current+1,total);

        else
        {
            int path1 = lowestCost(board,current+1,total);
            int path2 = lowestCost(board,current+2,total);

            // Use math library to return minimum of the paths
            return Math.min(path1,path2);
        }

    }

    public static void main(String[] args)
    {
	// Variable for board game
        int[] board = {0,3,80,6,59,10};
        int cost = 0;

        cost = lowestCost(board,0,cost);

        // For smaller board
        for(int i=0;i < board.length;i++)
            System.out.print(board[i]+" ");

            System.out.println();
            System.out.println("Least steps: " + cost);


        // For larger board
        int board2[] = {0,5,17,29,91,61,53,100,2};
        int cost2 = 0;
        cost2 = lowestCost(board2,0,cost2);

        for(int i=0;i < board2.length;i++)
            System.out.print(board2[i]+" ");

            System.out.println();
            System.out.println("Least steps: " + cost2);


    }
}