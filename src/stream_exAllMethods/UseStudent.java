package stream_exAllMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student("Nisha",570,"Electronics",100);
		Student s2=new Student("Prathap",571,"Mca",98);
		Student s3=new Student("Karthi",632,"Business",92);
		Student s4=new Student("Vjs",436,"Acting",96);
		Student s5=new Student("Prani",231,"Bca",90);
		
		
		
//		ArrayList<Student>stList=new ArrayList<>();
//		stList.add(s1);stList.add(s2);stList.add(s3);stList.add(s4);stList.add(s5);
		
		List<Student>stList= Arrays.asList(s1,s2,s3,s4,s5);
		
//		long l=stList.stream().count();
		
		Optional<Integer> secondHighestSalary = stList.stream()
			    .map(Student::getMark).distinct().sorted(Comparator.reverseOrder())
			    .skip(1) // skip the first highest salary
			    .findFirst(); // find the second highest salary
		System.out.println(secondHighestSalary);

//			if (secondHighestSalary.isPresent()) {
//			    System.out.println("Second highest salary is: " + secondHighestSalary.get());
//			} else {
//			    System.out.println("There is no second highest salary");
//			}
		
		//reverse order sorted method
//		List<String>list1=stList.stream().map(x->x.getBrand()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//		list1.forEach(z->System.out.println(z));

		//sorted method
//		List<String>list1=stList.stream().map(x->x.getBrand()).sorted().collect(Collectors.toList());
//		list1.forEach(z->System.out.println(z));
		
		//anyMatch method
//		boolean l2=stList.stream().map(z->z.getMark()).anyMatch(s->s==97);
//		System.out.println(l2);
		
		//distinct method
//		List<Integer>list3=stList.stream().map(x->x.getMark()).distinct().collect(Collectors.toList());
//		list3.forEach(z->System.out.println(z));
		
		//limit method
//		List<Student>list4=stList.stream().limit(2).collect(Collectors.toList());
//      list4.forEach(z->System.out.println(z));
		
		//summingInt method
//		int l5=stList.stream().map(c->c.getMark()).collect(Collectors.summingInt(Integer::intValue));
//		System.out.println(l5);
		
		//max method
//		int l6=stList.stream().map(z->z.getMark()).max(Integer::compareTo).orElse(Integer.MIN_VALUE);
//		System.out.println(l6);
		
		//min method
//		int l7=stList.stream().map(z->z.getMark()).min(Integer::compareTo).orElse(Integer.MAX_VALUE);
//		System.out.println(l7);
		
		//flat map method
//		List<List<String>>n1=Arrays.asList(Arrays.asList("Nisha","Prathap","Prani"),
//		Arrays.asList("Kumar","Karthi","Selvi"));
//		List<String> flatWords = n1.stream().flatMap(Collection::stream).collect(Collectors.toList());
//		flatWords.forEach(z->System.out.println(z));
		
		//toArray method
//		Integer[] array = stList.stream().map(z->z.getRollNum()).toArray(Integer[]::new);
//      System.out.println(Arrays.toString(array));
		
		//reduce method
//		int sum = stList.stream().map(x->x.getRollNum()).reduce(0, Integer::sum);
//      System.out.println(sum);
		
		//Convert it to map interface
//		Map<Integer,Student>list=stList.stream().collect(Collectors.toMap(i->i.getRollNum(), i->i));
//		list.forEach((a,b)->System.out.println(a+" "+b));
		
		//findfirst
		
		
		
		
		
				
		
	}

}
