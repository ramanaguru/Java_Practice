/*

What is an Array?

ex: int i = 1 , int j= 2 , int k = 3;

solve to this problem we use array structure
int num[] = new int[3] // 3 is the size of the array

num[0] = 1;
num[1] = 2;
num[2] = 3;


# There are 3 types of arrays

1. Single Dimensional Array (OR) 1D Array
2. Multi Dimensional Array  (OR) 2D Array
3. Jagged Array             (OR) 3D Array



*/




public class Array {
    
//Lets us understand via printing random numbers

    public static void main(String[] args) {
        
        //1D Array
        int num[] = new int[3]; // 3 is the size of the array

        for(int i = 0; i < 3; i++){
            System.out.println((int)(Math.random()*100)); //Math.Random is used to generate random numbers between 0 to 1 like 0.73 0.34, 0.12 etc
        }

        //2D Array
        int num[][] = new int[3][4]; // 3 is row and 4 is column

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
               num[i][j] = ((int)(Math.random()*100));
               System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        //3D Array
        int num[][][] = new int[3][4][5]; // 3 is row and 4 is column and 5 is depth

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < num[i].length; j++){
                for(int k = 0; k < num[i][j].length; k++){
                    num[i][j][k] = ((int)(Math.random()*100));
                    System.out.print(num[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }


}
