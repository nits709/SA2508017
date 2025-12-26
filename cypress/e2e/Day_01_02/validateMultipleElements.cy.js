
describe("validate productTile underMen", function(){

    it("validate tiel counts", function(){
       cy.visit("https://automationexercise.com/category_products/3")
        cy.get("[href='#Men']").click();
        cy.get("[href='/category_products/3']").click();

        // search an element hold number of matching and validate against expected size
        cy.get(".features_items .col-sm-4").should('have.length',6)
    })
})