class helloWorld{
	static void main(String[] args){
		
		//closures
		def getFactorial = { num -> (num <= 1 ? 1 :num*call(num-1))};
		
		println(getFactorial(4));
		
		def greeting = "Goodbye";
		
		def sayGoodbye = {name -> println(greeting +" $name")};
		
		sayGoodbye("yuva");
		
		def randNumList = [1,2,4,6,7,8,5];
		
		def getEven = {num ->return(num % 2 == 0)};
		def evenNums = listEdit(randNumList,getEven);
		println(evenNums);
		 
	}
	static def listEdit(list, clo){
		return list.findAll(clo);
	}

}