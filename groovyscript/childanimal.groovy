class HelloWorld{
	static void main(String[] args){
		
		//def pussy = new Animal(name : 'cat', sound : 'meow');
		def pussy = new Animal('cat','meow');
		
		println(pussy.name+" says "+pussy.sound);
		
	}

}