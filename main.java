//this class contains all the data

package alvaro_cpet_project;

import java.util.Scanner;
import java.util.Date;
import java.util.Random;
import java.text.SimpleDateFormat;

public class main {
	
	
	public static void main(String[] args) {
		call();
		}
		
	static void call()
	{
		int counter = 1, i,j, pick,run=1;
		
		Scanner in = new Scanner(System.in);
	
		System.out.println("YOU ARE NOW IN main class!!\n\n");
			
		for(i=0;i<12;i++) System.out.println();
		
		
		System.out.print("Click Enter to continue....");
		
		
		in.nextLine();
		
		for(i=0;i<24;i++) System.out.println();
		
		System.out.println("YOU HAVE THE PERMISSION TO ACCESS CERTAIN PROGRAMS EMBEDED WITHIN A CERTAIN NAMED FUNCTION\n\nYOU WILL CHOOSE THE NUMBER YOU WANT TO ACCESS\n\n");
		
		for(i=0;i<10;i++) System.out.println();
		
		System.out.print("Click Enter to continue....");
		
		in.nextLine();
		
		System.out.println("LET'S GET STARTED!!!");
		
		for(i=0;i<14;i++) System.out.println();
		
		System.out.print("Click Enter to continue....");
		
		in.nextLine();
		
		for(i=0;i<11;i++) System.out.println();
		
		
		while(run==1)
		{
			
			
			if(counter==1) System.out.println("This is your " + counter + "st attempt.\n");
			else if(counter==2) System.out.println("This is your " + counter + "nd attempt.\n");
			else if(counter==3) System.out.println("This is your " + counter + "rd attempt.\n");
			else System.out.println("This is your " + counter + "th attempt.\n");
			
			for(i=0;i<12;i++) System.out.println();
			
			System.out.println("Choose from the following (1,2,3,4,5,6,7,8,9,10,11):");
			pick = in.nextInt();
			
			if(pick==1)
			{
				one();
			}
			
			else if(pick==2)
			{
				two();
			}
			
			else if(pick==3)
			{
				three();
			}
						
			else if(pick==4)
			{
				four();
			}
			else if(pick==5)
			{
				five();
			}
			

			else if(pick==6)
			{
				six();
			}
			
			else if(pick==7)
			{
				seven();
			}
						
			else if(pick==8)
			{
				eight();
			}

			else if(pick==9)
			{
				nine();
			}
			
			else if(pick==10)
			{
				ten();
			}
			else if(pick==11)
			{
				System.out.println("EXIT");
				run=0;
			}
			
			else System.out.println("You should enter (1-11) only, try again");
			{
				for(i=0;i<12;i++) System.out.println();
				System.out.println("Click Enter to continue...");
				
				in.nextLine();in.nextLine();
				
			}			
			counter +=1;			
		}
	}
	
