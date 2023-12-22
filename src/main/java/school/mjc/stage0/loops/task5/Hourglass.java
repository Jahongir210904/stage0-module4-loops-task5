package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height; i++) {
            String str="";
            for (int j = 0; j < height; j++) {
                if(i + j < height - 1 && i > j || i + j > height - 1 && i < j){
                    str+=" ";
                }else {
                    str+="8";
                }
            }
            System.out.println(str);
        }
    }
}
