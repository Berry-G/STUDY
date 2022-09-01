package kr.co.ezenac.level;

public class PlayerTest
{
	public static void main(String[] args)
	{
		Player player = new Player();
		player.play(3);

		PlayerLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		PlayerLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}
}
