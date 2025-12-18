
class Car{ // abstraction without inheritence


constructor(brand){
        this.brand = brand;
}


start(){
    console.log(`${this.brand} is starting`)
}


stop(){
    console.log(`${this.brand} is stoping`)
}
}


let c1 = new Car("Toyota");
c1.start();
c1.stop();