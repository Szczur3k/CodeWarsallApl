package StreetFightersSelection;

import java.util.logging.Logger;

public class StreetFighterSelection {

    private final static Logger LOGGER = Logger.getGlobal();

    String[][] fighters;
    int[] position;
    String[] moves;

    public StreetFighterSelection(String[][] fighters, int[] position, String[] moves) {
        this.fighters = fighters;
        this.position = position;
        this.moves = moves;
    }

    public String[] ChooseCharacter() {

        if (moves.length == 0) {
            return new String[]{};
        }

        String[] choosenCharacters = new String[moves.length];
        int movesIndex = 0;

        for (int i = 1; movesIndex < choosenCharacters.length; i++) {

            if (!(moves[movesIndex].equals("down") ||
                    moves[movesIndex].equals("up") ||
                    moves[movesIndex].equals("left") ||
                    moves[movesIndex].equals("right"))) {
                return new String[]{};
            }

            if (moves[movesIndex].equals("left")) {
                if (fighters[position[0]][position[1]].equals("Ryu") || fighters[position[0]][position[1]].equals("Ken")) {
                    choosenCharacters[movesIndex] = fighters[position[0]][5];
                    position = new int[]{position[0], 5};
                } else {
                    choosenCharacters[movesIndex] = fighters[position[0]][position[1] - 1];
                    position = new int[]{position[0], position[1] - 1};
                }
            }

            if (moves[movesIndex].equals("right")) {
                if (fighters[position[0]][position[1]].equals("Vega") || fighters[position[0]][position[1]].equals("M.Bison")) {
                    choosenCharacters[movesIndex] = fighters[position[0]][0];
                    position = new int[]{position[0], 0};
                } else {
                    choosenCharacters[movesIndex] = fighters[position[0]][position[1] + 1];
                    position = new int[]{position[0], position[1] + 1};
                }
            }

            if (moves[movesIndex].equals("up")) {
                if (isFightersOnTopOrDown("Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega")) {
                    choosenCharacters[movesIndex] = fighters[0][position[1]];
                    position = new int[]{0, position[0]};
                } else {
                    choosenCharacters[movesIndex] = fighters[position[0] - 1][position[1]];
                    position = new int[]{position[0] - 1, position[1]};
                }
            }

            if (moves[movesIndex].equals("down")) {
                if (isFightersOnTopOrDown("Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison")) {
                    choosenCharacters[movesIndex] = fighters[1][position[1]];
                    position = new int[]{1, position[1]};
                } else {
                    choosenCharacters[movesIndex] = fighters[position[0] + 1][position[1]];
                    position = new int[]{position[0] + 1, position[1]};
                }
            }

            movesIndex++;
        }
        return choosenCharacters;
    }

    private boolean isFightersOnTopOrDown(String fighter1, String fighter2, String fighter3, String fighter4, String fighter5, String fighter6) {
        return fighters[position[0]][position[1]].equals(fighter1) ||
                fighters[position[0]][position[1]].equals(fighter2) ||
                fighters[position[0]][position[1]].equals(fighter3) ||
                fighters[position[0]][position[1]].equals(fighter4) ||
                fighters[position[0]][position[1]].equals(fighter5) ||
                fighters[position[0]][position[1]].equals(fighter6);
    }
}