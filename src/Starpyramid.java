public class Starpyramid {

    public static void main(String[] Args){
        int nums[][]=new int[4][];

        nums[0]= new int[1];
        nums[1]= new int[2];
        nums[2]= new int[3];
        nums[3]= new int[4];

        for (int i=0;i< nums.length;i++){
            for (int j=0; j<nums[i].length;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
