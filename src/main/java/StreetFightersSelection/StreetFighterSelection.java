package StreetFightersSelection;

public class StreetFighterSelection {

    String[][] figters = new String[][]{
            new String[]{"Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"},
            new String[]{"Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"}};
    int[] position = new int[]{0, 0};
    String[] moves = new String[]{"up", "left", "right", "left", "left"};

    public StreetFighterSelection() {
    }

    ;

    public StreetFighterSelection(String[][] fighters, int[] position, String[] moves) {
        this.figters = fighters;
        this.position = position;
        this.moves = moves;
    }

    public String[] ChooseCharacter() {

        String[] choosenCharacters = new String[moves.length];
        //It's starting with -1 because String[] moves start in 0
        int elementOfArrayMoves = -1;

        if (moves.length == 0) {
            return new String[]{};
        }

        while (moves.length != 0) {

            for (String move : moves) {
                elementOfArrayMoves++;

                if (move.equals("left")) {
                    //jesli element 0 -> przejdz do ostatniego
                    //jesli element 1+ -> przejdz array w lewo

                }
                if (move.equals("right")) {
                    //jesli element 5 -> przejdz do pierwszego
                    //jesli element 4- -> przejdz array w prawo
                }
                if (move.equals("up")) {
                    //jesli gorna linijka zostan
                    //jesli dolna linijka przejdz do gory
                }
                if (move.equals("down")) {
                    //jestli gorna linijka przejdz na dol
                    //jesli dolna linijka zostan
                }

                //then delate the array[move]
                //do first array[0]
                //adding fighter to String[] choosenCharacter
                //repeat until moves.equals(0)
            }
        }


        return new String[]{"Ryu"};
    }

    private String[][] positionChange(String move) {
        return new String[][]{{"X"}, {"D"}};

    }


}

