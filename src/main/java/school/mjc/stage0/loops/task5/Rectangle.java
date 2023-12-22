package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int i = 0; i < height; i++) {
            String str="";
            for (int j = 0; j < length; j++) {
                if (i==0 || i==height-1){
                    str+="8";
                } else if (j == 0 || j == length - 1) {
                    str+="8";
                }else {
                    str+=" ";
                }
            }
            System.out.println(str);
        }
    }
}
