



describe('Assertions on OrangeHRM', () => {


    it.skip('Implicit Assertions on URL', () => {
        cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
        // cy.url().should('include','orangehrmlive') // check some part in url as string

        // //eq - checks the equality means end to end url validation
        // cy.url().should('eq','https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

        // cy.url().should('contain','orangehrm'); // it checks the part of url is present or not
        // cy.url().should('not.contain','greenhrm'); // it checks the part of url is present or not

        //multiple validation on same line of code by using and key word  | chain off approach
        cy.url()
            .should('include', 'orangehrmlive')
            .and('eq', 'https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
            .and('contain', 'orangehrm')
            .and('not.contain', 'greenhrm')
    })

    it.skip('implicit asserrtions on pageTitle', () => {

        cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        cy.title().should('eq', 'OrangeHRM')
        cy.title().should('contain', 'HRM')
        cy.title().should('include', "Orange")

        //check the existence | visibility of an element 
        cy.get(".orangehrm-login-branding > img").should('be.visible').and('exist')

        //check present number of links avaialble over page -- appraoch doing by tagname
        cy.get('a').should('have.length', 5);

        //check entered value 
        cy.get("input[name='username']").type("Admin")
        cy.get("input[name='username']").should('have.value', "Admin");
    })

    it('Explicit Assertions', () => {

        cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
        cy.get("input[name='username']").type("Admin")
        cy.get("input[name='password']").type("admin123")
        cy.get("button[type='submit']").click();


        let expName = "FirstNameTest LastNameTest";
        cy.get(".oxd-userdropdown-tab").then((strUserName)=>{
                       let actName = strUserName.text();

                  //Bdd Style     
                expect(actName).to.equal(expName)    // positive validation    
               // expect(actName).to.not.equal(expName)   // negative validation    
                
                

                //TDD Style
                assert.equal(actName,expName)
               // assert.notEqual(actName,expName)
        })

    }



    )
})