package ch08_SkipList;

public class App_SkipList_str {
    public static void main(String[] args) {
        SkipList<String> skipList = new SkipList<>("SkipList_str", 0.5);
        String[] strArray = {"C", "A", "G", "B", "E", "D"};
        for (String str : strArray) {
            System.out.printf("adding (%s) => ", str);
            skipList.add(str);
            System.out.printf("%s\n", skipList);
        }
        String[] testArray = {"Z", "A"};
        for (String t : testArray) {
            if (skipList.contains(t)) {
                System.out.printf("%s contains %s\n", skipList.getName(), t);
            } else {
                System.out.printf("%s does not contain %s\n", skipList.getName(), t);
            }
        }
        for (String str : strArray) {
            System.out.printf("removing (%s) from SkipList<String> => ", str);
            skipList.remove(str);
            System.out.printf("%s\n", skipList);
        }
    }
}
