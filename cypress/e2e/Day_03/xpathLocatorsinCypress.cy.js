

describe("learning xpath locator in cypress", () => {

    it("xpath demo", function () {
        //open application URL
        cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
        cy.xpath("//input[@name='username']");
        cy.xpath("//input[@name='username']").type("Admin");
        cy.xpath("//input[@name='password']").type("admin123");
        cy.xpath("//button[@type='submit']").click();
        cy.xpath("//span[@class='oxd-userdropdown-tab']/i").click();
        cy.xpath("(//a[@role='menuitem'])[4]").click();
        cy.log("loctor identified")
    })
})