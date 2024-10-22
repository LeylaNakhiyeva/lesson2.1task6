import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Ədədi daxil edin: ");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.print("Tələbənin topladığı bala uyğun hərfi göstəricisi: ");
        if(a>=0 && a<51){
            System.out.println("F");
        } else if (a>=51 && a<61) {
            System.out.println("E");

        } else if (a>=61 && a<71) {
            System.out.println("D");

        } else if (a>=71 && a<81) {
            System.out.println("C");

        } else if (a>=81 && a<91) {
            System.out.println("B");

        }
        else if(a>=91 && a<=100){
            System.out.println("A");
        }
        else{
            System.err.println("Daxil edilən məlumat ballar sisteminə uygun deyil!");
        }
    }
}