describe("learning css in cypress",function(){


    //findElements(By.cssSelector("expression"))
    //cy.get("cssSelect")

    it("automation sample app with csslocator",function(){
                cy.visit("https://automationexercise.com/")
                cy.get("[href='/products']").click(); // click on element
                cy.get("input[name='search']").type("T-shirts"); // enter the data on search field
                cy.get("button[id='submit_search']").click();

    })
})