package SalesmansTravel;

public class Travel {
    public static String travel(String r, String zipcode) {

        if (r.length()<=0){
            return zipcode;
        }

        String[] splittedAddress = r.split(",");
        StringBuilder namesOfStreet = new StringBuilder();
        StringBuilder numbersOfStreet = new StringBuilder();

        for (String address : splittedAddress) {
            String zipCodeOfStreet = address.substring(address.length() - 8);
            if (zipcode.equals(zipCodeOfStreet)) {
                String[] splittedStreet = address.split(" ");
                numbersOfStreet.append(splittedStreet[0]);
                numbersOfStreet.append(",");
                for (int j = 1; j < splittedStreet.length - 2; j++) {
                    namesOfStreet.append(splittedStreet[j]);
                    namesOfStreet.append(" ");
                }
                //deleting last space in StringBuffer
                namesOfStreet.deleteCharAt(namesOfStreet.length() - 1);
                namesOfStreet.append(",");
            }
        }

        if (numbersOfStreet.length() == 0){
            return zipcode + ":/";
        }

        //deleting last comma in both SpringBuffers
        namesOfStreet.deleteCharAt(namesOfStreet.length()-1);
        numbersOfStreet.deleteCharAt(numbersOfStreet.length()-1);

        return zipcode + ":" + namesOfStreet + "/" + numbersOfStreet;
    }
}