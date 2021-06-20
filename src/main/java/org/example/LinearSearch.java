package org.example;

public class LinearSearch {


    public static int linearS(int[] data, int target){
        int position = -1;
        boolean found = false;
        int n = data.length;

        for(int i = 0; i< n && !found;i++){
            if(data[i]== target){
                found = true;
                position = i;

            }
        }
        return position;
    }

    public static int binaryS(int[] data,int target){

        int position = -1;
        int left = 0;
        int right= data.length-1;
        boolean found = false;

        while(!found){
            int middle = (left + right) / 2;
            if(data[middle] == target){
                found = true;
                position = middle;
            }
            else if(data[middle] < target){
                left = middle + 1;
            }else if (target < data[middle]){
                right = middle -1;
            }
        }

        return position;
    }

// Recursive linear search
    public static int linearS(int [] data, int left, int right, int target){
        if (left < right){
            if (data[left] == target){
                return left;
            }else{
                return linearS(data, left + 1, right, target);
            }
        }else if (left == right){
            if (data[left] == target){
                return left;
            }else{
                return -1;
            }
        }
        return -1;
    }

    public static int linearSearchR (int [] data, int target){
        return linearS(data, 0, data.length-1, target);
    }

//    recursive binary search
    public static int binarySearchR(int[] data, int target){
        return binaryS(data,0, data.length-1, target);
    }

    public static int binaryS(int[] data, int left, int right, int target){
        if(left <= right){
            int middle = (left + right)/ 2;
            if(data[middle] == target){
                return  middle;
            }
            else if(data[middle] < target){
                return binaryS(data, middle + 1, right, target);
            }
            else if(target < data[middle]){
                return binaryS(data, left, middle -1, target);
            }
        }
        else {
            return -1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] data={0,1,2,3,4,5,6,7,8,9};
        //System.out.println(linearS(data,7));
        System.out.println(binaryS(data,7));
    }









}
