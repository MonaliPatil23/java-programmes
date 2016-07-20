import java.util.ArrayList;
import java.util.List;

public class CouponNumber {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		MathRandomExample obj = new MathRandomExample();
		for(int i = 0; i < 5; i++){
			System.out.println(obj.getRandomList(list));
		}
		
	}

	public int getRandomList(List<Integer> list) {

	    //Math.random() = greater than or equal to 0.0 and less than 1
            //0-4
	    int index = (int)(Math.random()*list.size());
	    System.out.println("\nIndex :" + index );
	    return list.get(index);
	    
	}

}

