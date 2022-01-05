public class SortingDescending{
public static void main(String[] args){

int arrNum[] = {14, 6, 5, 34, 35, 29, 6, 11, 34, 33, 1, 37, 37, 32, 7, 11, 35, 17, 9, 22, 14, 32, 12, 26, 27, 33, 8, 7, 13, 17, 38, 10, 38, 15, 11, 11, 35, 18, 21, 18, 26, 28, 32, 11, 3, 20, 30, 40, 24, 2};

System.out.println(" Original declared array: ");
for(int i=0;i<arrNum.length;i++){
  System.out.print(arrNum[i]+",");
}
System.out.println();
System.out.println(" Array after adding 20th and 21st elememts");

arrNum[21]=arrNum[21]+21;
arrNum[20]=arrNum[20]+60;

for(int j=0;j<arrNum.length;j++){
  
    System.out.print(arrNum[j]+",");
    }
  System.out.println();
  System.out.println(" Array in descending order");  
for(int k=0;k<arrNum.length;k++){
    for(int m=k+1;m<arrNum.length;m++){
    
      int temp =0;
      if(arrNum[k]<arrNum[m]){
        temp = arrNum[k];
        arrNum[k] = arrNum[m];
        arrNum[m] = temp;
        
      }
    }
 
  System.out.print(arrNum[k]+",");
}





}
}
