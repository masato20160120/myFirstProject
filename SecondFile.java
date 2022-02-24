import java.util.Arrays;

import com.sun.tools.javac.util.List;

public class SecondFile{
  public static void main(String[] args){
    
	  java.util.List<Integer> list = Arrays.asList(new Integer[] {1, 2, 3});
	  list.sort((a, b) -> -a.compareTo(b));
	  for(Integer numInteger : list) {
		  System.out.println(num);
	  }
  }
}
