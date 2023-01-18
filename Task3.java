public class Task3 {
    
    public static void main(String[] args) {
        
        int nums[] = {10,30,20,50,80,70};
        int max,min;

        max =nums[0];
        min =nums[0];

        for(int i : nums){
            if(max<i){
                    max=i;
            }
            if(min>i){
                  min=i;  
            }
        }
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
    }
}
