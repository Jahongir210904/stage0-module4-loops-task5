package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        String str="";
        if(sideLength>2){
            for (int i = 0; i < sideLength; i++) {
                for (int j = 0; j < sideLength; j++) {
                    if(i==sideLength/2 || j==sideLength/2){
                        str+="8";
                    }else {
                        str+=" ";
                    }
                }
                str+="\n";
            }
        }
        System.out.print(str);
    }
}
