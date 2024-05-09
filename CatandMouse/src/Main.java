import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       System.out.println("Cat and Mouse Algorithm");
       System.out.println("enter positions of catA, catB and MouseC respectively:");

        Scanner catA = new Scanner(System.in);
        int posCatA = catA.nextInt();
        int poscata = Math.abs(posCatA);

        Scanner catB = new Scanner(System.in);
        int posCatB = catB.nextInt();
        int poscatb = Math.abs(posCatB);

        Scanner mouseC = new Scanner(System.in);
        int posMouseC = mouseC.nextInt();
        int posmousec = Math.abs(posMouseC);

        position positions = new position(poscata,poscatb,posmousec);
        System.out.println(positions.CatA+" "+positions.CatB+" "+positions.MouseC);

        int distA = positions.MouseC- positions.CatA;
        int distA1 = Math.abs(distA);

        int distB = positions.MouseC- positions.CatB;
        int distB1 = Math.abs(distB);

        if(distA1==distB1){
            System.out.println("Mouse wins!");
        } else if (distA1<distB1) {
            System.out.println("CatA wins!");
        } else if (distA1>distB1) {
            System.out.println("CatB wins!");
        }
    }
}