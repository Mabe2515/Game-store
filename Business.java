import java.util.Scanner;

class User{
double Ps4, Switch, Xbox, minecraft, starwars, gtav;
// find a way to make the code reuse the same item.
// items games and maybe accesories.
// i might be using the same code to much but isnt that programing?
}
public class Business {
public static void main(String args[]) {

Scanner scan = new  Scanner (System.in);

int answer;

double Ps4, Switch, Xbox, minecraft, gtav, starwars;
Ps4 = 299;
Switch = 299;
Xbox = 249;
starwars = 60;
minecraft = 20;
gtav = 15;
// should i use really prices or fake?

User user = new User();
user.Ps4 = 0;
user.Xbox = 0;
user.Switch = 0;
user.minecraft = 0;
user.gtav = 0;
user.starwars = 0;


// See if there is a way to custmize the text bellow. maybe like color. or bigger font.
System.out.println("______________________________");
System.out.println("	Welcome to Game store	  ");
System.out.println("		Menu.		  ");
System.out.println("______________________________");



int x = 0;
 // use a while loop to repeat.
while(x == 0){  



		System.out.println("Hello looking to buy a console, game or accessory");
		System.out.println("choose one of this options to get started.");
		System.out.println("#1 Buy console");
		System.out.println("#2 Buy game");
		System.out.println("#3 Buy accessory");
		System.out.println("#0 Exit");

// need to make a code that if the user makes a wrong just to reloop it back to here.
// would a while code work? maybe something like this
// while( if x = 1 & x =2 & x =3  & x =  4)
int choice = scan.nextInt();
switch(choice) {

case 1:  			 System.out.println("What console will you like?");
				 System.out.println("#1 Ps4");
				 System.out.println("#2 Nintendo Switch");
				 System.out.println("#3 Xbox one");
				 System.out.println("#4 TO exit this menu");
				 choice = scan.nextInt();

			  	 if(choice == 1){
				
				System.out.println("Press 1 to put in cart or press 0 to no not to put in cart.");
				answer = scan.nextInt();
				

				if(answer == 1){
				System.out.println("Item was added to cart");
				System.out.println(answer);
				user.Ps4 = Ps4 + user.Ps4;
		
				}
				if(answer != 1){
				System.out.println(answer);
				System.out.println("Item was not added to cart");
				}
				}


				if(choice == 2){

				System.out.println("Press 1 to put in cart or press 0 to no not to put in cart.");
				answer = scan.nextInt();


				if(answer == 1){
				System.out.println("Item was added to cart");
				System.out.println(answer);
				user.Switch = Switch + user.Switch;
				}
				
				if(answer != 1){
				System.out.println(answer);
				System.out.println("Item was not added to cart");
				
				}
				}


				if(choice == 3){

				System.out.println("Press 1 to put in cart or press 0 to no not to put in cart.");
				answer = scan.nextInt();
				

				if(answer == 1){
				System.out.println("Item was added to cart");
				System.out.println(answer);
				user.Xbox = Xbox + user.Xbox;
		
				}
				if(answer != 1){
				System.out.println(answer);
				System.out.println("Item was not added to cart");
				}
				}
				break;





case 2:  	System.out.println("What system will you like to buy the game on?");
		System.out.println("#1 Ps4 game");
		System.out.println("#2 Nintendo Switch game");
		System.out.println("#3 Xbox one game");
		System.out.println("#4 To exit this menu");;
		choice = scan.nextInt();
		


		if(choice == 1){
		System.out.println("What game will you like to buy and a friendly reminder, if you dont have the console you cant play the game?");
		System.out.println("#1 GtaV");
		System.out.println("#2 Star Wars Jedi: Fallen Order");
		System.out.println("#3 Minecraft");
		System.out.println("#4 To exit this menu");;

		choice = scan.nextInt();
}
		if(choice == 1){
		System.out.println("Grand Theft Auto V is an action-adventure game played from either a third-person or first-person perspective."); 
		System.out.println("Players complete missions, linear scenarios with set objectives, to progress through the story. Outside of the");
		System.out.println("missions, players may freely roam the open world.");
		System.out.println();
		System.out.println("The games rating is 4/5 Stars");
		System.out.println("This game is a rated M game and cost $60. Are you over 18 to buy this game");
		System.out.println("Press 1 if you want the game or press 0 for no.");
		answer = scan.nextInt();

		if(answer == 1)
		System.out.println("Item was added to cart");

		if(answer != 1)
		System.out.println("Item was not added to cart");
		
		}



		if(choice == 2){
		System.out.println("Star Wars Jedi: Fallen Order is an action-adventure game that is a single player game in the third person. It is very fun even if your not a star wars fan.");
		System.out.println("Great game to explore and lose hours of your time because how great the game is."); 
		System.out.println();
		System.out.println("The games rating is 9/10 on Steam.");
		System.out.println("This game is T rating and cost $60.");
		System.out.println("Press 1 to enter into cart or press 0 for no.");
		answer = scan.nextInt();



		if(answer == 1)
		System.out.println("Item was added to cart");

		if(answer != 1)
		System.out.println("Item was not added to cart");
		

		}


		



		if(choice == 3){
		System.out.println("Minecraft is a Lego style adventure game which has massively increased in popularity since it was released two years ago."); 
		System.out.println("It now has more than 33 million users worldwide. The video game puts players in a randomly-generated world where they can");
		System.out.println("create their own structures and contraptions out of textured cubes");
		System.out.println();
		System.out.println("The games rating is 4/5 Stars");
		System.out.println("This game cost $20 and is a great game for anyone to play and has crossplay with any console.");
		System.out.println("Press 1 to add to cart or press 0 to not add in cart.");
		answer = scan.nextInt();

		if(answer == 1)
		System.out.println("Item was added to cart");

		if(answer != 1)
		System.out.println("Item was not added to cart");
		

		}


		
		


	
	break;

case 3:	 System.out.println("What kind of accessory will you like?");
	System.out.println("#1 Controller");
	System.out.println("#2 Shirt");
	choice = scan.nextInt();

if(choice == 1){
System.out.println("#1 Ps4 controller cost $60.");
System.out.println("#2 Xbox controller cost $60.");
System.out.println("#3 Switch pro controler cost $60.");

int choice2 = scan.nextInt();

if(choice2 == 1){

System.out.println("Would you like to put the Ps4 controller in carts."):
System.out.println("Press 1 for yes or press 0 for no.");
answer = scan.nextInt();

if(answer == 1)
		System.out.println("Item was added to cart");

		if(answer != 1)
		System.out.println("Item was not added to cart");
		

}
if(choice2 == 2){


System.out.println("Would you like to put the Xbox controller in carts."):
System.out.println("Press 1 for yes or press 0 for no.");
answer = scan.nextInt();

if(answer == 1)
		System.out.println("Item was added to cart");

		if(answer != 1)
		System.out.println("Item was not added to cart");
	

if(choice2 == 3){

System.out.println("Would you like to put the Switch pro controller in carts."):
System.out.println("Press 1 for yes or press 0 for no.");
answer = scan.nextInt();

if(answer == 1)
		System.out.println("Item was added to cart");

		if(answer != 1)
		System.out.println("Item was not added to cart");
	














}




if(choice == 2){




}












	
	break;


default :
	System.out.println("Please choose the correct choice.");
}

System.out.println("Would you like to make your purchase yes:1 or no:0");
int buy = scan.nextInt();
// i under is there a way to remove items from the cart.
// maybe if i try calling an item. Then I must list the items? is using an if statment the way to go

if(buy == 1){

double total = user.Ps4 + user.Xbox + user.Switch;hi
System.out.println("Thank you for shopping at the game store.");
System.out.println("This will be your total :$"+ total);
System.out.println( total);

buy = 2;
 }
if(buy != 1){

System.out.println("Would you like to quit press 1 and if like to Continue press 0");

int quit = scan.nextInt();
x = quit + x;

}if(buy == 2){

System.out.println("Thank you for shopping at the game store.");
}
	
}

}
}