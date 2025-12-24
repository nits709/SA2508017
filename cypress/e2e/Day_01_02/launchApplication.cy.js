
describe("my first script",function(){

    //get - launch the url in selenium
    //visit - launch the app url function in cypress.
    //cy -- cypress object

    //testcase 1
    it("Launch google url",function(){
    cy.visit("https://google.co.in")
        cy.log("application launched")
    })

    //testcase 2 
    it("launch orangeHRM",function(){
        cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
        cy.log("OrangeHRM Launched")
    })
})