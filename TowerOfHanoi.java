public class TowerOfHanoi {
    public static void main(String[] args) {

        //Take input as number of plates in tower.
        int numberOfPlates = 4;
        //marking source as 1.
        int source = 1;
        //marking helper pole as 2.
        int helper = 2;
        //marking destination pole as 3.
        int destination = 3;

        solve(numberOfPlates, source, destination, helper);
    }

    private static void solve(int numberOfPlates, int source, int destination, int helper) {
        if(numberOfPlates == 1){
            System.out.println("Moving plate number " + numberOfPlates + " from pole " + source + " to " + destination);
            return;
        }
        solve(numberOfPlates-1,source,helper,destination);
        System.out.println("Moving plate number " + numberOfPlates + " from pole " + source + " to " + destination);
        solve(numberOfPlates-1,helper,destination,source);
    }
}
