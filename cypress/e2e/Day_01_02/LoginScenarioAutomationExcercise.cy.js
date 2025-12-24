
describe("login",function(){

    const user = {
        userName: "nitingupta3005@gmail.com",
        password:"Smart@123"
    }
    
    it('login with credentails',function(){

        cy.visit("https://automationexercise.com/login");
        cy.get("input[name='email'][data-qa='login-email']").type(user.userName);
        cy.get("input[name='password'][data-qa='login-password']").type(user.password);
        cy.get("button[data-qa='login-button']").click();
    })
})

  
  
  
  