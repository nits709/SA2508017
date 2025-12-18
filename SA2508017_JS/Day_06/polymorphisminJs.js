/**
 * types
 * 1. overloading (compile time polyphormishm) (not possbile in javascript)
 * 2. overriding (runTime) - inheritence
 * 
 * 
 */

class Test{


print(){
    console.log("print1---- Hello");
}

print(fname){
    console.log("print2 ---- hello "+ fname);
}

}

console.log("Over loading is not possible in javascript")

let t1 = new Test();
t1.print();  // line 12
//t1.print("Nitin");


/// give a try to write code achieve runtime polymorphism




