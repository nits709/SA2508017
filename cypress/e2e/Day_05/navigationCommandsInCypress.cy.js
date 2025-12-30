

describe("navigatino commands in cypress",()=>{
   it("browser navigation",()=>{
    cy.visit("https://www.google.com/")
    cy.get("[name='q']").type("cypress Automation");
    cy.wait(2000)
    cy.contains("About").click();
    cy.go('back') // takes user back on page
    cy.wait(2000)
    cy.reload(); // refresh the page
    cy.go('forward');
   })
})