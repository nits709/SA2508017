/**
 * Inheritence.
 * Aquaring the properties of one class into another class inHeritence.
 * 1. purpose.
 *  a. code reusability
 *  b. avoid code duplication - optimization.
 *  c. implement runtime polymorphism 
 *  B extends A (child and parent relationship)
 *  A -- is parent 
 *  B is child
 *  child can access the properties of parent and its own
 *  Parent can access own property only.
 */

class Vehical{ // parent

breakFeature(){
    console.log("Vehical---------- break function is calling");
}
}


class Car extends Vehical{  // car become child 

startCar(){
    console.log("Car -------- startCar funciton is calling")
}



stopCar(){
    console.log("Car -------- stopCar funciton is calling")
}


}

// let c1 = new Car();
// c1.startCar(); // own
// c1.stopCar();  // own
// c1.breakFeature(); //parent 

// let v1 = new Vehical();
// v1.breakFeature(); // own
// v1.startCar();   // undefined | exceptions
// v1.stopCar();   // undefined | exceptions


class BMW extends Car{

    autoEngine(){
        console.log("autoEngine funciton is calling from BMW")
    }
}

let c1 = new BMW();
c1.startCar();  // inherited
c1.stopCar(); //// inherited
c1.autoEngine(); // inherited
c1.breakFeature(); // inherited