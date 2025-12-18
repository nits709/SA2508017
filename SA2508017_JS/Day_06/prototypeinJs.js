/**
 * What is prototype?
 * In JS, a prototype is mechanism that allows objects to inherits properties and method
 * from other object.
 * When you create an object JS automatically links it to another object called is prototype
 * 
*/

// function Employee(id, name) {
//     this.id = id;
//     this.name = name;
// }
// //classname.prototype.langugage

// Employee.prototype.langugage="javascripts";


// let l1 = new Employee(101, "Amit");
// //l1.langugage = "javascripts";

//  console.log("Id: "+ l1.id + " Name "+ l1.name + " Lanuguage "+ l1.langugage)

//  console.log("-----------------------------------------------------------")

//  let l2 = new Employee(102,"Arun");
//  console.log("Id "+ l2.id + " Name "+ l2.name + " Langugage "+ l2.langugage);


console.log("----------reusable Method")


let data = "Hello Everyone         ";
console.log("Length of data String " + data.length);

// console.log("get character count " + data.trim().length);

String.prototype.trueLength = function () {
    return this.trim().length;
}

console.log("get data count "+ data.trueLength());