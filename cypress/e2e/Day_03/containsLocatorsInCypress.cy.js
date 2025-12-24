describe("contains locator",()=>{

    it("click on simple alert button",()=>{

        cy.visit('https://testautomationpractice.blogspot.com/')

        //click on element by using text 
        cy.contains('Simple Alert').click();
    })


    it('validate element is visible on page',()=>{
        //launched the application
        cy.visit('https://testautomationpractice.blogspot.com/')

        //validates element visible on page.
        cy.contains("Automation Testing Practice").should('be.visible')
    })


    it.only('use combined function get and contains',()=>{
        cy.visit("https://testautomationpractice.blogspot.com/")


        //use combine function to filter out the element by using text  // cy.get('a') | by.tagname("a")
        cy.get('button').contains("Point Me").should('be.visible');
        cy.log("element identified")

    })
})