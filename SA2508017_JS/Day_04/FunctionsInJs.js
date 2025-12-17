// console.log("function declaration")
// //without parameter

// function test1() {
//     console.log("function calling")
// }

// //calling the function by its name.
// test1();

// console.log("function with parameter")

// function test2(name) {
//     console.log("Welcome " + name);
// }

// test2("Sachin");

// console.log("=======================function declaration with parameter with return type")

// function test3(num1, num2) {
//     return num1 + num2;
// }

// console.log(test3(20, 40))
// let result = test3(60, 70)
// console.log(result)


console.log("========function expression=========")
// anonymous : function without functionName

let funName = function (id, name) {
    console.log("Student id is " + id);
    console.log("Student name is " + name);
}

funName(709,"Sachin"); // calling anonymous function.

console.log("=============arrow function=================")

       let arrowFunction =  (num1,num2)=>{
                    return num1+num2;
        }

        console.log(arrowFunction(40,90)); // calling arrow function
        let result = arrowFunction(90,90);
        console.log(result)