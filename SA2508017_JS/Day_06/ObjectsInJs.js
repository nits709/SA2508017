/*
How many ways we can create an object in javascripts

1. Object literal way. {}
    let person = {
            name:"Amit",
            id:101,
            age:30,
            gender:"M",


           function getDetail(){
                //code
           } 
    }

 2. Constructor Function based object.   // 2016
*/

// let person = {

//     Pname: "Arun",
//     id: 101,
//     age: 30,
//     gender: "M",

//     getDetail() {  // Method
//         console.log("getDetail function is calling");
//     },

//     readPersonRecord: function () { //function
//         console.log("readPersonRecord function is calling");
//     }
// }

// console.log("Person Pname "+ person.Pname);
// console.log("Person Pname "+ person.id);
// console.log("Person Pname "+ person.age);
// console.log("Person Pname "+ person.gender);
// person.getDetail();
// person.readPersonRecord();


function Student(id, name, subjectName) {

    //variable
    this.id = id;
    this.name = name;
    this.subjectName = subjectName;

    //function
    this.print = function () {
        console.log("id " + this.id + " : name " + this.name + " subjectName " + this.subjectName);
    }
}


let s1 = new Student(101, "Selenium", "FunctionalAutomation");
s1.print();