	/*this function one will receive two numbers from the user and add them together, 
	 note that this will only run within first package because it is default*/
	static void one()
	{
		Scanner in = new Scanner(System.in);
		
		float num1,num2,ans;
		int run=1, pick, again;
		char oper;
		
		
		while(run==1)
		{
			System.out.println("Enter the first number: ");
			num1 = in.nextInt();
			
			System.out.println("Enter the operator you want to use (+,=,*,/): ");
			oper = in.next().charAt(0);
			
			System.out.println("Enter the second number: ");
			num2 = in.nextInt();
			
			if(oper == '+') {ans = num1+num2;System.out.println("Answer: " + ans);}
			else if(oper == '-') {ans = num1-num2;System.out.println("Answer: " + ans);}
			else if(oper == '*') {ans = num1*num2;System.out.println("Answer: " + ans);}
			else if(oper == '/') {ans = num1/num2;System.out.println("Answer: " + ans);}
			else System.out.println("Operator invalid, try again");
			
			
			System.out.println("Do you want to try again?: 1 for yes, 0 for no");
			
			again = in.nextInt();
			
			if(again==0)
			{
				System.out.println("EXIT");
				run=0;
			}
			
			else if(again==1)
			{
				run=1;
			}
			
			else
			{
				System.out.println("Invalid input, SYSTEM DOWN");
				run=0;
			}
			
		}		
	
	}
	
	
	static void two()
	{
		Scanner in = new Scanner(System.in);
		
		int  i,j,run =1, letter,again;
		
		
		while(run==1)
		{
			System.out.print("What letter do you want to display??\nInput: \n\n1 for A\n2 for B\n3 for C\n4 to display ABC: \n");
			letter = in.nextInt();
			
			//LOOP FOR LETTER A
			if(letter == 1)
			{
			    for (i=0;i<11;i++)
			    {
			        for(j=0;j<25;j++)
			        {
			            if(j==11-i || j==11+i ||(i==5 && (j>6 && j<17)))
			            {
			                 System.out.print("*");
			            }
			            else  System.out.print(" ");


			        }
			        System.out.println();
			    }
			    System.out.println();
			    
			    

			}
			
			//LOOP FOR LETTER B
			else if (letter==2)
			{
			    for (i=0;i<13;i++)
			    {
			        for(j=0;j<25;j++)
			        {
			            if(j==1|| (i==0&& (j<18 && j>0)) || (j==18+i && i<2 ) || (j==20&&(i>1&&i<5) ||
			                        (i==6 && (j>0 && j<19)||(i==5&&j==19) ||i==12&&(j>0 && j<19) || i==7&&j==19 || i==11 && j==19 ||
			                         j==20 && (i>7 && i<11) )))
			            {
			            	 System.out.print("*");
			            }
			            else  System.out.print(" ");
			        }
			        System.out.println();
			    }
			
			    System.out.println();
			}
			
			//LOOP FOR LETTER C
			else if(letter==3)
			{
			    for (i=0;i<13;i++)
			    {
			        for(j=0;j<25;j++)
			        {
			            if(i==0 && (j>2 && j<21)||j==1&&(i>1&&i<11) || j==2 && i==1 || j==2 && i==11 || (j>2&& j<21)&&i==12)
			            {
			            	System.out.print("*");
			            }
			            else System.out.print(" ");
			
			
			        }
			        System.out.println();
			    }
			    System.out.println();
			}
			
			//LOOP FOR LETTER A,B,C
			else if(letter==4)
			{
				for (i=0;i<11;i++)
			    {
			        for(j=0;j<25;j++)
			        {
			            if(j==11-i || j==11+i ||(i==5 && (j>6 && j<17)))
			            {
			                 System.out.print("*");
			            }
			            else  System.out.print(" ");


			        }
			        System.out.println();
			    }
			    System.out.println();
			    
			    System.out.print("Click Enter to continue....");
			    
			   
			    in.nextLine(); in.nextLine();
			    
			    for(i=0;i<16;i++) System.out.println();
			   
			    
			    for (i=0;i<13;i++)
			    {
			        for(j=0;j<25;j++)
			        {
			            if(j==1|| (i==0&& (j<18 && j>0)) || (j==18+i && i<2 ) || (j==20&&(i>1&&i<5) ||
			                        (i==6 && (j>0 && j<19)||(i==5&&j==19) ||i==12&&(j>0 && j<19) || i==7&&j==19 || i==11 && j==19 ||
			                         j==20 && (i>7 && i<11) )))
			            {
			            	 System.out.print("*");
			            }
			            else  System.out.print(" ");
			        }
			        System.out.println();
			    }
			
			    System.out.println();
			    
			    
			    System.out.print("Click Enter to continue....");
			    
				   
			    in.nextLine();
			    
			    
			    for (i=0;i<13;i++)
			    {
			        for(j=0;j<25;j++)
			        {
			            if(i==0 && (j>2 && j<21)||j==1&&(i>1&&i<11) || j==2 && i==1 || j==2 && i==11 || (j>2&& j<21)&&i==12)
			            {
			            	System.out.print("*");
			            }
			            else System.out.print(" ");
			
			
			        }
			        System.out.println();
			    }
			    System.out.println();
			}
			
			else System.out.println("Invalid Input");
			
			System.out.println("Do you want to display another letter/s?, enter 1 for yes, 0 for no: ");
			
			
			//this if else handles the user's response if he/she wants to repeat using the program
			again = in.nextInt();
			
			if(again==0)
			{
				System.out.println("EXIT");
				run=0;
			}
			
			else if(again==1)
			{
				run=1;
			}
			
			else
			{
				System.out.println("Invalid input, SYSTEM DOWN");
				run=0;
			}
			
			

		}


	}
	
