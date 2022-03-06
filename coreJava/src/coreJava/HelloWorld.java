package coreJava;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		String fname = "Krishna";
		String mname = "Murty";
		String lname = "Vucha";
		String full_name = fname.concat(mname).concat(lname);
		System.out.println(full_name);

	}

}
