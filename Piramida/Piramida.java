package piramida;
import java.util.Scanner;

public class Piramida {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // engizu operatorun kosu
        System.out.print("n = ");
        int n = s.nextInt(); // katar sanyn engizu
        // zhane ar katardagy simbol sany
        System.out.println("");
        
        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= (n - i)/2; k++){
                System.out.print("  "); //bos orundardy korsetu zhylzhytu arkyly
            
            }
            
            if(i%2==0 && n%2==1){           // zhup katarmen zhumys zhasaidy
                    System.out.print(" ");  // tak sannyn zhup katarlaryna " " probel kaldyrady
                }
            if(i%2==1 && n%2==0){
                    System.out.print(" ");  // zhup sannyn tak katarlaryna " " probel kaldyrady
                }
            
            for(int j = 1; j <= i; j++){
                if(j == 1 || j == i || i == n ){ //ushburysh shekarasyna + tanbasyn koiady
                    System.out.print("+ ");    
                }
                else{
                    if(j == 2 || j == i - 1 || j == n - 1){ //shekaranyn ishki kabatyna - tanbasyn koiady
                        System.out.print("- ");
                    }
                    else{
                        if((j+1)%2==0){
                        System.out.print("$ ");
                    }
                    else{
                             System.out.print("* "); //barlyk shartta zhok ushburysh oryndaryn * belgisimen toltyrady
                    }
               
                    }
                }
            }   System.out.println(""); //kelesi katarga otu
        }
        
    }
    
}