	static void three()
	{
		Scanner in = new Scanner(System.in);
		
		int i,j, pick, again, run=1;
	
		while(run==1)
		{
			System.out.println("Which triangle you want to display. Choose from the following: ");
			System.out.println("1 -- Right Triangle\n2 -- Left Triangle\n3 -- Inverted Right Triangle\n4 -- Inverted Left Triangle\n5 -- Isosceles Triangle ");
			pick = in.nextInt();
			
			if(pick==1)
			{
				for(i=0;i<10;i++)
				{
					for(j=0;j<i+1;j++)
					{
						System.out.print('*');
						
					}
					System.out.println();
				}
			}
			
			else if(pick==2)
			{
				for(i=0;i<10;i++)
				{
					for(j=9;j>i;j--)
					{
						System.out.print(' ');
						
					}
					
					for(j=0;j<i+1;j++)
					{
						System.out.print('*');
						
					}
					System.out.println();
					
					
				}
				
			}
			
			else if(pick==3)
			{
				for(i=0;i<10;i++)
				{
					for(j=10;j>i;j--)
					{
						System.out.print('*');
						
					}
					
					System.out.println();				
				}
				
			}
			
			else if(pick==4)
			{
				for(i=0;i<10;i++)
				{
							
					for(j=0;j<i;j++)
					{
						System.out.print(' ');
						
					}
					
					for(j=10;j>i;j--)
					{
						System.out.print('*');
						
					}
					System.out.println();
			
				}
				
			}
			
			else if(pick==5)
			{
				for(i=0;i<10;i++)
				{
							
					for(j=10;j>i;j--)
					{
						System.out.print(' ');
						
					}
					
					for(j=0;j<i+1;j++)
					{
						System.out.print(' ');
						System.out.print('*');				
					}	
					System.out.println();
			
				}
				
			}
			
			else System.out.println("Invalid Input");
			
			System.out.println("Do you want to display another triangle?, enter 1 for yes, 0 for no: ");
		
			//this if else handles the user's response if he/she wants to repeat using the program
	    	again = in.nextInt();
			
	    	if(again==0)
			{
				System.out.println("EXIT");
				run=0;
			}
			
			else if(again==1)
			{
				run=1;
			}
			
			else
			{
				System.out.println("Invalid input, SYSTEM DOWN");
				run=0;
			}
			
			
		}		
		
	}
	
