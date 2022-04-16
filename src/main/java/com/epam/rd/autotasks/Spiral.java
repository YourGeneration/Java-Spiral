package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        
        int[][] array = new int[rows][columns];
        int elementOfArray = 1;

        //our index
        int top = 0;
        int right = columns-1;
        int left = 0;
        int bottom = rows-1;

        while(true){
            //top row
            for(int i =left; i<=right;i++){
                array[top][i]= elementOfArray;
                elementOfArray++;    
            }
            top++;
            if(elementOfArray>rows*columns) break;
    
            //right column
            for(int i =top;i<=bottom;++i){
                array[i][right]= elementOfArray;
                elementOfArray++;
            }
            right--;
            if(elementOfArray>rows*columns) break;

            //bottom row
            for(int i=right;i>=left;--i){
                array[bottom][i]=elementOfArray;
                elementOfArray++;
            }
            bottom--;
            if(elementOfArray>rows*columns) break;

            //left column
            for(int i=bottom;i>=top;--i){
                array[i][left]= elementOfArray;
                elementOfArray++;
            }
            left++;
            if(elementOfArray>rows*columns) break;

        }
        

    return array;
    }
}
