import java.util.*;

class Coordinate {
	int x;
	int y;

	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
}


public class ShippingCases {

	List<List<Integer>> closestLocations(int shippingCases, List<List<Integer>> allAreas, int vanCapacity) {
		PriorityQueue<Coordinate> queue = new PriorityQueue<>(10,new Comparator<Coordinate>() {
			// @Override
			public int compare(Coordinate a, Coordinate b) {
				double aval = Math.sqrt((a.x * a.x) + (a.y * a.y));
				double bval = Math.sqrt((b.x * b.x) + (b.y * b.y));
				if (aval > bval) {
					return 1;
				} else {
					return -1;
				}
			}

		});

		for (int i = 0; i < allAreas.size(); i++) {
			List<Integer> xy = allAreas.get(i);
			int x = xy.get(0);
			int y = xy.get(1);
			queue.add(new Coordinate(x, y));
		}

		List<List<Integer>> resultLocations = new ArrayList<List<Integer>>();
		for (int i = 0; i < vanCapacity; i++) {
			Coordinate d = queue.remove();
			ArrayList<Integer> al = new ArrayList<Integer>();
			al.add(d.x);
			al.add(d.y);
			resultLocations.add(al);
		}

		return resultLocations;
	}

	public static void main(String[] str) {
		ShippingCases shippingCases = new ShippingCases();
		List<Integer> list1 = new LinkedList<Integer>();
		list1.add(7);
		list1.add(-8);
		List<Integer> list2 = new LinkedList<Integer>();
		list2.add(1);
		list2.add(2);
		List<Integer> list3 = new LinkedList<Integer>();
		list3.add(7);
		list3.add(8);
		List<Integer> list4 = new LinkedList<Integer>();
		list4.add(1);
		list4.add(-1);
		
		List<List<Integer>> mList = new ArrayList<List<Integer>>();
		mList.add(list1);
		mList.add(list2);
		mList.add(list3);
		mList.add(list4);

		List<List<Integer>> resultLocations =  shippingCases.closestLocations(4, mList, 2);
		for (int i = 0; i < resultLocations.size(); i++) {
			List<Integer> xy = resultLocations.get(i);
			System.out.print(xy);
		}
	}
}


