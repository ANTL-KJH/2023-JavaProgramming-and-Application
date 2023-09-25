package ch05_4_1_File_Class_Ex;

import java.io.File;

public class Class_File_Ex {
    public static void listDirectory(File dir) {
        System.out.printf("List of subfile in %s :\n", dir.getPath());
        File[] subFiles = dir.listFiles();
        for (int i=0; i<subFiles.length; i++) {
            File f = subFiles[i];
            long t = f.lastModified();
            System.out.printf("%s", f.getName());
            System.out.printf(", file-size = %d", f.length());
            System.out.printf(", last modified at %tb %td %ta %tT\n", t, t, t, t);
        }
    }
    public static void main(String[] args) {
        String f1_name = "C:\\Users\\ANTL\\Desktop\\GitHub\\2023-JavaProgramming-and-Application\\ch05";
        String f2_name = "C:\\Users\\ANTL\\Desktop\\GitHub\\2023-JavaProgramming-and-Application\\ch05\\dir_test";
        File f1 = new File(f1_name);
        String f1_type = "";
        if (f1.isDirectory())
            f1_type = "directory";
        else if (f1.isFile())
            f1_type = "file";
        System.out.printf("%s (%s) : path: %s, parent: %s\n",
                f1_name, f1_type, f1.getPath(), f1.getParent());
//System.out.printf("List of files in %s:\n", f1_name);
        listDirectory(f1);
        System.out.printf("\nCheck existance and trying to creata subdirectory (%s) .....\n", f2_name );
        File f2 = new File(f2_name);
        if (f2.exists()) {
            System.out.printf("%s is already existing.\n", f2_name);
        } else {
            System.out.printf("%s is not existing, so creating .....\n", f2_name);
            f2.mkdir();
        } //System.out.printf("List of files in %s:\n", f1_name);
        listDirectory(f1);
        System.out.printf("Deleting %s\n", f2_name);
        f2.delete();
        System.out.printf("\nAfter deletion of %s\n", f2_name);
        listDirectory(f1);
    }
}
