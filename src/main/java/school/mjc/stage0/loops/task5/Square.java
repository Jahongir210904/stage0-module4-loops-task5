package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        String str="";
        if (sideLength>=2){
            for (int i = 0; i < sideLength; i++) {
                for (int j = 0; j < sideLength; j++) {
                    if(j!=0 && j!=sideLength-1 && i!=0 && i!=sideLength-1){
                        str+=" ";
                    }else {
                        str+="8";
                    }
                }
                    str+="\n";
            }
        }
        System.out.print(str);
    }
}
