class HelloWorld{
	static void main(String[]args){
		println("Hello World");
		
		def x= "hello";
		x= 10;
		println(5 + 4);
		println(5 - 4);
		println(5 * 4);
		println(5.intdiv(4));
		println(5 % 4); 
		
		println(5.2.plus(4.4));
		println(5.2.minus(4.4));
		println(5.2.multiply(4.4));
		println(5.2 / 4.4);
		
		println(x++);
		
		println(Integer.MAX_VALUE);
		println(Integer.MIN_VALUE);
		
		println(Float.MAX_VALUE);
		println(Float.MIN_VALUE);
		
		println(Double.MAX_VALUE);
		println(Double.MIN_VALUE);
		
		println(Math.abs(-2.45));
		println(Math.round(2.45));
		//println(x.pow(3));
		println(x.equals(Float.NaN));
		println(Math.sqrt(100));
		println(Math.cbrt(27));
		println(Math.ceil(2.45));
		//Println(Math.floor(2.45));
		println(Math.min(2,3));
		println(Math.max(2,3));
		println(Math.log(2));
		println(Math.log10(2));
		println(Math.toDegrees(Math.PI));
		println(Math.toRadians(90));
		println(Math.sin(0.5 * Math.PI));
		println(Math.abs(new Random().nextInt()%100)+1);
		
		
		//Strings
		
		def name = "Yuva";
		println(' I am ${name}');
		println("I am ${name}");
		def multiString = '''I am a string
		that goes on
		from many lines''';
		println(name[3]);
		println(name.indexOf('v'));
		println(name[0..2]);  
		println(name[0,2,3]);
		println(name.substring(1));
		println(name.substring(1,2));
		println("What i said is" * 2);
		
		println("what is your name");
		def fname = System.console().readLine();
		println("hello "+fname);
		
		//List
		def primes = [2,3,5,7,11,13];
		def employee = ["yuva",400000, [1,2,3,4]];
		employee.add(23);
		employee + [25, 27];
		employee - [27];
		println(employee.isEmpty());
		println(employee[1..3]);
		println(employee.reverse());
		employee.sort();
		println(employee.pop());
		
	}
}