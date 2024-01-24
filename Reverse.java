import java.util.Scanner; 
public class Reverse {
    public static void main(String[]args){
        String word; 
        int num = 1;
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter a String:");
        word = input.nextLine();     
        int length = word.length();
        char reverse [] = new char[length];  
       for (int i = 0; i < length; i++){      
        reverse[i] = word.charAt((length - num)); 
        num++;
        
    }

    for (int j = 0; j < reverse.length; j++){
        System.out.print(reverse[j]); 
    } 
     
}

}