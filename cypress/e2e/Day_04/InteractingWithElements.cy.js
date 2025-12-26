

describe('checkbox radiobutton interaction',()=>{



    it('checkbox',()=>{

         cy.visit("https://testautomationpractice.blogspot.com/")
        
    //     //to check the visibility of checkbox
    //     cy.get("input#sunday").should('be.visible') // element is visible or not

       
    //     //cy.get("input#sunday").should('not.be.checked') // ture
        
    //     //checking the sunday checkbox - sunday
    //     cy.get("input#sunday").check().should('be.checked'); // true
    //     //cy.get("input#sunday").click(); 

    //     cy.wait(2000) // duration in milisecond

    //     //unchecking the checkbox - sunday
    //     cy.get("input#sunday").uncheck().should('not.be.checked') // true


    // //check all days checkbox in single go by using commond locator
    // cy.get("input.form-check-input[type='checkbox']").check().should('be.checked')

    // cy.wait(2000)

    // cy.get("input.form-check-input[type='checkbox']").uncheck().should('not.be.checked')

    // i have 7 checkbox's | want to check only 1st and 7th one  | first and last index


    cy.get("input.form-check-input[type='checkbox']").first().check().should('be.checked')

    cy.wait(2000)

    cy.get("input.form-check-input[type='checkbox']").last().check().should('be.checked')




    })
})