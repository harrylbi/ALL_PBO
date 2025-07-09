package Character;

public interface Fighter {
    void attack();
    void defend();
    void gunakanRamuan();
    void useSkill(int skillNumber);
    void displayStatus();
    boolean isAlive();
    void attacked(int damage);
}
