// import java.util.Random;

// /**
//  * <p>This class is used for creating the team in a combat.</p>
//  * 
//  * <p> <b>Note: This class will be replaced by other version when being judged.</b></p>
//  */
// public class TeamMaker {
// 	private static Combatable makeRandomTeam1Member() {
// 		Random rand = new Random();
// 		int baseHP = rand.nextInt(999 - 99) + 1; // 1 - 900
// 		int wp = rand.nextInt(2);
// 		return (wp % 2 == 0) ? new Knight(baseHP, wp) : new Paladin(500, 1);
// 	}

// 	private static Combatable makeRandomTeam2Member() {
// 		Random rand = new Random();
// 		int baseHP = rand.nextInt(999 - 99) + 1;
// 		int wp = rand.nextInt(2);
// 		return (Battle.GROUND % 2 == 0) ? new Warrior(baseHP, wp) : new DeathEater(new Complex(300, 200));
// 	}

// 	public static Combatable[] makeTeam1() {
// 		Combatable[] knights = new Combatable[3];
// 		for (int i = 0; i < knights.length; i++) {
// 			knights[i] = makeRandomTeam1Member();
// 		}
// 		return knights;
// 	}

// 	public static Combatable[] makeTeam2() {
// 		Combatable[] warriors = new Combatable[3];
// 		for (int i = 0; i < warriors.length; i++) {
// 			warriors[i] = makeRandomTeam2Member();
// 		}
// 		return warriors;
// 	}
// }
// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Random;

public class TeamMaker {

	private static long seed;
	private static long idx = 0;
	public static void setSeed(long s) {
		seed = s;
		idx = 0;
	}

   public TeamMaker() {
   }
   
   private static Combatable makeRandomTeam1Member() {
      Random var0 = new Random(seed + idx++);
		int Hp = var0.nextInt(900) + 1;
		int Mp = var0.nextInt(800) + 1;
		int var2 = var0.nextInt(4);
	  
		switch (var2) {
			case 0:
				return new Knight(Hp, Mp);
			case 1:
				return new Warrior(Mp, Hp);
			case 2:
				return new Paladin(Hp, Mp);
			default:
				return new DeathEater(new Complex(Mp, Hp));
			
						
		}
   	}

	   private static Combatable makeRandomTeam2Member() {
			Random var0 = new Random(seed + idx+2);
			int Hp = var0.nextInt(900) + 1;
			int Mp = var0.nextInt(800) + 1;
			int var2 = var0.nextInt(4);
			
			switch (var2) {
				case 0:
					return new Knight(Hp, Mp);
				case 1:
					return new Warrior(Mp, Hp);
					case 2:
					return new Paladin(Hp, Mp);
				default:
					return new DeathEater(new Complex(Mp, Hp));
				
							
			}
		 }

	public static Combatable[] makeTeam1() {
		Random random = new Random(seed);
		int length = random.nextInt(3) + 3;
      Combatable[] var0 = new Combatable[length];

      for(int var1 = 0; var1 < var0.length; ++var1) {
         var0[var1] = makeRandomTeam1Member();
      }

      return var0;
   }

	public static Combatable[] makeTeam2() {
		Random random = new Random(seed );
		int length = random.nextInt(3) + 3;
      Combatable[] var0 = new Combatable[length];

      for(int var1 = 0; var1 < var0.length; ++var1) {
         var0[var1] = makeRandomTeam2Member();
      }

      return var0;
   }
}