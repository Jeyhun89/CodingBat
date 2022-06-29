/**
 * Given a string, return the longest substring that appears at both the beginning and
 * end of the string without overlapping. For example, sameEnds("abXab") is "ab".
 *
 *
 * sameEnds("abXYab") → "ab"
 * sameEnds("xx") → "x"
 * sameEnds("xxx") → "x"
 */

public class String3_SameEnds {

    public String sameEnds(String string) {

        String result = "";

        for(int i=0; i <= string.length()/2; i++){

            String sub = string.substring(0, i);

            if(string.startsWith(sub) && string.endsWith(sub)){

                result = sub;

            }
        }
        return result;
    }

}
