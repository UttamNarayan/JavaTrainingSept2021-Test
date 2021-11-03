import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class input {
    public static void main(String args[]){

        ArrayList<Integer> numberArray = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("No element you want to enter");

        int sizeofArray = sc.nextInt();

        System.out.println("Enter the elements");

        //Taking the input from the users
        for(int i=1; i<=sizeofArray; i++){

        numberArray.add(sc.nextInt());
        }     

        System.out.println("entries of the Array");
        System.out.println(numberArray);

// TODO: Filteration

        List<Integer> oddNumberArray = numberArray.stream().filter(num -> num%2==1).collect(Collectors.toList());

        System.out.println("Odd Numbers are:");
        System.out.println(oddNumberArray);

 // TODO:Map
        
        List<Integer> NumberCube = numberArray.stream().map(num -> num*num*num).collect(Collectors.toList());

        System.out.println("Cube is:");
        System.out.println(NumberCube);

    }
    
}