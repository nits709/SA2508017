
describe("hooks in cypress", () => {


    // before/After hooks is similar to before/After Test Anotations in selenium
    // 1. before() - this block of code run once before all testcases runs are present inside the describe - test suites
    // 2. after() - this block of code runs once after all testcases runs are present inside the describe 

    //before/AfterEach is similar to before/After Methods in selenium
    // 3. beforeEach() - Runs  before each testcases which are present in describe block
    // 4. afterEach() - runs after each testcases which are present in describe block

    before("launch Browser", () => {
        cy.log("Launching the browser")
    })

    beforeEach("launch URL of applicaiton", () => {   // this executes prior each test runs
        cy.log("Launching the URL")
    })

    it("testA", () => {

        cy.log("testA is executing")
    })


    it("testB", () => {

        cy.log("testB is executing")
    })

    it("testC", () => {
        cy.log("testC is executing")
    })


    after("quitting browser", () => {
        cy.log("Closing the browser")
    })

    afterEach("Closing URL of applicaiton", () => {   // this executes after each test runs
        cy.log("Closing the URL")
    })


})