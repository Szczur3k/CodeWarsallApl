package StreetFightersSelection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreetFighterSelectionTest {

    String[][] fighters = new String[][]{
            new String[]{"Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"},
            new String[]{"Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"},
    };
    int[] startingPosition = {0, 0};

    @Test
    public void shouldWorkWithNoMoves() {

        //Given
        String[] noMoves = new String[]{};

        //When
        List<Object> solution = Collections.emptyList();
        String[] fighterSelection = new StreetFighterSelection(fighters, startingPosition, noMoves).ChooseCharacter();

        //Then
        assertEquals(solution, Arrays.asList(fighterSelection));
    }

    @Test
    public void shouldWorkWithOneRight() {

        //Given
        String[] moves = new String[]{"right"};

        //When
        String[] solution = new String[]{"E.Honda"};
        String[] fighterSelection = new StreetFighterSelection(fighters, startingPosition, moves).ChooseCharacter();


        //Then
        assertEquals(Arrays.asList(solution), Arrays.asList(fighterSelection));
    }

    @Test
    public void shouldWorkWithOneLeft() {

        //Given
        String[] moves = new String[]{"left"};

        //When
        String[] solution = new String[]{"Vega"};
        String[] fighterSelection = new StreetFighterSelection(fighters, startingPosition, moves).ChooseCharacter();


        //Then
        assertEquals(Arrays.asList(solution), Arrays.asList(fighterSelection));
    }

    @Test
    public void shouldWorkWithOneUp() {

        //Given
        String[] moves = new String[]{"up"};

        //When
        String[] solution = new String[]{"Ryu"};
        String[] fighterSelection = new StreetFighterSelection(fighters, startingPosition, moves).ChooseCharacter();


        //Then
        assertEquals(Arrays.asList(solution), Arrays.asList(fighterSelection));
    }

    @Test
    public void shouldWorkWithOneUpWithDifferentStartingPosition() {

        //Given
        String[] moves = new String[]{"up"};
        startingPosition = new int[]{1, 3};

        //When
        String[] solution = new String[]{"Guile"};
        String[] fighterSelection = new StreetFighterSelection(fighters, startingPosition, moves).ChooseCharacter();


        //Then
        assertEquals(Arrays.asList(solution), Arrays.asList(fighterSelection));
    }

    @Test
    public void shouldWorkWithOneLeftWithDifferentStartingPosition() {

        //Given
        String[] moves = new String[]{"left"};
        startingPosition = new int[]{1, 4};

        //When
        String[] solution = new String[]{"Dhalsim"};
        String[] fighterSelection = new StreetFighterSelection(fighters, startingPosition, moves).ChooseCharacter();


        //Then
        assertEquals(Arrays.asList(solution), Arrays.asList(fighterSelection));
    }

    @Test
    public void shouldWorkWithFewMoves() {

        //Given
        String[] moves = new String[]{"up", "left", "right", "left", "left"};

        //When
        String[] solution = new String[]{"Ryu", "Vega", "Ryu", "Vega", "Balrog"};
        String[] fighterSelection = new StreetFighterSelection(fighters, startingPosition, moves).ChooseCharacter();

        //Then
        assertEquals(Arrays.asList(solution), Arrays.asList(fighterSelection));
    }

    @Test
    public void shouldWorkWhenAlwaysMovingLeft() {

        //Given
        String[] moves = new String[]{"left", "left", "left", "left", "left", "left", "left", "left"};

        //When
        String[] solution = new String[]{"Vega", "Balrog", "Guile", "Blanka", "E.Honda", "Ryu", "Vega", "Balrog"};
        String[] fighterSelection = new StreetFighterSelection(fighters, startingPosition, moves).ChooseCharacter();


        //Then
        assertEquals(Arrays.asList(solution), Arrays.asList(fighterSelection));
    }

    @Test
    public void shouldWorkWhenAlwaysMovingRight() {

        //Given
        String[] moves = new String[]{"right", "right", "right", "right", "right", "right", "right", "right"};

        //When
        String[] solution = new String[]{"E.Honda", "Blanka", "Guile", "Balrog", "Vega", "Ryu", "E.Honda", "Blanka"};
        String[] fighterSelection = new StreetFighterSelection(fighters, startingPosition, moves).ChooseCharacter();

        //Then
        assertEquals(Arrays.asList(solution), Arrays.asList(fighterSelection));
    }

    @Test
    public void shouldWorkWhenMovingRightAndLeftOnly() {

        //Given
        String[] moves = new String[]{"right", "left", "right", "left", "right", "left", "right", "left", "right", "left", "right", "left", "right", "left", "right", "left"};

        //When
        String[] solution = new String[]{"E.Honda", "Ryu", "E.Honda", "Ryu", "E.Honda", "Ryu", "E.Honda", "Ryu", "E.Honda", "Ryu", "E.Honda", "Ryu", "E.Honda", "Ryu", "E.Honda", "Ryu"};
        String[] fighterSelection = new StreetFighterSelection(fighters, startingPosition, moves).ChooseCharacter();

        //Then
        assertEquals(Arrays.asList(solution), Arrays.asList(fighterSelection));
    }

    @Test
    public void shouldUseAll4DirectionsClockwiseTwice() {

        //Given
        String[] moves = new String[]{"up", "left", "down", "right", "up", "left", "down", "right"};

        //When
        String[] solution = new String[]{"Ryu", "Vega", "M.Bison", "Ken", "Ryu", "Vega", "M.Bison", "Ken"};
        String[] fighterSelection = new StreetFighterSelection(fighters, startingPosition, moves).ChooseCharacter();

        //Then
        assertEquals(Arrays.asList(solution), Arrays.asList(fighterSelection));
    }

    @Test
    public void shouldUseAll4DirectionsClockwiseTwiceWithDifferentPosition() {

        //Given
        String[] moves = new String[]{"up", "left", "down", "right", "up", "left", "down", "right"};
        startingPosition = new int[]{1, 4};

        //When
        String[] solution = new String[]{"Balrog", "Guile", "Dhalsim", "Sagat", "Balrog", "Guile", "Dhalsim", "Sagat"};
        String[] fighterSelection = new StreetFighterSelection(fighters, startingPosition, moves).ChooseCharacter();

        //Then
        assertEquals(Arrays.asList(solution), Arrays.asList(fighterSelection));
    }

    @Test
    public void shouldWorkWhenAlwaysMovingDown() {

        //Given
        String[] moves = new String[]{"down", "down", "down", "down"};

        //When
        String[] solution = new String[]{"Ken", "Ken", "Ken", "Ken"};
        String[] fighterSelection = new StreetFighterSelection(fighters, startingPosition, moves).ChooseCharacter();

        //Then
        assertEquals(Arrays.asList(solution), Arrays.asList(fighterSelection));
    }

    @Test
    public void shouldWorkWhenAlwaysMovingUp() {

        //Given
        String[] moves = new String[]{"up", "up", "up", "up"};

        //When
        String[] solution = new String[]{"Ryu", "Ryu", "Ryu", "Ryu"};
        String[] fighterSelection = new StreetFighterSelection(fighters, startingPosition, moves).ChooseCharacter();

        //Then
        assertEquals(Arrays.asList(solution), Arrays.asList(fighterSelection));
    }

    @Test
    public void shouldWorkWhenItsDifferentMoves() {

        //Given
        String[] moves = new String[]{"up", "qw", "up", "x"};

        //When
        List<Object> solution = Collections.emptyList();
        String[] fighterSelection = new StreetFighterSelection(fighters, startingPosition, moves).ChooseCharacter();

        //Then
        assertEquals(solution, Arrays.asList(fighterSelection));
    }

    @Test
    public void shouldWorkWhenItsDifferentMovesButNamedCharacters() {

        //Given
        String[] moves = new String[]{"Vega", "Balrog", "Ken", "Ryu"};

        //When
        List<Object> solution = Collections.emptyList();
        String[] fighterSelection = new StreetFighterSelection(fighters, startingPosition, moves).ChooseCharacter();

        //Then
        assertEquals(solution, Arrays.asList(fighterSelection));
    }

    @Test
    public void shouldWorkWhenItsDifferentMovesAndSomeEmpty() {

        //Given
        String[] moves = new String[]{"Vega", "Balrog", " ", "ss", "Ken", "Ryu"};

        //When
        List<Object> solution = Collections.emptyList();
        String[] fighterSelection = new StreetFighterSelection(fighters, startingPosition, moves).ChooseCharacter();

        //Then
        assertEquals(solution, Arrays.asList(fighterSelection));
    }
}