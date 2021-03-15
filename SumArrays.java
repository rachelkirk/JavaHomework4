
public class SumArrays
{

    public static void main(String[] args)
    { 
        int [] dummyArray = {1,3,5,7,9};
            
            int sum = 0;
            for (int i = 0; i < dummyArray.length; i++)
            {
                sum += dummyArray[i]; 
            }
            System.out.println(sum);
      
        
        
        
        
        
        double[ ] exampleArray = {1,5,6,5,4,1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i<exampleArray.length; i++){

             if (exampleArray[ i ] > maximum) {

                  maximum = exampleArray[ i ];

                  index = i;}

        }
        System.out.println(index);
    }

}
