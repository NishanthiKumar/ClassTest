package stream_exAllMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SampleFlatMap {
	public static void main(String[] args) {
		List<Integer>l1=Arrays.asList(23,45,32);
		List<Integer>l2=Arrays.asList(45,78,98);
		List<List<Integer>>list=Arrays.asList(l1,l2);
		List<Integer>res=list.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		res.forEach(z->System.out.println(z));
	}

}
