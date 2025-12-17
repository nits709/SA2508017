/**
 *  className objref = new ClassName();
 * let s1 = new Student(); | user cannot create class object inside the class in JS
 * 
 */


class Student {
//this

    constructor(id,sname) {
        this.id = id;
        this.sname = sname;
    }

    // // method
    // add() { // local variable
    //     // let id = 102;
    //     // let Sname = "sachin";


    //     //global variable.
    //     this.id = 102;
    //     this.Sname= "sachin";
    // }


        // add2(id,sname){
        //     this.id = id;
        //     this.sname = sname;
        // }




    add1(){
        console.log("id is "+ this.id + " : " + "name is " + this.sname)
    }
}

// let s1 = new Student();
// //s1.add();
// s1.add2(103,"sachin");
// s1.add1();


let s2 = new Student(209,"Selenium");
s2.add1();





