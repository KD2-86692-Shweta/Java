import java.util.Scanner;

public class Assign2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int sum=0;
		int choice;
		do {
			System.out.println("Select Choice from Below");
			System.out.println("1. Idli");
			System.out.println("2. Dosa");
			System.out.println("3. Pohe");
			System.out.println("4. Upma");
			System.out.println("5. Suji");
			System.out.println("6. Tea");
			System.out.println("7. Coffee");
			System.out.println("8. Vada Pav");
			System.out.println("9. Generate bill");
			System.out.println("0. Exit");
			System.out.println("Enter choice");
			choice=sc.nextInt();
			System.out.println("--------------------------------");
		   switch(choice){
			   case 1:
				System.out.println("Enter quantity : ");
				int quantity=sc.nextInt();

			    sum=sum+(quantity*40);
				   
				   break;
			   case 2:
				   System.out.println("Enter quantity : ");
					int quantit=sc.nextInt();

				   sum=sum+(quantit*60);
				   
				   break;
			   case 3:
				   System.out.println("Enter quantity : ");
					int quanti=sc.nextInt();

				   sum=sum+(quanti*20);
				   break;
			   case 4:
				   System.out.println("Enter quantity : ");
					int quant=sc.nextInt();

				   sum=sum+(quant*20);
				   break;
			   case 5:
				   System.out.println("Enter quantity : ");
					int qua=sc.nextInt();

				   sum=sum+(qua*20);
				   break;
			   case 6:
				   System.out.println("Enter quantity : ");
					int qu=sc.nextInt();

				   sum=sum+(qu*10);
				   break;
			   case 7:
				   System.out.println("Enter quantity : ");
					int q=sc.nextInt();

				   sum=sum+(q*20);
				   break;
			   case 8:
				   System.out.println("Enter quantity : ");
					int quantitys=sc.nextInt();

				   sum=sum+(quantitys*15);
				   break;
			   case 9:
				   System.out.println("--------------------------------");			   
				   System.out.println("Your Bill is : "+sum);
				   System.out.println(" :) Visit Again....!");
				   System.out.println("--------------------------------");
				   break;
			   case 0:
				   System.exit(0);
				   break;
			   default :
				   System.out.println("Enter valid choice ");
			   
		   }
	
		}while(choice !=0);
		 
	}
}

			   
			
	
