package StreetFightersSelection;

public class StreetFighterSelection {
    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves) {

        if (moves.length == 0) {
            return new String[]{};
        }

        int positionVertical = position[0];
        int positionHorizontal = position[1];
        String[] chosenFighters = new String[moves.length];

        for (int i = 0; i < moves.length; i++) {
            switch (moves[i]) {
                case "left":
                    if (positionHorizontal == 0) {
                        positionHorizontal = fighters[0].length - 1;
                        break;
                    }
                    positionHorizontal = positionHorizontal - 1;
                    break;

                case "right":
                    if (positionHorizontal == fighters[0].length - 1) {
                        positionHorizontal = 0;
                        break;
                    }
                    positionHorizontal = positionHorizontal + 1;
                    break;

                case "up":
                    if (positionVertical == 0) {
                        break;
                    }
                    positionVertical = positionVertical - 1;
                    break;

                case "down":
                    if (positionVertical == 1) {
                        break;
                    }
                    positionVertical = positionVertical + 1;
                    break;

                default:
                    return new String[0];
            }

            chosenFighters[i] = fighters[positionVertical][positionHorizontal];
        }

        return chosenFighters;
    }
}