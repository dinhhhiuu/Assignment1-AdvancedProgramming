public class Paladin extends Knight {
	public Paladin(int baseHp, int wp) {
		super(baseHp, wp);
	}

	@Override
	public double getCombatScore() {
		int check = this.getBaseHp();
		if (check == 0) return 0.0;
		if (check == 1) return 3.0;
		int temp = findFibonacciIndex(check);
		if (temp != -1) {
			return 1000.0 + temp;
		}
		return getBaseHp() * 3.0;
	}

	public int findFibonacciIndex(int n) {
		if (n < 0) return -1;
		int a = 0;
		int b = 1;
		int index = 1;
		while (b < n) {
			int temp = b;
			b = a + b;
			a = temp;
			index++;
		}
		if (b == n) return index;
		return -1;
	}
}
