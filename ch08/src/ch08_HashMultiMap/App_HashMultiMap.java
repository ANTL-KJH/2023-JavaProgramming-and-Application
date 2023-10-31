package ch08_HashMultiMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
public class App_HashMultiMap {
    public static void main(String[] args) throws FileNotFoundException {
        HashMultiMap<String, Thesaurus>
                thesaurusMultiMap = new HashMultiMap();
        final String fname = "C:\\Temp_JavaProg\\thesaurus_dict_UTF_8.txt";
        Scanner fin = new Scanner(new File(fname));
        if (!fin.hasNext()) {
            System.out.printf("Error in reading from fin (%s) ...\n", fname);
            return;
        }
        String keyword, word, type;
        while (fin.hasNext()) {
            String str_line = fin.nextLine();
            System.out.printf("ThesaurusDict:: processing %s\n", str_line);
            StringTokenizer strTokenizer = new StringTokenizer(str_line, " ");
            Thesaurus thesaurus = new Thesaurus();
            keyword = strTokenizer.nextToken();
            thesaurus.setKeyWord(keyword);
            type = strTokenizer.nextToken();
            thesaurus.setType(type);
            while (strTokenizer.hasMoreTokens()) {
                word = strTokenizer.nextToken();
                thesaurus.addThesaurus(word);
            }
            thesaurusMultiMap.put(keyword, thesaurus);
        }
        fin.close();
        Set<String> keys = thesaurusMultiMap.keySet();
        System.out.printf("keys = %s\n", keys);
        Iterator<String> it = keys.iterator();
        Collection<Thesaurus> arrayList_thesaurus;
        while (it.hasNext()) {
            String keyWord = it.next();
            arrayList_thesaurus = thesaurusMultiMap.get(keyWord);
            System.out.printf("key (%s) :\n", keyWord);
            for (Thesaurus ths : arrayList_thesaurus)
                System.out.printf(" %s\n", ths);
        }
    }
}
