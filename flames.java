import java.util.*;
public class flames {
    public static void main(String[] args) {
        System.out.println("GAME OF FLAMES");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of first person: ");
        String name1=sc.nextLine();
        name1=name1.toLowerCase();
        System.out.println("Enter name of second person: ");
        String name2=sc.nextLine();
        name2=name2.toLowerCase();
        String common="";
        for(int i=0;i<name1.length();i++){
            for(int j=0;j<name2.length();j++){
                if(name1.charAt(i)==name2.charAt(j)){
                    common+=name1.charAt(i);
                }
            }
        }
        for(int i = 0; i < common.length(); i ++) {
            String charToRemove = common.charAt(i)+"";
            name1 = name1.replace(charToRemove, "");
            name2 = name2.replace(charToRemove, "");
        }
        String concat=name1+name2;
        int number=0;
        if(concat.length()<10){
            number=concat.length()-5;
        }else{
            number=concat.length()%5;
        }
        System.out.println("Your relationship ends as:");
        switch (number)
        {
            case 1:
                System.out.println("Friends");
                break;
            case 2:
                System.out.println("Lovers");
                break;
            case 3:
                System.out.println("Affection");
                break;
            case 4:
                System.out.println("Marriage");
                break;
            case 5:
                System.out.println("Enemies");
                break;
            default:
                System.out.println("No chance");
        }
    }
}
