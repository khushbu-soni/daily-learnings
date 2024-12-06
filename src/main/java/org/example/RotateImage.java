package org.example;

import java.util.Arrays;

public class RotateImage {

    public static void main(String[] args) {
        int[][] image={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

//        int[][] image={
//                {1, 2},
//                {3, 4}
//        };

        int[][] ints = rotateImageNew(image);
        System.out.println(Arrays.deepToString(ints));

    }

    public static int[][] rotateImageNew(int[][] image){
        int[][] newImage=new int[image.length][image.length];

        for(int i =0;i<image.length;i++){
            for(int j=0;j<image.length;j++){
                newImage[j][image.length - i - 1]=image[i][j];
            }

        }
        return newImage;
    }

    public static int[][] rotateImageInPlace(int[][] image){


        for(int i =0;i<image.length;i++){
            for(int j=i;j<image.length;j++){

                int temp=image[i][j];
                image[i][j]=image[j][i];
                image[j][i]=temp;
            }
        }

//        reverse the matrix;

        for(int i=0;i<image.length;i++){
            int left=0;
            int right=image.length-1;
            while(left<right){

                int temp=image[i][left];
                image[i][left]=image[i][right];
                image[i][right]=temp;
                left++;
                right--;
            }

        }
        return image;
    }
}
