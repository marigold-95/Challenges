

public class Array3 {
    public static void main(String[] args){
        int[] arr = new int[50];
        System.out.println("Generated array ");
        for(int n=0;n<arr.length;n++){
            arr[n] = (int)(Math.random()*50);
            System.out.print(arr[n]+",");
        }
        System.out.println();
        System.out.println("Even numbers :");
        int i=0;
        while(i<arr.length){
            switch (arr[i]%2) {
                case 0:
                System.out.print(arr[i] + ", ");
            }
            i++;
        }
        System.out.println();
        System.out.println("Multiples of 11 :");
        int j=0;
        while( j<arr.length){
            switch(arr[j]%11 ) {
                case 0:
                System.out.print(arr[j] + ", ");
            }
            j++;
        }
    }

}

