console.log("function declaration")
//without parameter

function test1(){
    console.log("function calling")
}

//calling the function by its name.
test1();

console.log("function with parameter")

function test2(name){
    console.log("Welcome "+ name);
}

test2("Sachin");

console.log("=======================function declaration with parameter with return type")

function test3(num1, num2){
         return num1+num2;
}

console.log(test3(20,40))
let result =   test3(60,70)
console.log(result)
