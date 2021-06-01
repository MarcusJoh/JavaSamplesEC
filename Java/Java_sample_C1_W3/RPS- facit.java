import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int stateRock = 1;
		int statePaper = 2;
		int stateScissor = 3;

		int player1 = 0;
		int player2 = 0;
		boolean Player1ready = false;
		boolean Player2ready = false;

		int gameRound = 1;
		int player1Score = 0;
		int player2Score = 0;

		while (gameRound <= 3) {
			System.out.println("Round: " + gameRound);
			System.out.println("Player 1: Rock,Scissors,Paper: ");
			while (!Player1ready) {
				String player1Input = scan.nextLine();
				player1 = stringCheck(player1Input);

				if (!(player1 == 0)) {
					Player1ready = true;
				}
			}

			System.out.println("Player 2: Rock,Scissors,Paper: ");
			while (!Player2ready) {
				String player2Input = scan.nextLine();
				player2 = stringCheck(player2Input);

				if (!(player2 == 0)) {
					Player2ready = true;
				}
			}

			if (player1 == player2) {
				System.out.print("Tie");
				Player1ready = false;
				Player2ready = false;

			} else {
				if (player1 == stateRock) {
					if (player2 == stateScissor) {
						System.out.println("Player 1 wins!");
						player1Score++;
					} else {
						System.out.println("Player 2 wins!");
						player2Score++;
					}
				}

				else if (player1 == stateScissor) {
					if (player2 == statePaper) {
						System.out.println("Player 1 wins!");
						player1Score++;
					} else {
						System.out.println("Player 2 wins!");
						player2Score++;
					}
				}

				else if (player1 == statePaper) {
					if (player2 == stateRock) {
						System.out.println("Player 1 wins!");
						player1Score++;
					} else {
						System.out.println("Player 2 wins!");
						player2Score++;
					}
				}
				gameRound++;
				Player1ready = false;
				Player2ready = false;
			}
		}
		System.out.println("Game over");
		System.out.println("Player 1:" + player1Score + " wins, Player 2:" + player2Score+" wins");

	}

	static int stringCheck(String s) {
		
		int stingState = 0;
		try {
			stingState = Integer.parseInt(s);

		} catch (NumberFormatException e) {

			switch (s.toLowerCase()) {
			case "rock":
				stingState = 1;
				break;
			case "paper":
				stingState = 2;
				break;
			case "scissor":
				stingState = 3;
				break;
			default:
				System.out.println("Player input not valid:" + s + " , String");
				stingState = 0;

			}

		}

		if (stingState < 1 || stingState > 3) {
			System.out.println("Player input not valid:" + s + " , Number");
			stingState = 0;
		}

		return stingState;

	}

}
