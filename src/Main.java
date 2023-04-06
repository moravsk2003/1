import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String n1,n2,n3,n4,n5,s1,s2,s3,s4,s5;


        Scanner sc = new Scanner(System.in);
        n1 = sc.nextLine();
        n5 = sc.nextLine();
        n2 = sc.nextLine();
        n3 = sc.nextLine();
        n4 = sc.nextLine();
        System.out.println(n1.concat(n2).concat(n3).concat(n3).concat(n5));
        System.out.println(" 2 ");
        s1=sc.nextLine();
        s2=sc.nextLine();
        s3=sc.nextLine();
        s4=sc.nextLine();
        s5=sc.nextLine();
        String s= s1.substring(0,1)+s2.substring(0,1)+s3.substring(0,1)+s4.substring(0,1)+s5.substring(0,1);
        System.out.print(s);


        System.out.print("3 завдання Введіть дробове число: ");
        double nn1,nn2,nn3;
        if(sc.hasNextDouble()) {
            nn1 = sc.nextDouble();
            nn2 =sc.nextDouble();
            nn3=sc.nextDouble();
            if(nn1>nn2&&nn1>nn3){
                System.out.println(nn1);
            } else if (nn2>nn1&&nn2>nn3){
                System.out.println(nn2);
            }else {
                System.out.println(nn3);
            }


        } else {
            System.out.println("Ви ввели не дробове число");
        }
        System.out.println("-- 4 --");
        s1= sc.next();
        s2= sc.next();
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("ведені слово однакові");


        }else{
            System.out.println("ведені слово не однакові");
        }
        System.out.println("--5--");
        s3= sc.nextLine();
        s4= sc.nextLine();
        if(s3.length()==s4.length()){
            System.out.println("ведені слова однакові за довжинною");


        }else{
            System.out.println("ведені слово не однакові за довжинною");
        }
    }
}


