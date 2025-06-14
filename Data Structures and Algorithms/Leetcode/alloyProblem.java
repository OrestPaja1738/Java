public class alloyProblem {
    public static void main(String[] args) {
        int n = 3,k = 2;
        int stock[] = new int[n];
        stock[0] = 0;
        stock[1] = 0;
        stock[2] = 100;
        int cost[]  = new int[n];
        cost[0] = 1;
        cost[1] = 2;
        cost[2] = 3;

        int composition[][]  = new int[k][n];
        composition[0] = new int[]{1, 1, 1};
        composition[1] = new int[]{1, 1, 10};

        int alloyVector[] = new int[k];

        for(int i = 0;i < k;i++){
            int alloyCost = 0,cnt = 0,budget = 15;
            for(int j = 0;j < n;j++){
                int x;
                if (stock[j] < composition[i][j]) {
                    x = composition[i][j] - stock[j];
                }
                else{
                    x = 0;
                }
                alloyCost += x * cost[j];//sum of one alloy
            }
            while(alloyCost <= budget){//check how many alloys of same type can be created
                cnt++;
                budget -= alloyCost;
            }
            alloyVector[i] = cnt;
        }

        int maxAlloys = 0;
        for (int i = 0; i < k; i++) {
        if (alloyVector[i] > maxAlloys) {
        maxAlloys = alloyVector[i];
        }
        }
        System.out.println("Maximum number of alloys that can be created: " + maxAlloys);
    }
}
