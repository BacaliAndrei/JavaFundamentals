package ro.sdacademy2.fundamentals2.array;
/*
  Write a Java program to find the average score of two students in three papers.
  Given, score of first student is 60, 55 and 70 while score of the second student is 80, 60 and 41.

  We can store the score of the two students in a 2D array having 2 rows and 3 columns.
  The rows will represent the student and the columns will hold the score of the students.

   */


public class Array2 {
    public static void main(String[] args) {
        int[][] score = {
                {65, 55, 75},
                {80, 60, 41}
        };

        float[] arrayAverage=new float[2];
        int[] sum=new int[2];

        for (int i=0;   i <score.length;i++){
            for (int j=0; j<score[i].length;j++){
                sum[i]+=score[i][j];
            }
        }
        arrayAverage[0]=(float)sum[0]/3;
        arrayAverage[1]=(float)sum[1]/3;


        System.out.println("Average score of first student");
    }
}
