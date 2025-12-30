

describe('checkbox radiobutton interaction',()=>{



    it.skip('checkbox',()=>{

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

     //.wM6W7d[role='presentation'] - 10
     it("dropdown with dynamic autosuggestion",()=>{
        cy.visit("https://www.google.co.in/");
        cy.get("[name='q']").type('Cypress Automation');
        cy.wait(3000)
       
    cy.get(".wM6W7d[role='presentation'] > span").should('have.length',10)  
    cy.get(".wM6W7d[role='presentation'] > span").each(($el)=>{  //jquery
            cy.log("get suggestion texts "+$el.text())
            if($el.text()=='cypress automation tutorial'){
                cy.log("get the text of links "+ $el.text());
                        cy.wrap($el).click();
            }
           
        })
        cy.get("[name='q']").should('have.value','cypress automation tutorial')
     })
})