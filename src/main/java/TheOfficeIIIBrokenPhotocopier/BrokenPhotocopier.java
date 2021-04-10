package TheOfficeIIIBrokenPhotocopier;

public class BrokenPhotocopier {

    public static String broken(final String x) {

        String[] split = x.split("");
        StringBuilder builder = new StringBuilder();

        for (String splitted:split) {
            if (splitted.equals("0")){
                builder.append("1");
            }
            if (splitted.equals("1")){
                builder.append("0");
            }
        }
        return builder.toString();
    }
}
