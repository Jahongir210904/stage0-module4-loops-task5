package school.mjc.stage0.loops.task5;

import javax.swing.*;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        String str="";
        if(cathetusLength>0){
            for (int i = 0; i < cathetusLength; i++) {
                for (int j = 0; j < cathetusLength; j++) {
                    if (j<i){
                        str+="8";
                    } else if (j == i) {
                        str+="8\n";
                    }
                }
            }
        }
        System.out.print(str);
    }
}
