import java.util.Scanner;

public class michael3 {

	static Scanner keyboard = new Scanner(System.in);

	static boolean isGameActive = true;
	static boolean greenlight = true;
	static String player1;
	static String player2;
	//static String player1Name;
	//static String player2Name;
	static int turns;
	static int pos;
	static int pos2;
	static int score1;
	static int score2;
	//static int playerChoice1;
	//static int playerChoice2;
	static char board[] = new char [9];


	public static void main (String[] args) {
	System.out.println("pimp one enter name!: ");
	player1 = keyboard.nextLine();
	System.out.println("player two enter name!: ");
	player2 = keyboard.nextLine();
	drawBoard();
	eraseBoard();
	startGame();


	}

public static void drawBoard() {
		System.out.println("\n");
		System.out.println(board[0] + "    |" + board[1] + "   |" + board[2] );
		System.out.println(" ----|----|----");
		System.out.println(board[3] + "    |" + board[4] + "   |" + board[5] );	
		System.out.println(" ----|----|----");	
		System.out.println(board[6] + "    |" + board[7] + "   |" + board[8] );
		System.out.println("\n");



}

public static void playerOneMove() {
	System.out.println (player1 + ", Choose position 1-9: ");
	pos = keyboard.nextInt() -1;
	
	if(pos>10){
		System.out.println("DUUUUUUUUUUUUUUUUUUUUUUUUDE");
	}
	else{
	if(board[pos]==' '){
		board[pos]='x';
		greenlight=false;
		drawBoard();
		turns++;
		referee();
	}
	else{
			System.out.println("nope");
			playerOneMove();
	}
	}

}
public static void playerTwoMove() {
	System.out.println (player2 + ", Choose position 1-9: YOYOYOYO ");
	pos2 = keyboard.nextInt() -1;
	if(board[pos2]==' '){
		board[pos2]='o';
		greenlight=true;
		drawBoard();
		turns++;
		referee();
	}
	else{
			System.out.println("nope");
			playerTwoMove();
	}

}
public static void startGame() {
	while(isGameActive){
		if (greenlight==true){
			playerOneMove();
			greenlight = false;
		}

		else {
			playerTwoMove();
			greenlight = true;
		}

	}
}
public static void eraseBoard() {

	for(int i=0; i<9; i++){
		board[i] = ' ';
	}

}
public static void referee() {
        if (board [0] == 'x' && board [1] == 'x' && board [2] == 'x'){
                System.out.println(player1 + " wins!");
                	eraseBoard();
                		turns = 0;}
        else if (board [3] == 'x' && board [4] == 'x' && board [5] == 'x'){
                System.out.println(player1 + "Wins!");
                	eraseBoard();
                		turns = 0;}
        else if (board [6] == 'x' && board [7] == 'x' && board [8] == 'x'){
                System.out.println(player1 + "Wins!");
                	eraseBoard();
                		turns = 0;}
 
        else if (board [0] == 'x' && board [3] == 'x' && board [6] == 'x'){
                System.out.println(player1 + " wins!");
                	eraseBoard();
                		turns = 0;}
        else if (board [1] == 'x' && board [4] == 'x' && board [7] == 'x'){
                System.out.println(player1 + "Wins!");
                	eraseBoard();
                		turns = 0;}
        else if (board [2] == 'x' && board [5] == 'x' && board [8] == 'x'){
                System.out.println(player1 + "Wins!");
                	eraseBoard();
                		turns = 0;}
 
        else if (board [0] == 'x' && board [4] == 'x' && board [8] == 'x'){
                System.out.println(player1 + " wins!");
                	eraseBoard();
                		turns = 0;}
        else if (board [2] == 'x' && board [4] == 'x' && board [6] == 'x'){
                System.out.println(player1 + "Wins!");
                	eraseBoard();
                		turns = 0;}
 
        else if (board [0] == 'o' && board [1] == 'o' && board [2] == 'o'){
                System.out.println(player2 + " wins!");
                	eraseBoard();
                		turns = 0;}
        else if (board [3] == 'o' && board [4] == 'o' && board [5] == 'o'){
                System.out.println(player2 + "Wins!");
                	eraseBoard();
                		turns = 0;}
        else if (board [6] == 'o' && board [7] == 'o' && board [8] == 'o'){
                System.out.println(player2 + "Wins!");
                	eraseBoard();
                		turns = 0;}
 
        else if (board [0] == 'o' && board [3] == 'o' && board [6] == 'o'){
                System.out.println(player2 + " wins!");
                	eraseBoard();
                		turns = 0;}
        else if (board [1] == 'o' && board [4] == 'o' && board [7] == 'o'){
                System.out.println(player2 + "Wins!");
                	eraseBoard();
                		turns = 0;}
        else if (board [2] == 'o' && board [5] == 'o' && board [8] == 'o'){
                System.out.println(player2 + "Wins!");
                	eraseBoard();
                		turns = 0;} 
        else if (board [0] == 'o' && board [4] == 'o' && board [8] == 'o'){
                System.out.println(player2 + " wins!");
                	eraseBoard();
                		turns = 0;}
        else if (board [2] == 'o' && board [4] == 'o' && board [6] == 'o'){
                System.out.println(player2 + "Wins!");
                	eraseBoard();
                		turns = 0;}
        else if (turns == 9)
        		{
        			System.out.println("Draw");
        			eraseBoard();
 						turns = 0;}



}

}