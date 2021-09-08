import java.util.Random;
public class Sortering{

    public static int[] numbersArray = new int[1000];

    public static void main(String[] args){
        numbersArray = randomArray(numbersArray);
        System.out.println("\n");
        System.out.println("Before sorting: ");
        printArray(numbersArray);
        System.out.println("\n");
        
        sortArray(numbersArray);
        System.out.println("After sorting: ");
        printArray(numbersArray);
    }

    public static void sortArray(int[] arrayInput){
        for(int i = 1; i<arrayInput.length; i++){
            if(arrayInput[i] < arrayInput[i-1]){
                boolean done = false;
                int checking = 1;

                while(!done){
                    try{
                        if(arrayInput[i] >= arrayInput[i-checking]){
                            int tempNumber = arrayInput[i];
                            int[] tempArray = new int[checking-1];

                            for(int b = 0; b<tempArray.length;b++){
                                tempArray[b] = arrayInput[i-checking+1+b];
                            }

                            for(int b = 0; b<tempArray.length; b++){
                                arrayInput[i-checking+1+b+1] = tempArray[b];
                            }
                            arrayInput[i-checking+1] = tempNumber; 
                            done = true;
                        }
                    }
                    catch(Exception e){
                        int tempNumber = arrayInput[i];
                        int[] tempArray = new int[checking-1];

                        for(int b = 0; b<tempArray.length;b++){
                            tempArray[b] = arrayInput[i-checking+1+b];
                        }

                        for(int b = 0; b<tempArray.length; b++){
                            arrayInput[i-checking+1+b+1] = tempArray[b];
                        }
                        arrayInput[i-checking+1] = tempNumber; 
                        done = true;
                    }
                    
                    checking++;
                }
            }
        }
    }

    
    public static int[] randomArray(int[] arrayInput){
        Random random = new Random();
        for(int i = 0; i < arrayInput.length; i++){
            arrayInput[i] = random.nextInt(1000-1);
        }
        return arrayInput;
    }

    public static void printArray(int[] arrayInput){
        for(int i = 0; i < arrayInput.length; i++){
            System.out.print("[" + arrayInput[i] + "] ");
        }
    }

}