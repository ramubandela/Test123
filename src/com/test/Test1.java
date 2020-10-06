package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Test1 extends Test {

	public static void m1() {

		System.out.println("test child");
	}

	public static void main(String[] args) throws Throwable {

		try {
			
			BufferedReader br=new BufferedReader(new FileReader("XYZ"));
			while(br.readLine()!=null)
					{
			
					}
			
			/*
			 * Test1 test1=new Test1(); test1.finalize(); test1.finalize(); test1=null;
			 * 
			 * 
			 * System.gc(); System.out.println("after gc");
			 */

			/*
			 * Pattern pattern = Pattern.compile("\\w"); Matcher matcher =
			 * pattern.matcher("a3z4@ k7I#");
			 * 
			 * while(matcher.find()) {
			 * System.out.println(matcher.start()+" "+matcher.end()+" "+matcher.group()); }
			 */
				
			/*
			 * Pattern pattern =
			 * Pattern.compile("[7-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
			 * Matcher matcher = pattern.matcher("5987654300");
			 * 
			 * if(matcher.find()) { System.out.println("valid");
			 * 
			 * }else { System.out.println("not valid"); }
			 * 
			 * 
			 * 
			 */
				
				
			// throw new Exception("exceptinon thrown");

			/*
			 * Test1 test1=new Test1(); test1.m1(); Test tset=new Test(); Test.m1();
			 * 
			 * 
			 * Hashtable ht=new Hashtable<>(); ht.put(null, 0);
			 * 
			 * String s=null;
			 * 
			 * StringBuffer buff=null; HashSet<String> hs=new HashSet<String>();
			 * hs.add("0900"); hs.add(null); hs.add(null); System.out.println(hs+"hs");
			 */

			/*
			 * List<Student> ll=new ArrayList<Student>(); Student student=new Student();
			 * student.setId(1); student.setName("abc"); student.setGen("M");
			 * 
			 * Student student2=new Student(); student2.setId(2); student2.setName("abc");
			 * student2.setGen("M");
			 * 
			 * Student student3=new Student(); student3.setId(3); student3.setName("abc");
			 * student3.setGen("M");
			 * 
			 * 
			 * Student student4=new Student(); student4.setId(4); student4.setName("abc");
			 * student4.setGen("M");
			 * 
			 * ll.add(student); ll.add(student2); ll.add(student3);ll.add(student4); Student
			 * student5=new Student(); student5.setId(5); student.setName("abc");
			 * student.setGen("M");
			 * 
			 * Student student6=new Student(); student6.setId(6); student2.setName("abc");
			 * student2.setGen("M");
			 * 
			 * Student student7=new Student(); student7.setId(7); student3.setName("abc");
			 * student3.setGen("M");
			 * 
			 * 
			 * Student student8=new Student(); student8.setId(8); student4.setName("abc");
			 * student4.setGen("M");
			 * 
			 * ll.add(student5); ll.add(student6); ll.add(student7);ll.add(student8);
			 * 
			 * List<String> collect =
			 * ll.parallelStream().map(x->x.getId()+" 123").collect(Collectors.toList()); //
			 * collect.forEach(n->System.out.println(n));
			 * 
			 * List<Integer> l=new ArrayList();
			 * 
			 * for(int i=0;i<100;i++) { l.add(i); }
			 * 
			 * 
			 * List<Integer> collect2 = l.stream().collect(Collectors.toList());
			 * List<Integer> collect3 = l.parallelStream().collect(Collectors.toList());
			 * 
			 * List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
			 * list.stream().forEach(System.out::println); System.out.println();
			 * list.parallelStream().forEach(System.out::println);
			 * 
			 * List<Student> collect =
			 * ll.stream().filter(p->p.getGen().equals("M")).collect(Collectors.toList());
			 * 
			 * System.out.println(collect);
			 * 
			 * Map<Integer, Student> collect2 =
			 * ll.stream().collect(Collectors.toMap(Student::getId, p->p));
			 * 
			 * for(Entry e:collect2.entrySet()) {
			 * System.out.println(e.getKey()+"  "+e.getValue()); }
			 * 
			 */

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("hi exception block" + e);
		} finally {
			System.out.println("hi finally");
		}
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
System.out.println("finalize method");
	}

}

class Student {
	int id;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", gen=" + gen + "]";
	}

	String name;
	String address;
	String gen;

	public String getGen() {
		return gen;
	}

	public void setGen(String gen) {
		this.gen = gen;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}