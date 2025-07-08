
import java.util.Arrays;

public class numbers {
    public static void main(String[] args) {
        int [] nums = {5,4,17,3,1};
        int [] arr = {2,4,0,5,0,8,0};
        int [] arrs = {1,2,3,4,5,6,8};
        frequency_of_array(nums);
        max_num(nums);
        move(arr);
        missing(arrs);
        rotate(nums,2);
        calculate(nums);
        magic_number(51103);
        palindrome(121);
        int [] nums1 = {5,4,17,3,1};
        leader(nums1);

    }
    public static void frequency_of_array(int [] nums){
        int [] visited = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count = 1;
            if(visited[i]==1){
                continue;
            }
            int key = nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(key==nums[j]){
                    count+=1;
                    visited[j]=1;

                }
            }
            System.out.println("frequency of " + nums[i] + " = "+count);
        }
    }
    public static void max_num(int [] nums){
        int largest = nums[0];
        for(int i=0;i<nums.length;i++){
            if(largest<nums[i]){
                largest = nums[i];
            }
        }
        System.out.println("largest number is " + largest);
    }
    public static void move(int [] nums){
        int [] zero = new int [nums.length];
        Arrays.fill(zero,0);
        int j= 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                continue;
            
            }
            else{
                zero[j]=nums[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(zero));
    }
    public static void missing(int [] nums){
        int num =0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]!=1){
                 num = nums[i] -1;
            }
        }
        System.out.println(num);
    }
    public static void reverse (int [] nums, int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]= temp;
            start++;
            end--;

        }
    }
    public static void rotate(int [] nums, int d){
        int n = nums.length;
        reverse( nums,0, d-1);
        reverse(nums,d,n-1);
        reverse(nums, 0, n-1);

        System.out.println(Arrays.toString(nums));
    }
    public static void calculate(int [] nums){
        int sum =0; int multiply=1;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            multiply*=nums[i];
        }
        System.out.println(sum);
        System.out.println(multiply);
    }
    public static void magic_number(int n){
        int sum=0;
        while(n>0){
        int last_digit=n%10;
        n/=10;
        sum+=last_digit;
        }
        int sum2=0;
        while(sum>0){
            int last_digit2=sum%10;
            sum2+=last_digit2;
        sum/=10;
        }
        if(sum2==1){
            System.out.println("number is perfect");
        }
        else{
            System.out.println("bruuuug");
        }

    }
    public static void palindrome(int n){
        int original = n;
        
        int reverse = 0;
        while(n>0){
            int last_digit=n%10;
            reverse=reverse*10+last_digit;
            n/=10;
        }
        if(reverse==original){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("dangggggg");
        }
        
        
    }
    public static void leader(int[] nums) {
    int n = nums.length;
    int maxFromRight = nums[n - 1];
    System.out.println(maxFromRight);  // Last element is always a leader

    for (int i = n - 2; i >= 0; i--) {
        if (nums[i] > maxFromRight) {
            maxFromRight = nums[i];
            System.out.println(maxFromRight);
        }
    }
}


   
        
}
    

