package Week2;

/**
 * Created by Poosh on 09.07.2017.
 *
     The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i>
     and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

     makeTags("i", "Yay") → "<i>Yay</i>"
     makeTags("i", "Hello") → "<i>Hello</i>"
     makeTags("cite", "Yay") → "<cite>Yay</cite>"
 */
public class w2h5_12 {
    public static String makeTags(String tag, String word) {
        String makeTags = "<" + tag + ">" + word + "</" + tag + ">";
        return makeTags;
    }
}
