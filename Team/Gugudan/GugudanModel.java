package Team.Gugudan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GugudanModel {
    private int dan;
   public void setDan(int dan) {
	   this.dan= dan;
   }
   
   public List<String> calculateGugudan() {
       List<String> result = new ArrayList<>();
       for (int i = 1; i <= 9; i++) {
           result.add(dan + " x " + i + " = " + (dan * i));
       }
       return result;
   }
}