

public class Array2DWhileSwitch {
    public static void main(String[] args){
        int[][] arr = new int[100][30];
        System.out.println("Generated array ");
        for(int n=0;n<arr.length;n++){
            for(int k=0;k<arr[n].length;k++){
            arr[n][k] = (int)(Math.random()*50);
                System.out.print(arr[n][k] + " ");
            }
            System.out.println();
        }
        System.out.println("********************************************************************************");
        System.out.println("Array after adding 1 on each element");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] =arr[i][j]+1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("********************************************************************************");
        System.out.println("Even numbers of the array");
        int a=0;
        while(a<arr.length ){
            int b=0;
            while(b<arr[b].length) {
                switch(arr[a][b] % 2)
                {
                    case 0:
                        System.out.print(arr[a][b] + " ");
                }
                b++;
            }
            System.out.println();
            a++;
        }
        System.out.println("********************************************************************************");
        System.out.println("Number that are multiples of 11 in the array");
        int x=0;
        while(x<arr.length){
            int y=0;
            while(y<arr[y].length) {
                switch(arr[x][y]%11){
                case 0:
                    System.out.print(arr[x][y] + " ");
                }
                y++;
            }
            System.out.println();
            x++;
        }
            }
        }


