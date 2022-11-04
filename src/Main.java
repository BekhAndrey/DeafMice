public class Main {

    public static final Character leader = 'P';
    public static final String leftMouse = "0~";
    public static final String rightMouse = "~0";

    public static void main(String[] args) {
        String expression = "0~0~0~~0~0~0P0~~0~0";
        System.out.println(countDeafMice(expression));
    }

    public static int countDeafMice(String expression) {
        int leaderPosition = expression.length() - 1;
        int deafMiceCounter = 0;
        for (int i = 0; i < expression.length(); i += 2) {
            if (expression.charAt(i) == leader) {
                if (i == expression.length() - 1) {
                    break;
                }
                leaderPosition = i;
                i++;
            }
            String mouse = expression.substring(i, i + 2);
            if (leaderPosition > i && mouse.equals(leftMouse)) {
                deafMiceCounter++;
            }
            if (leaderPosition < i && mouse.equals(rightMouse)) {
                deafMiceCounter++;
            }
        }
        return deafMiceCounter;
    }
}