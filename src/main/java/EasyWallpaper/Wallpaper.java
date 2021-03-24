package EasyWallpaper;

import jdk.dynalink.beans.StaticClass;

public class Wallpaper {

    static String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};

    public String checkWallpaper(double length, double width, double height) {

        if (length == 0 || width == 0 || height == 0) {
            return "zero";
        }

        double widhtOfRoll = 0.52;
        int standardHeightOfRoll = 10;

        double roomMeasurment = (length / widhtOfRoll * 2) + (width / widhtOfRoll * 2);
        double extra15Percent = 1.15;
        double howMuchRollNeededToRoom = ((roomMeasurment * height) / standardHeightOfRoll) * extra15Percent;

        int roundedHowMuchRoll = Math.toIntExact((long) Math.ceil(howMuchRollNeededToRoom));

        return numbers[roundedHowMuchRoll];

    }
}

/*
John wants to decorate a room with wallpaper. He wants a fool-proof method for getting it right.
John knows that the rectangular room has a length of l meters, a width of w meters, a height of h meters.
The standard width of the rolls he wants to buy is 52 centimeters. The length of a roll is 10 meters.
He bears in mind however, that it’s best to have an extra length of wallpaper handy in case of mistakes or miscalculations
so he wants to buy a length 15% greater than the one he needs.

Rolka ma 52cm WIDTH
Rolka ma 10metrow LENGTH


Your function wallpaper(l, w, h) should return as a plain English word in lower case the number of rolls he must buy.


 */