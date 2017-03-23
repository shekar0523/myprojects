class HelloWorld{
	static void main(String[] args){
		//Maps 
		def yuvaMap = [
		'name' : 'yuva',
		'age' : 25,
		'address' : '2250 marsh ln',
		'list' : [1, 2 , 3],
		'state' : 'TX'
		];
	
		println("Name " + yuvaMap['name']);
		println("age "+ yuvaMap.get('age'));
		yuvaMap.put(['city' , 'carrollton']);
		println("has city "+ yuvaMap.containsKey('city'));
		println(yuvaMap.size());
		
		//Range
		def onetoten = 1..10;
		def atoz = 'a'..'z';
		println(onetoten);
		println(atoz.size());
		println(atoz.get(2));
		println(atoz.getTo());
		println(atoz.getFrom());
		
		//  ==  != < <= > >=   conditional operators
		// && || ! logical operators
		// condition?true:false; terinary operators
		def x=10
		println(x>9?"x ix greaterthan 9":"x is less or equal to 9");
		
	}

}