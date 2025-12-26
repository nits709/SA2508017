
describe("continue locators",()=>{


    it('child parent  relationship function',()=>{


        cy.visit("https://automationexercise.com/category_products/1")
       // cy.get(".features_items").children(".col-sm-4").should('have.length','3')
        //cy.get(".features_items").children(".single-products").should('have.length','3') // this wont works
         cy.get(".features_items").find(".single-products").should('have.length','3');
    })


    it('validate property of specific element by using eq()',()=>{

// driver.findElements(locators)).get(2)
        cy.visit("https://automationexercise.com/category_products/1")
        cy.get(".features_items")
        .children(".col-sm-4").eq(0)
        .find("[href='/product_details/3']")
        .should('have.text','View Product')
        
    })


    it.only('filter the element based on certain condition- checkbox',()=>{
       
            cy.visit('https://omayo.blogspot.com/')
            cy.get("[type='checkbox']").should('have.length',7)
            cy.get("[type='checkbox']").filter("[value='Pen']").eq(1).click();
       

    })

})