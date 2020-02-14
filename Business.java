import java.util.Scanner;

class User{
double Ps4, Switch, Xbox, cup, minecraft, starwars, gtav, Shirt, ps4controller, Switchcontroller, xboxcontroller, smash, mario, halo ;
// find a way to make the code reuse the same item.
// items games and maybe accesories.
// i might be using the same code to much but isnt that programing?
}
public class Business {
public static void main(String args[]) {

Scanner scan = new  Scanner (System.in);

int answer;
int game;
int accessory;
int choice;
int answer1;
int choice3;
int b;
int w;
double  pay;
double change;


double Ps4, Switch, Xbox, minecraft, gtav, cup, mario, starwars, ps4controller, Switchcontroller, xboxcontroller, smash, halo, Shirt;
Ps4 = 299;
Switch = 299;
Xbox = 249;
starwars = 60;
minecraft = 20;
gtav = 15;
Shirt = 15;
ps4controller = 60;
Switchcontroller = 60;
xboxcontroller = 60;
smash = 60;
mario= 60;
halo = 10;
cup = 20;
Shirt = 15;
w = 1;
// should i use really prices or fake?

User user = new User();
user.Ps4 = 0;
user.Xbox = 0;
user.Switch = 0;
user.minecraft = 0;
user.gtav = 0;
user.starwars = 0;
user.ps4controller = 0;
user.Shirt = 0;
user.xboxcontroller = 0;
user.Switchcontroller = 0;
user.smash = 0;
user.mario = 0;
user.halo = 0;
user.cup = 0;
user.Shirt = 0;


// See if there is a way to custmize the text bellow. maybe like color. or bigger font.
System.out.println("______________________________");
System.out.println("	Welcome to Game store	  ");
System.out.println("		Menu.		  ");
System.out.println("______________________________");



int x = 0;
 // use a while loop to repeat.
while(x == 0){  


		System.out.println();
		System.out.println("Hello looking to buy a console, game or accessory");
		System.out.println("choose one of this options to get started.");
		System.out.println("#1 Buy console");
		System.out.println("#2 Buy game");
		System.out.println("#3 Buy accessory");
		System.out.println("#4 Go to Cart");
		
		

// need to make a code that if the user makes a wrong just to reloop it back to here.
// would a while code work? maybe something like this
// while( if x = 1 & x =2 & x =3  & x =  4)
int menu = scan.nextInt();



switch(menu) {
    
   	


case 1:  			System.out.println();
				 System.out.println("What console will you like?");
				 System.out.println("#1 Ps4");
				 System.out.println("#2 Nintendo Switch");
				 System.out.println("#3 Xbox one");
				 System.out.println("#4 TO exit this menu");
				 choice = scan.nextInt();

			  	 if(choice == 1){
				System.out.println();
				System.out.println("Press 1 to put Ps4 in cart or press 0 to no not to put in cart.");
				answer = scan.nextInt();
				

				if(answer == 1){
				System.out.println();
				System.out.println("Item was added to cart");
				
				user.Ps4 = Ps4 + user.Ps4;
		
				}
				if(answer != 1){
				System.out.println();
				System.out.println("Item was removed and not added to cart");
				user.Ps4 = 0;
				}
				}


				if(choice == 2){
				System.out.println();
				System.out.println("Press 1 to put Nintendo Switch in cart or press 0 to no not to put in cart.");
				answer = scan.nextInt();


				if(answer == 1){
				System.out.println();
				System.out.println("Item was added to cart");
				
				user.Switch = Switch + user.Switch;
				}
				
				if(answer != 1){
				user.Switch = 0;
				System.out.println();
				System.out.println("Item was removed and not added to cart");
				
				}
				}


				if(choice == 3){
				System.out.println();
				System.out.println("Press 1 to put Xbox in cart or press 0 to no not to put in cart.");
				answer = scan.nextInt();
				

				if(answer == 1){

				System.out.println();
				System.out.println("Item was added to cart");
				System.out.println(answer);
				user.Xbox = Xbox + user.Xbox;
		
				}
				if(answer != 1){
				user.Xbox = 0;
				System.out.println();
				System.out.println("Item was removed and not added to cart");
				}
				}
				break;





case 2:  	System.out.println();
		System.out.println("What system will you like to buy the game on?");
		System.out.println("#1 Ps4 game");
		System.out.println("#2 Nintendo Switch game");
		System.out.println("#3 Xbox one game");
		System.out.println("#4 To exit this menu");;
		game = scan.nextInt();
		
		


if(game == 1){
		System.out.println();
		System.out.println("What Ps4 game will you like to buy and a friendly reminder, if you dont have the console you cant play the game?");
		System.out.println("#1 GtaV");
		System.out.println("#2 Star Wars Jedi: Fallen Order");
		System.out.println("#3 Minecraft");
		System.out.println("#0 To exit this menu");
		int c = scan.nextInt();
		

		if(c == 1){
		System.out.println();
		System.out.println("Grand Theft Auto V is an action-adventure game played from either a third-person or first-person perspective."); 
		System.out.println("Players complete missions, linear scenarios with set objectives, to progress through the story. Outside of the");
		System.out.println("missions, players may freely roam the open world.");
		System.out.println();
		System.out.println("The games rating is 4/5 Stars");
	
		System.out.println("This game is a rated M game and cost $60. Are you over 18 to buy this game");
		System.out.println("Press 1 if you want the GtaV or press 0 for no.");
		answer = scan.nextInt();

		if(answer == 1){
		System.out.println();
		System.out.println("Item was added to cart");

		user.gtav = gtav + user.gtav;
			}
		if(answer != 1){
		System.out.println();
		System.out.println("Item was removed and not added to cart");
		user.gtav = 0;
		}
		
}

		if(c == 2){
		System.out.println();
		System.out.println("Star Wars Jedi: Fallen Order is an action-adventure game that is a single player game in the third person. It is very fun even if your not a star wars fan.");
		System.out.println("Great game to explore and lose hours of your time because how great the game is."); 
		System.out.println();
		System.out.println("The games rating is 9/10 on Steam.");
		System.out.println("This game is T rating and cost $60.");
		System.out.println("Press 1 for Star Wars Jedi: Fallen Order to be placed into the cart or press 0 for no.");
		answer = scan.nextInt();



		if(answer == 1){
		System.out.println();
		System.out.println("Item was added to cart");

		user.starwars = starwars + user.starwars;
		}
		
		if(answer != 1){
		System.out.println();
		System.out.println("Item was removed and not added to cart");
		user.starwars = 0;
}
	}	


		if(c == 3){
		System.out.println();
		System.out.println("Minecraft is a Lego style adventure game which has massively increased in popularity since it was released two years ago."); 
		System.out.println("It now has more than 33 million users worldwide. The video game puts players in a randomly-generated world where they can");
		System.out.println("create their own structures and contraptions out of textured cubes");
		System.out.println();
		System.out.println("The games rating is 4/5 Stars");
		System.out.println("This game cost $20 and is a great game for anyone to play and has crossplay with any console.");
		System.out.println("Press 1 to add Minecraft to the cart or press 0 to not add in cart.");
		answer = scan.nextInt();

		if(answer == 1){
		System.out.println();
		System.out.println("Item was added to cart");
		
		user.minecraft = minecraft + user.minecraft;
		}
		
		if(answer != 1){
		System.out.println();
		System.out.println("Item was removed and not added to cart");
			user.minecraft = 0;
		}
		}
		}
if(game == 2){
		System.out.println();
		System.out.println("What Switch game will you like to buy and a friendly reminder, if you dont have the console you cant play the game?");
		System.out.println("#1 Super Smash Bros");
		System.out.println("#2 Super Mario Odyssey");
		System.out.println("#3 Minecraft");
		System.out.println("#4 To exit this menu");;
		 choice = scan.nextInt();
		


if(choice == 1){
		System.out.println();
		System.out.println("Super Smash Bros is a series of crossover fighting video games published by Nintendo, and primarily features characters from various Nintendo franchises.");
		System.out.println("Its a great game to play with other and by yourself.") ;
		System.out.println("The games rating is 5/5 Stars");
		System.out.println();
		System.out.println("This game cost $60 and is a great game for anyone to play.");
		System.out.println("Press 1 to add Super Smash Bros to cart or press 0 to not add in cart.");
		answer = scan.nextInt();

		if(answer == 1){
		System.out.println();
		System.out.println("Item was added to cart");
		
		user.smash = smash + user.smash;
		
			}
		if(answer != 1){
		System.out.println();
		System.out.println("Item was removed and not added to cart");
			user.smash = 0;

		}
		}
if(choice == 2){

		System.out.println();
		System.out.println("Super Mario Odyssey is a platform game meant for all ages");
		System.out.println(" Its a good game for beginners or advance players. The object");
		System.out.println("is to collect moons and save the princess.");
		System.out.println("The games rating is 5/5 Stars");
		System.out.println();
		System.out.println("This game cost $60.");
		System.out.println("Press 1 to add Super Mario Odyssey to cart or press 0 to not add in cart.");
		answer = scan.nextInt();

		if(answer == 1){
		System.out.println();
		System.out.println("Item was added to cart");
		
		user.mario = mario + user.mario;
		}

		if(answer != 1){
		System.out.println();
		System.out.println("Item was removed and not added to cart");
			user.mario = 0;

}
}
if(choice == 3){

		System.out.println();
		System.out.println("Minecraft is a Lego style adventure game which has massively increased in popularity since it was released two years ago."); 
		System.out.println("It now has more than 33 million users worldwide. The video game puts players in a randomly-generated world where they can");
		System.out.println("create their own structures and contraptions out of textured cubes");
		System.out.println();
		System.out.println("The games rating is 4/5 Stars");
		System.out.println();
		System.out.println("This game cost $20 and is a great game for anyone to play and has crossplay with any console.");
		System.out.println("Press 1 to add Minecraft to the cart or press 0 to not add in cart.");
		answer = scan.nextInt();

		if(answer == 1){
		System.out.println();
		System.out.println("Item was added to cart");
		
		user.minecraft = minecraft + user.minecraft;
		}
		
		if(answer != 1){
		System.out.println();
		System.out.println("Item was removed and not added to cart");
			user.minecraft = 0;
		

}
}
}
if(game == 3){

		System.out.println();
		System.out.println("What Xbox game will you like to buy and a friendly reminder, if you dont have the console you cant play the game?");
		System.out.println("#1 GtaV");
		System.out.println("#2 Halo: Reach");
		System.out.println("#3 Cuphead");
		System.out.println("#4 To exit this menu");
		b = scan.nextInt();
	


if(b == 1){
		System.out.println();
		System.out.println("Grand Theft Auto V is an action-adventure game played from either a third-person or first-person perspective."); 
		System.out.println("Players complete missions, linear scenarios with set objectives, to progress through the story. Outside of the");
		System.out.println("missions, players may freely roam the open world.");
		System.out.println();
		System.out.println("The games rating is 7/10 Steam.");
	
		System.out.println("This game is a rated M game and cost $60. Are you over 18 to buy this game");
		System.out.println("Press 1 if you want the GtaV or press 0 for no.");
		answer = scan.nextInt();

		if(answer == 1){
		System.out.println();
		System.out.println("Item was added to cart");

		user.gtav = gtav + user.gtav;
		}
		if(answer != 1){
		System.out.println();
		System.out.println("Item was removed and not added to cart");
		user.gtav = 0;
		
	}	

}
if(b == 2){
		System.out.println();
		System.out.println("Halo: Reach is a 2010 classic game that got remaster first-person shooter developed by Bungie and published by Microsoft Game Studios, originally");
		System.out.println("for the Xbox 360. The fifth installment in the Halo series and a direct prequel to Halo: Combat Evolved,");
		System.out.println();
		System.out.println("The games rating is 4/5 Stars");
	
		System.out.println("This game cost $60.");
		System.out.println("Press 1 if you want the Halo: Reach or press 0 for no.");
		answer = scan.nextInt();

		if(answer == 1){
		System.out.println();
		System.out.println("Item was added to cart");

		user.halo = halo + user.halo;
		}
		if(answer != 1){
		System.out.println();
		System.out.println("Item was removed and not added to cart");
		user.halo = 0;
}		
}
if(b == 3){

System.out.println();
		System.out.println("CupHead is a 2017 run and gun video and can be hard.");
		System.out.println("Recommend this game if you like a challenge good luck gamer.");
		System.out.println();
		System.out.println("The games rating is 10/10 on steam");
	
		System.out.println("This game cost $20.");
		System.out.println("Press 1 if you want the CupHead or press 0 for no.");
		answer = scan.nextInt();

		if(answer == 1){
		System.out.println();
		System.out.println("Item was added to cart");

		user.cup = cup + user.cup;
		}
		if(answer != 1){
		System.out.println();
		System.out.println("Item was removed and not added to cart");
		user.cup = 0;
	}	

}

}
break;

case 3:	System.out.println("What kind of accessory will you like?");
	System.out.println("#1 Controller");
	System.out.println("#2 Shirt");
	System.out.println("#4 To exit this menu");
	accessory = scan.nextInt();

if(accessory == 1){
System.out.println("#1 Ps4 controller cost $60.");
System.out.println("#2 Xbox controller cost $60.");
System.out.println("#3 Switch pro controler cost $60.");
int choice2 = scan.nextInt();

if(choice2 == 1){

System.out.println("Would you like to put the Ps4 controller in carts.");
System.out.println("Press 1 for yes or press 0 for no.");
answer = scan.nextInt();

if(answer == 1){
		System.out.println("Item was added to cart");
		
user.ps4controller = ps4controller + user.Ps4;
}
		if(answer != 1){
		System.out.println("Item was removed and not added to cart");
		user.ps4controller= 0;
	}	

}

if(choice2 == 2){


System.out.println("Would you like to put the Xbox controller in carts.");
System.out.println("Press 1 for yes or press 0 for no.");
answer1 = scan.nextInt();

if(answer1 == 1){
		System.out.println("Item was added to cart");
		
		user.xboxcontroller = xboxcontroller + user.xboxcontroller;
}
		if(answer1 != 1){
		System.out.println("Item was removed and not added to cart");
		user.xboxcontroller = 0;
		
}
}

if(choice2 == 3){


System.out.println("Would you like to put the Switch pro controller in carts.");
System.out.println("Press 1 for yes or press 0 for no.");
answer1 = scan.nextInt();

if(answer1 == 1){
		System.out.println("Item was added to cart");
		
		user.Switchcontroller = Switchcontroller + user.Switchcontroller;
}

		if(answer1 != 1){
		System.out.println("Item was removed and not added to cart");
		user.Switchcontroller = 0;
		
}
}

}



if(accessory == 2){


System.out.println("Would you like to put a Shirt in carts.");
System.out.println("Press 1 for yes or press 0 for no.");
answer1 = scan.nextInt();



if(answer1 == 1){
		System.out.println("Item was added to cart");
		
		user.Shirt = Shirt + user.Shirt;
}

		if(answer1 != 1){
		System.out.println("Item was removed and not added to cart");
		user.Shirt = 0;

}


}


break;

case 4:

 



System.out.println();
System.out.println("Would you like to make your purchase yes:1 or no:0");
int buy = scan.nextInt();
// i under is there a way to remove items from the cart.
// maybe if i try calling an item. Then I must list the items? is using an if statment the way to go

if(buy == 1){

double total = user.Ps4 + user.Xbox + user.Switch + user.Switchcontroller + user.xboxcontroller + user.Shirt +  user.ps4controller + user.starwars + user.gtav + user.minecraft + user.smash + user.mario +user.halo + user.cup ;
System.out.println();
System.out.println("Thank you for shopping at the Game store.");
w = 1;
while(w == 1){
System.out.println("This will be your total :$"+ total);
System.out.println("Please input your cash your going to pay.");
pay = scan.nextInt();

change = pay-total;

if(total <= pay){
System.out.println();
System.out.println("Thank you for paying, Here is your change : " +  change);
buy = 2;
w++;

}
if(total > pay){
System.out.println();
System.out.println("Sorry the payment was not wrong please try again");




}



}
 }
if(buy != 1){

System.out.println("Would you like to quit press 1 and if like to Continue press 0");

int quit = scan.nextInt();



user.Xbox = 0;
user.Switch = 0;
user.minecraft = 0;
user.gtav = 0;
user.starwars = 0;
user.ps4controller = 0;
user.Shirt = 0;
user.xboxcontroller = 0;
user.Switchcontroller = 0;
user.smash = 0;
user.mario = 0;
user.halo = 0;
user.cup = 0;
user.Shirt = 0;

x = quit + x;

}if(buy == 2){
System.out.println();
System.out.println("Thank you for shopping at the game store.");

}
}
}



}
}
