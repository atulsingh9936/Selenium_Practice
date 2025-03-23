package Core_Java.Arrays;

public class maximum_numberin_minimumnumber_row {
    public static void main(String[] args) {

        int abc [][]={{2,4,5},{3,0,7},{1,2,9}};

        int min =abc[0][0];
        int min_column =0;



        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(abc[i][j]<min){
                    min = abc[i][j];
                    min_column=j;
                }

            }
        }
        int max= abc[0][min_column];
        int k=0;
        while(k<3){
            if(abc[k][min_column]>max){
                max= abc[k][min_column];
            }
            k++;
        }
        System.out.println(max);


    }
}
