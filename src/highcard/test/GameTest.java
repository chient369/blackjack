package highcard.test;

import java.util.ArrayList;
import java.util.Random;

import highcard.GameProcess;
import highcard.card.CardHandle;
import highcard.player.Player;
import highcard.player.PlayerManege;

public class GameTest {
	public static void main(String[] args) {		
		ArrayList<Player> list = new ArrayList<Player>();
		Random rand = new Random();
		//init 50 players
		for (int i = 0; i < 50; i++) {
			Player player = new Player("test num" + rand.nextInt(100));
			GameProcess gameProcess = new GameProcess(player);
			//random turns
			for (int j = 0; j < rand.nextInt(20); j++) {
				gameProcess.kekka(1, new CardHandle(), new CardHandle(), rand.nextInt(1000));
			}
			list.add(player);
		}
		System.out.println(list.size());
//		for (Player player : list) {
//			player.showPlayer();
//			System.out.println("++++++++++++");
//		}
		System.out.println("///////////////////////////////////////");
		PlayerManege playerManege = new PlayerManege(list);
		System.out.println("**********show best**********");
		playerManege.showBestPlayer();
		System.out.println("**********  show best turns**********");
		playerManege.showPlayerBestKaisu();
		System.out.println("**********  rank  **********");
		playerManege.showPlayersRank();
		System.out.println("********** sort by id**********");
		playerManege.sortPlayerById();
		System.out.println("**********sort by turns**********");
		playerManege.sortPlayerByKaisu();
		
		
	}

}
