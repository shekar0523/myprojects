class HelloWorld{
	static void main(String[] args){
	// functions or methods
		sayHello();
		println(getSum(5,4));
		def myName = "derek";
		def listToDouble = [1,2,3,4];
		listToDouble = doubleList(listToDouble);
		println(listToDouble);
		def nums = sumAll(1,2,3,4);
		println("Sum : "+nums);
		def fact = factorial(nums);
		println(fact);
		
	}
	
	static def sayHello(){
		println("Hello");
	}
	static def getSum(num1 = 0,num2 = 0){
		return num1+num2;
	}
	
	static def doubleList(list){
		def newList = list.collect{it * 2 };
		return newList;
	}
	
	static def sumAll(int... num){
		def sum = 0;
		num.each{sum += it;}
		return sum; 
	}
	
	static def factorial(num){
		if(num==0){
		 return 1;
		}else{
			return (num * factorial(num-1));
		}
	}
	
}
