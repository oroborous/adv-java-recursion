package inception;

public class Dreamer {
    public void dream() {
        System.out.println("Beginning to dream");
        dream();
        System.out.println("Done dreaming");
    }

    public String dreamAgain(String zzzz) {
        if (zzzz.length() > 5) {
           return zzzz;
        }

        String output = dreamAgain(zzzz + "z");

        System.out.println(output);

        return output;
     }
}
