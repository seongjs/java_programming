public class Dice {

    private int value;

    public Dice() {
        value = 0;
    }

    public void roll() {
        value = (int) (Math.random() * 6) + 1;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public static void main(String[] args) {

        Dice dice1, dice2;
        int rollCount;

        dice1 = new Dice();
        dice2 = new Dice();
        rollCount = 0;

        do {
            dice1.roll();
            dice2.roll();
            System.out.println("주사위1= " + dice1.getValue() + " 주사위2= " + dice2.getValue());
            rollCount++;
        } while ((dice1.getValue() + dice2.getValue()) != 2);

        System.out.println("(1, 1)이 나오는데 걸린 횟수= " + rollCount);

    }

}
