package array.medium;

import java.util.*;

public class FourSum {

    public static void main(String[] args) {

        int[] nums={1,0,-1,0,-2,2};
        int target=0;
        List<List<Integer>> lists = FourSumOpt2(nums, target);
       lists.stream().forEach(innerList -> System.out.println(innerList));
    }

    public static List<List<Integer>> FourSum(int [] nums,int target){

        HashSet<List<Integer>> set=new HashSet<>();
        int n=nums.length;
        for (int i = 0; i <n; i++) {
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++) {
                        long sum = (long)nums[i] + nums[j];
                        sum += nums[k];
                        sum += nums[l];
                        if(sum==target){
                            List<Integer> temp= Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                            Collections.sort(temp);
                            set.add(temp);
                        }

                    }
                    }
            }
        }


        return new ArrayList<>(set);
    }

//    this one is more optimized

    public static List<List<Integer>> FourSumOpt1(int [] nums,int target){

        HashSet<List<Integer>> set=new HashSet<>();
        int n=nums.length;
        for (int i = 0; i <n; i++) {
            for(int j=i+1;j<n;j++){
                HashSet<Long> hashSet= new HashSet<>();
                for(int k=j+1;k<n;k++){

                        long sum = (long)nums[i] + nums[j];
                        sum += nums[k];
                        long l=target-sum;
                        if(hashSet.contains(l)){
                            List<Integer> temp= Arrays.asList(nums[i],nums[j],nums[k],(int)l);
                            Collections.sort(temp);
                            set.add(temp);
                        }
                        hashSet.add((long) nums[k]);
                    }
                }
            }



        return new ArrayList<>(set);
    }

    public static List<List<Integer>> FourSumOpt2(int [] nums,int target){

        List<List<Integer>> listOfList= new ArrayList<>();

        int size=nums.length;
        Arrays.sort(nums);
        if(size<4) return listOfList;
        HashSet<Integer> hashSet= new HashSet<>();

        for (int i = 0; i <size ; i++) {
            if(i>0 && nums[i]==nums[i-1]) continue;

            for (int j = i+1; j <size ; j++) {
                if(j>0 && nums[j]==nums[j-1]) continue;

                for (int k = j+1; k <size ; k++) {
                    if(k>0 && nums[k]==nums[k-1]) continue;
                    int sum=nums[i]+nums[j]+nums[k];
                    int remaingNumber=target-sum;

                    if(hashSet.contains(remaingNumber)){

                        List<Integer> list=new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(remaingNumber);

                         listOfList.add(list);
                    }else{
                        hashSet.add(remaingNumber);
                    }
                }


            }


        }

        return listOfList;

    }
}
