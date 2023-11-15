/* Aufgabe 
 * Sie möchten Ihre Musiksammlung verwalten.
 * Erstellen Sie ein 2-Dimensionales Array "Album" vom Typ String mit der Größe 5 und 2 (Es ist ein kleines Album).
 * Fügen Sie dem Album nun 5 Songs hinzu. In der ersten Dimension stehen die Interpreten oder die Komponisten, in der zweiten die Songs. Zum Beispiel:
	Album[0][0] = "Cello Suite No. 1 in G Major"; Album[0][1] = "Johann Sebastian Bach"; (oder "Yo-Yo Ma" als Interpret)
 * In einer For-Schleife sollen dann alle Songs des Albums ausgegeben werden. Verwenden Sie length für die Schleifenbedingung.
 */

package DimensiyonelArray;

public class DimensiyonelArrayAlbum {
    public static void main(String[] args) {
        String[][] album=new String[5][2];
        album[0][0] = "Cello Suite No. 1 in G Major";
        album[0][1] = "Johann Sebastian Bach";

        album[1][0] = "Nightcall";
        album[1][1] = "Kavinsky";

        album[2][0] = "An Tagen wie diesen";
        album[2][1] = "Fettes Brot";

        album[3][0] = "Rip & Tear";
        album[3][1] = "Mick Gordon";

        album[4][0] = "Kickapoo";
        album[4][1] = "Tenacious D";
        for (int i = 0; i < album.length; i++) {
            System.out.print((i+1)+"\t"+album[i][0]+"...... gehört zum "+album[i][1]);
            System.out.println("");
        }

    }
}
