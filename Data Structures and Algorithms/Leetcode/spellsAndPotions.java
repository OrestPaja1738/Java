public class spellsAndPotions {
    public static void main(String[] args) {
        int[] spells = {3,1,2};
        int[] potions = {8,5,8};
        int success = 16;
        int[] pairs = new int[spells.length];

        for(int i = 0;i < spells.length;i++){
            int left = 0,cnt = 0,right = potions.length - 1;
            while (left <= right) { 
                if (potions[left] >= potions[right]) {
                    int strength = spells[i] * potions[left];
                    if (strength >= success) {
                        cnt += 1;
                    }
                    left += 1;
                }
                else{
                    int strength = spells[i] * potions[right];
                    if (strength >= success) {
                        cnt += 1;
                    }
                    right -= 1;
                }
                
            }
            pairs[i] = cnt;
        }

        for (int i : pairs) {
            System.out.println(i);
        }
    }
}