	 static void four()
	{
		Scanner in = new Scanner(System.in);
		int i,j, month, day, year, again, run=1;
		String array_month[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		while(run==1)
		{
			
			System.out.println("You can choose the date you want to display in this program.\n");
			System.out.println("What is the month, choose from the following: \n1 -- January\n2 -- "
					+ "February\n3 -- March\n4 -- April\n5 -- May\n6 -- June\n7 -- July\n8 -- August\n9 -- September\n10 -- October\n"
					+ "11 -- November\n12 -- December");
			
			
			
			month = in.nextInt();
			
			System.out.print("What is the day: ");
			
			day = in.nextInt();
			
			System.out.println("What is the year: ");
			
			year = in.nextInt();
		
			if(month==2) 
			{
				if((day>0)&&(day<30))
				{
					if((year>0)&&(year<2023))
					{
						System.out.println("The date you have entered is: " + array_month[month-1] + " " + day + " " + year);
						System.out.println("Click Enter to continue...");
						
						in.nextLine();in.nextLine();
						
						System.out.println("Do you want to try again?: 1 for yes, 0 for no");
						
						again = in.nextInt();
						
						if(again==0)
						{
							System.out.println("EXIT");
							run=0;
						}
						
						else if(again==1)
						{
							run=1;
						}
						
						else
						{
							System.out.println("Invalid input, SYSTEM DOWN");
							run=0;
						}
					}
					
					else 
					{
						System.out.println("The year you have entered is invalid, the valid range is from 1-2022 only.\n");
						
						System.out.println("Do you want to try again?: 1 for yes, 0 for no");
						
						again = in.nextInt();
						
						if(again==0)
						{
							System.out.println("EXIT");
							run=0;
						}
						
						else if(again==1)
						{
							run=1;
						}
						
						else
						{
							System.out.println("Invalid input, SYSTEM DOWN");
							run=0;
						}
					}
				}
				
				else 
				{
					System.out.println("The day you have entered is invalid, the valid range is from 1-29 only.\n");
					
					System.out.println("Do you want to try again?: 1 for yes, 0 for no");
					
					again = in.nextInt();
					
					if(again==0)
					{
						System.out.println("EXIT");
						run=0;
					}
					
					else if(again==1)
					{
						run=1;
					}
					
					else
					{
						System.out.println("Invalid input, SYSTEM DOWN");
						run=0;
					}
				}
			}
			
			else if((month == 1) ||(month==10)||(month==12) || (month==3) ||(month==5)||((month>6)&&(month<9)))
			{
				if((day>0)&&(day<30))
				{
					if((year>0)&&(year<2023))
					{
						System.out.println("The date you have entered is: " + array_month[month-1] + " " + day + " " + year);
						System.out.println("Click Enter to continue...");
						
						in.nextLine();in.nextLine();
						
						System.out.println("Do you want to try again?: 1 for yes, 0 for no");
						
						again = in.nextInt();
						
						if(again==0)
						{
							System.out.println("EXIT");
							run=0;
						}
						
						else if(again==1)
						{
							run=1;
						}
						
						else
						{
							System.out.println("Invalid input, SYSTEM DOWN");
							run=0;
						}
					}
					
					else 
					{
						System.out.println("The year you have entered is invalid, the valid range is from 1-2022 only.\n");
						
						System.out.println("Do you want to try again?: 1 for yes, 0 for no");
						
						again = in.nextInt();
						
						if(again==0)
						{
							System.out.println("EXIT");
							run=0;
						}
						
						else if(again==1)
						{
							run=1;
						}
						
						else
						{
							System.out.println("Invalid input, SYSTEM DOWN");
							run=0;
						}
					}
				}
				else 
				{
					System.out.println("The day you have entered is invalid, the valid range is from 1-31 only.\n");
					
					System.out.println("Do you want to try again?: 1 for yes, 0 for no");
					
					again = in.nextInt();
					
					if(again==0)
					{
						System.out.println("EXIT");
						run=0;
					}
					
					else if(again==1)
					{
						run=1;
					}
					
					else
					{
						System.out.println("Invalid input, SYSTEM DOWN");
						run=0;
					}
				}					
			}
			
			else if((month==4)||(month==6)||(month==9)||(month==11))
			{
				if((day>0)&&(day<31))
				{
					if((year>0)&&(year<2023))
					{
						System.out.println("The date you have entered is: " + array_month[month-1] + " " + day + " " + year);
						System.out.println("Click Enter to continue...");
						
						in.nextLine();in.nextLine();
						
						System.out.println("Do you want to try again?: 1 for yes, 0 for no");
						
						again = in.nextInt();
						
						if(again==0)
						{
							System.out.println("EXIT");
							run=0;
						}
						
						else if(again==1)
						{
							run=1;
						}
						
						else
						{
							System.out.println("Invalid input, SYSTEM DOWN");
							run=0;
						}
					}
					
					else 
					{
						System.out.println("The year you have entered is invalid, the valid range is from 1-2022 only.\n");
						
						System.out.println("Do you want to try again?: 1 for yes, 0 for no");
						
						again = in.nextInt();
						if(again==0)
						{
							System.out.println("EXIT");
							run=0;
						}
						
						else if(again==1)
						{
							run=1;
						}
						
						else
						{
							System.out.println("Invalid input, SYSTEM DOWN");
							run=0;
						}
					}
				}
				else 
				{
					System.out.println("The day you have entered is invalid, the valid range is from 1-30 only.\n");
					
					System.out.println("Do you want to try again?: 1 for yes, 0 for no");
					
					again = in.nextInt();
					
					if(again==0)
					{
						System.out.println("EXIT");
						run=0;
					}
					
					else if(again==1)
					{
						run=1;
					}
					
					else
					{
						System.out.println("Invalid input, SYSTEM DOWN");
						run=0;
					}
				}
			}
			else 
			{
				System.out.println("The month you have entered is invalid, the valid range is from 1-12 only.\n");
				
				System.out.println("Do you want to try again?: 1 for yes, 0 for no");
				
				again = in.nextInt();
				
				if(again==0)
				{
					System.out.println("EXIT");
					run=0;
				}
				
				else if(again==1)
				{
					run=1;
				}
				
				else
				{
					System.out.println("Invalid input, SYSTEM DOWN");
					run=0;
				}
			}
		}
	}
	
	static void five()
	{
		int run =1,again;
		while(run==1)
		{
			Scanner in = new Scanner(System.in);

			String name,hobby;int age;
			System.out.print("What is your name?:");
			name = in.nextLine();
			
			System.out.print("What is your age?:");
			age = in.nextInt();
			
			System.out.print("What is your hobby?:");
			in.nextLine();hobby = in.nextLine();
			
			System.out.println("Hello everyone, my name is " +name+". I am now " + age +" years old and my hobby is " + hobby+".");
			System.out.println("Click Enter to continue...");
			
			in.nextLine();
			
			System.out.println("Do you want to try again?: 1 for yes, 0 for no");
			
			again = in.nextInt();
			
			if(again==0)
			{
				System.out.println("EXIT");
				run=0;
			}
			
			else if(again==1)
			{
				run=1;
			}
			
			else
			{
				System.out.println("Invalid input, SYSTEM DOWN");
				run=0;
			}
		}		
	}

	static void six()
	{
		int run=1,again;
		while(run==1)
		{
			Scanner in = new Scanner(System.in);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
			System.out.println("The date today is: "+sdf.format(date));
			System.out.println("Click Enter to continue...");
			
			in.nextLine();
			

			System.out.println("Do you want to try again?: 1 for yes, 0 for no");
			
			again = in.nextInt();
			if(again==0)
			{
				System.out.println("EXIT");
				run=0;
			}
			
			else if(again==1)
			{
				run=1;
			}
			
			else
			{
				System.out.println("Invalid input, SYSTEM DOWN");
				run=0;
			}
		}		
	}
	
	static void seven()
	{
		int i,j,x,y,run=1,again;
		while (run==1)
		{
			Scanner in = new Scanner(System.in);
			
			
			System.out.println("This program will let you control a 2d array\nYou must choose the x and y axis coordinate where you want to include the hole.");
			for(i=0;i<12;i++) System.out.println();
			System.out.println("Click Enter to continue...");
			
			in.nextLine();
			
			char array[][]=
					{
							{'*','*','*','*','*','*','*','*'},
							{'*','*','*','*','*','*','*','*'},
							{'*','*','*','*','*','*','*','*'},
							{'*','*','*','*','*','*','*','*'}
							
					};
			
			for(char row[]:array)
			{
				for(char col:row)
				{
					System.out.print(col);
				}
				System.out.println();
			}
			
			
			System.out.print("Input the x axis: ");
			x = in.nextInt();
			System.out.print("Input the y axis: ");
			y = in.nextInt();
			
			if((x>=0&&x<=8)&&(y>=0&&y<=4))
			{
				for(i=0;i<4;i++)
				{
					for(j=0;j<8;j++)
					{
						if(i==y && j==x)
						{
							array[y][x] = ' ';
						}
						System.out.print(array[i][j]);
					}
					System.out.println();
				}
				
				System.out.println("Click Enter to continue...");
				
				in.nextLine();
				

				System.out.println("Do you want to try again?: 1 for yes, 0 for no");
				
				again = in.nextInt();
				if(again==0)
				{
					System.out.println("EXIT");
					run=0;
				}
				
				else if(again==1)
				{
					run=1;
				}
				
				else
				{
					System.out.println("Invalid input, SYSTEM DOWN");
					run=0;
				}
			}
			else
			{
				System.out.println("\nThe x and y axis you have entered does not exist.");
				
				System.out.println("Click Enter to continue...");
				
				in.nextLine();in.nextLine();
				

				System.out.println("Do you want to try again?: 1 for yes, 0 for no");
				
				again = in.nextInt();
				if(again==0)
				{
					System.out.println("EXIT");
					run=0;
				}
				
				else if(again==1)
				{
					run=1;
				}
				
				else
				{
					System.out.println("Invalid input, SYSTEM DOWN");
					run=0;
				}
			}		
		}		
	}
	
	static void eight()
	{
		int i,j,run=1,again,loop=1,count=0;
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("This program will let you display emojis.");
		for(i=0;i<12;i++) System.out.println();
		System.out.println("Click Enter to continue...");
		
		in.nextLine();
		char smile[][]=
			{
					{' ',' ',' ',' ',' ',' ',' ','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*',' ',' '},
					{' ',' ',' ',' ','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*',' '},
					{' ',' ','*','*','*','*','-','-','-','-','-','-','*','*','*','*','*','*','*','-','-','-','-','-','-','*','*','*','*',' '},
					{'*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*',' '},
					{'*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*',' ',' ',' '},
					{'*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*',' ',' ',' '},
					{'*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*',' ',' ',' '},					
					{' ',' ','*','*','*','*','*','*',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','*','*','*','*','*','*',' ',' ',' '},
					{' ',' ',' ',' ','*','*','*','*','*','*',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','*','*','*','*','*','*',' ',' ',' '},
					{' ',' ',' ',' ',' ',' ',' ','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*',' ',' ',' ',' '},
					{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','*','*','*','*','*','*','*','*','*','*','*',' ',' ',' ',' ',' ',' ',' '}
				
					
					
			};
	
	char half_smile[][]=
		{
				{' ',' ',' ',' ',' ',' ',' ','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*',' ',' '},
				{' ',' ',' ',' ','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*',' '},
				{' ',' ','*','*','*','*',' ',' ',' ',' ',' ',' ','*','*','*','*','*','*','*',' ',' ',' ',' ',' ',' ','*','*','*','*',' '},
				{'*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*',' '},
				{'*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*',' ',' ',' '},
				{'*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*',' ',' ',' '},
				{'*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*',' ',' ',' '},					
				{' ',' ','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*',' ',' ',' '},
				{' ',' ',' ',' ','*','*','*','*','*','*','-','-','-','-','-','-','-','-','-','-','-','*','*','*','*','*','*',' ',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','*','*','*','*','*','*','*','*','*','*','*',' ',' ',' ',' ',' ',' ',' '}
			
				
				
		};
	char serious[][]=
		{
				{' ',' ',' ',' ',' ',' ',' ','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*',' ',' '},
				{' ',' ',' ',' ','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*',' '},
				{' ',' ','*','*','*','*',' ',' ',' ',' ',' ',' ','*','*','*','*','*','*','*',' ',' ',' ',' ',' ',' ','*','*','*','*',' '},
				{'*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*',' '},
				{'*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*',' ',' ',' '},
				{'*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*',' ',' ',' '},
				{'*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*',' ',' ',' '},					
				{' ',' ','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*',' ',' ',' '},
				{' ',' ',' ',' ','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*',' ',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','*','*','*','*','*','*','*','*','*','*','*',' ',' ',' ',' ',' ',' ',' '}
			
				
				
		};
	while(loop==1)
	{	
		int counter=0;
		while (counter<4)
		{		
			for(double a=1;a<=10000000;a=a+0.03);
			for(char row[]:smile)
			{
				for(char col:row)
				{
					
					System.out.print(col);
				}
				System.out.println();
			}
			for(double a=1;a<=10000000;a=a+0.03);
			for(char row[]:half_smile)
			{
				for(char col:row)
				{
					
					System.out.print(col);
				}
				System.out.println();
			}
			for(double a=1;a<=10000000;a=a+0.03);
			for(char row[]:serious)
			{
				for(char col:row)
				{
					
					System.out.print(col);
				}
				System.out.println();
			}
			
			counter+=1;			
		}
		System.out.println("Click Enter to continue...");
		
		if(count==0)in.nextLine();
		
		else {in.nextLine();in.nextLine();}
		System.out.println("Do you want to try again?: 1 for yes, 0 for no");
		
		again = in.nextInt();
		if(again==0)
		{
			System.out.println("EXIT");
			loop=0;
		}
		
		else if(again==1)
		{
			loop=1;
		}
		
		else
		{
			System.out.println("Invalid input, SYSTEM DOWN");
			loop=0;
		}
		count+=1;
	}
		
	}
	
	static void nine()
	{
		int i,j,com_pick,again,loop=1;
		while(loop==1)
		{
			int pick=0,p_score=0,com_score=0,round=1,run=1;	
			
			Scanner in2 = new Scanner(System.in);
			System.out.println("You will play Rock, Paper, Scissor!");
			for(i=0;i<12;i++)
			{
				System.out.println();
			}
			System.out.println("Click Enter to continue...");
			
			in2.nextLine();
			
			System.out.println("Are you ready? Let's go...");
			for(i=0;i<12;i++)
			{
				System.out.println();
			}
			System.out.println("Click Enter to continue...");
			
			in2.nextLine();
			
			System.out.println("First Enter your name: ");
			String name = in2.nextLine();
			for(i=0;i<12;i++)
			{
				System.out.println();
			}
			System.out.println(name + " you will play against a computer within 5 rounds. \n ");
			for(i=0;i<12;i++)
			{
				System.out.println();
			}
			System.out.println("Click Enter to continue...");
			
			in2.nextLine();
			for(i=0;i<12;i++)
			{
				System.out.println();
			}
			while(run==1&&round<6)
			{
				
				Scanner in = new Scanner(System.in);
				System.out.println("ROUND "+round+ "\n");
			
				System.out.println("Choose your weapon:\n1 -- Rock\n2 -- Paper\n3 -- Scissor\n4 -- EXIT");
				
				pick = in.nextInt();
				
				if(pick>0&&pick<4)
				{
					Random rand = new Random();int r;
					r = rand.nextInt(3);
				
					com_pick = r;
					int p=p_score,c = com_score;
					
					
					if(com_pick == 0)
					{
						System.out.println("The computer chose Rock!");
						
						if(pick==1)
						{
							System.out.println("Rock vs Rock!\nIt's a TIE.");
							p=p_score;c = com_score;
							System.out.println("\nPlayer Score: " + p +"\n\n" + "Computer Score: " + c);System.out.println("Click Enter to continue...");in.nextLine();in.nextLine();
							
						}
						else if(pick==2)
						{
							System.out.println("Paper vs Rock!\n" +name + " WINS.");
							p_score+=1;
							p=p_score;c = com_score;
							System.out.println("\nPlayer Score: " + p +"\n\n" + "Computer Score: " + c);System.out.println("Click Enter to continue...");
							in.nextLine();in.nextLine();
							
							
							
						}
						else if(pick==3)
						{
							System.out.println("Scissor vs Rock!\nComputer WINS.");
							com_score+=1;p=p_score;c = com_score;
							System.out.println("\nPlayer Score: " + p +"\n\n" + "Computer Score: " + c);System.out.println("Click Enter to continue...");
							in.nextLine();in.nextLine();
							
						}
					}
					else if(com_pick == 1)
					{
						System.out.println("The computer chose Paper!");
						if(pick==1)
						{
							System.out.println("Rock vs Paper!\nComputer WINS.");
							com_score+=1;p=p_score;c = com_score;
							System.out.println("\nPlayer Score: " + p +"\n\n" + "Computer Score: " + c);System.out.println("Click Enter to continue...");
							in.nextLine();in.nextLine();
							
						}
						else if(pick==2)
						{
							System.out.println("Paper vs Paper!\nIt's a TIE.");
							p=p_score;c = com_score;
							System.out.println("\nPlayer Score: " + p +"\n\n" + "Computer Score: " + c);System.out.println("Click Enter to continue...");in.nextLine();in.nextLine();
							
						}
						else if(pick==3)
						{
							System.out.println("Scissor vs Paper!\n" +name + " WINS.");
							p_score+=1;p=p_score;c = com_score;
							System.out.println("\nPlayer Score: " + p +"\n\n" + "Computer Score: " + c);System.out.println("Click Enter to continue...");
							in.nextLine();in.nextLine();
						}
					}
					else 
					{
						System.out.println("The computer chose Scissor!");
						if(pick==1)
						{
							System.out.println("Rock vs Scissor!\n" +name + " WINS.");
							p_score+=1;p=p_score;c = com_score;
							System.out.println("\nPlayer Score: " + p +"\n\n" + "Computer Score: " + c);System.out.println("Click Enter to continue...");
							in.nextLine();in.nextLine();
						}
						else if(pick==2)
						{
							System.out.println("Paper vs Scissor!\nComputer WINS.");
							com_score+=1;p=p_score;c = com_score;
							System.out.println("\nPlayer Score: " + p +"\n\n" + "Computer Score: " + c);System.out.println("Click Enter to continue...");
							in.nextLine();in.nextLine();
						}
						else if(pick==3)
						{
							System.out.println("Scissor vs Scissor!\nIt's a TIE.");
							p=p_score;c = com_score;
							System.out.println("\nPlayer Score: " + p +"\n\n" + "Computer Score: " + c);in.nextLine();in.nextLine();System.out.println("Click Enter to continue...");
							
						}
					}
					
					}
				else if(pick==4)
				{
					
					System.out.println("EXIT"); run=0;
					System.out.println("Click Enter to continue...");
					in.nextLine();in.nextLine();
					

					System.out.println("Do you want to try again?: 1 for yes, 0 for no");
					
					again = in.nextInt();
					if(again==0)
					{
						System.out.println("EXIT");
						loop=0;
					}
					
					else if(again==1)
					{
						loop=1;
					}
					
					else
					{
						System.out.println("Invalid input, SYSTEM DOWN");
						loop=0;
					}
				}
				else
				{
					System.out.println("Invalid input, SYSTEM DOWN");
					System.out.println("Click Enter to continue...");
					
					in.nextLine();in.nextLine();
					

					System.out.println("Do you want to try again?: 1 for yes, 0 for no");
					
					again = in.nextInt();
					if(again==0)
					{
						System.out.println("EXIT");
						loop=0;
					}
					
					else if(again==1)
					{
						loop=1;
					}
					
					else
					{
						System.out.println("Invalid input, SYSTEM DOWN");
						loop=0;
					}
				}
				round+=1;
				}
			if(round>5)
			{
				if(p_score>com_score)System.out.println("YOU WIN! CONGRATULATIONS!");
				else if(com_score>p_score)System.out.println("COMPUTER WIN! BETTER LUCK NEXT TIME!");
				else System.out.println("IT'S A TIE!");
				System.out.println("Click Enter to continue...");
				
				in2.nextLine();
				

				System.out.println("Do you want to try again?: 1 for yes, 0 for no");
				
				again = in2.nextInt();
				if(again==0)
				{
					System.out.println("EXIT");
					loop=0;
				}
				
				else if(again==1)
				{
					loop=1;
				}
				
				else
				{
					System.out.println("Invalid input, SYSTEM DOWN");
					loop=0;
				}
			}
						
		}
			
	}
			
	static void ten()
	{
		int run=1,again;
		while(run==1)
		{
			Random rand = new Random();
			Scanner in = new Scanner(System.in);
			int dice1,dice2,result;
			
			for(int i=0;i<12;i++)System.out.println();
			System.out.println("This program will let you play 2 dice.\nThe 2 result from the dice will be added together.");
			for(int i=0;i<12;i++)System.out.println();
			
			System.out.println("Click Enter to continue...");
			
			in.nextLine();
			
			for(int i=0;i<12;i++)System.out.println();
			
			System.out.print("ROLL THE FIRST DICE!");
			for(int i=0;i<13;i++)System.out.println();
			in.nextLine();
			
			dice1 = rand.nextInt(6)+1;
			
			System.out.println("The result of the first dice is "+ dice1);
			
			System.out.println("Click Enter to continue...");
			
			in.nextLine();

			for(int i=0;i<12;i++)System.out.println();
			
			
			System.out.print("ROLL THE SECOND DICE!");

			for(int i=0;i<12;i++)System.out.println();
			
			in.nextLine();
			dice2 = rand.nextInt(6)+1;
			
			System.out.println("The result of the first dice is "+ dice2);
			
			result = dice1+dice2;
			
			System.out.print("YOUR LUCKY NUMBER IS " + result+"\n\n" );
			
			System.out.println("Click Enter to continue...");
			
			in.nextLine();
			
			System.out.println("Do you want to try again?: 1 for yes, 0 for no");
			
			again = in.nextInt();
			
			if(again==0)
			{
				System.out.println("EXIT");
				run=0;
			}
			
			else if(again==1)
			{
				run=1;
			}
			
			else
			{
				System.out.println("Invalid input, SYSTEM DOWN");
				run=0;
			}
						
		}
	
	}
		
}
