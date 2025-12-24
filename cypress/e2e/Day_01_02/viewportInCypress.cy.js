


describe('responsive testing on application',()=>{
    it('viewport validation',function(){
        cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
        cy.log("application url launched");
        cy.viewport(320,568); //width and length of the devices
        cy.wait(5000); // similar like thred.sleep | accepts time in miliseconds
        cy.viewport("samsung-s10")
        cy.wait(5000)
    })
})