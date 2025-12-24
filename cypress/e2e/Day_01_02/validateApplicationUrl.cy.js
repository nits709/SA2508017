
//
describe("open app url",()=>{

    it("validation application url by title - Positive",()=>{
        cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        cy.title().should('eq','OrangeHRM');
        cy.log("application launched")
    })


    it("validation application url by title - negative",()=>{
        cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        cy.title().should('eq','OrangeHRM123');
        cy.log("application launched")
    })
})