package EasyWallpaper;

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