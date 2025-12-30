describe("Handling dropdown in cypress", function () {

    it("automate select dropdown", () => {
        cy.screenshot("test1")
        cy.visit("https://testautomationpractice.blogspot.com/")
        cy.get("#country")
            .select('germany')
            .should('have.value', "germany") // select by value
        cy.wait(2000);
        cy.get("#country").select("Japan")
            .should('have.value', "japan") // select by visible text/ inner text
        cy.wait(1000)
        cy.get("#country")
            .select(5)
            .should('have.value', 'australia') // select by index
            cy.screenshot("test2")

    })

    it("automate dropdown without select tagname", () => {
        cy.visit("https://www.dummyticket.com/dummy-ticket-for-visa-application/")
        // going to take element screenshot
        cy.get("#select2-billing_country-container").screenshot("CountryElement")
        cy.get("#select2-billing_country-container").click();
        cy.get(".select2-search__field").type("Italy").type('{enter}')
        cy.get("#select2-billing_country-container").should('have.text', 'Italy');
        cy.screenshot("Dummyticket") // complete page screenshot

    })


    it("Handle mulitple elements in cypress", () => {
        cy.visit("https://www.google.com/")
        cy.get("[name='q']").type("cypress Automation");
        cy.wait(1000)
        cy.screenshot("test4")
        cy.get(".wM6W7d[role='presentation'] > span").should('have.length', 10);
        cy.get(".wM6W7d[role='presentation'] > span").each(($ele) => {
            cy.log("get suggestion texts " + $ele.text());
            if ($ele.text() == 'cypress automation tutorial') {
                cy.log('targeted element text ' + $ele.text());
                cy.wrap($ele).click();
            }
        })

    })







})