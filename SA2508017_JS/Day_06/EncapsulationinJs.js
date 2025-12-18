/**
 * 1.What is OOPS | 
 * 2. purpose
 * 3. How to implement?
 *  To achieve it use getter and setter and define/declared the properties of class within
 *  constructor or function -(automaticall properties become local variables)
 * 
 * 
 * 
 */

class Employee{


constructor(){  // private | local variable
    let id;
    let name;
}

//getter and setters
setId(id){   // public 
        this.id=id;
}

getId(){
    return this.id;
}


setName(name){
    this.name=name;
}

getName(){
    return this.name;
}

}


let e1 = new Employee();
e1.setId(101);
e1.setName("John");


console.log("id : " + e1.getId() + " name : "+ e1.getName());