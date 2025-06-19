public class Knight extends Fighter {
    public Knight(int baseHp, int wp) {
        super(baseHp, wp);
    }

    @Override
    public double getCombatScore() {
        double combatScore;
        if (Utility.isSquare(Battle.GROUND) == true) {
            combatScore = getBaseHp() * 2.0;
        } 
        else {
            if (getWp() == 1) {
                combatScore = getBaseHp() * 1.0;
            } 
            else {
                combatScore = getBaseHp() / 10.0;
            }
        }
        return Math.min(combatScore, 999.0);
    }
}