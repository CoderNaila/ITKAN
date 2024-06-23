import java.util.Scanner;

class NILA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter grades (out of 100):");
        System.out.print("Subject 1:");
        int subject1 = scanner.nextInt();
        System.out.print("Subject 2:");
        int subject2 = scanner.nextInt();
        System.out.print("Subject 3:");
        int subject3 = scanner.nextInt();
        int avg = (subject1+subject2+subject3)/3;
        System.out.println(avg);
        
        if (avg >= 90){
            System.out.println("A");
        }
        else if  (avg >= 80) {
                System.out.println("B");
        }
        else if (avg >= 70) {
                System.out.println("C");
        }
        else if (avg >= 60){
                System.out.println("D");
            }
            else if (avg >= 50){
                    System.out.println("F");
                }
            }
        }
	
