package Java.Basic;

public class PlaywrightECommerce {

     Page page;
    //Launch Browser
    PlaywrightECommerce(){
        Playwright pl = PLaywright.create();
        Browser br = pl.newBrowser();
        page = br.newPage();
    }
     public static void main(String[] args) {
        // Create Playwright instance
        try (Playwright playwright = Playwright.create()) {
            
            // Launch browser (chromium, firefox, webkit)
            Browser browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions().setHeadless(false)
            );
            
            // Create a new browser context (like an incognito window)
            BrowserContext context = browser.newContext();
            
            // Open a new page
            Page page = context.newPage();
            
            // Navigate to a URL
            page.navigate("https://example.com");
            
            // Do some actions
            System.out.println("Title: " + page.title());
            page.screenshot(new Page.ScreenshotOptions().setPath(java.nio.file.Paths.get("example.png")));
            
            // Close browser
            browser.close();
        }
    }

    @Test(name="The whole process")
    public void testEcommerece(){
        login("standard_user","secret_sauce");
        addToCart("sauce-labs-backpack");
        String productName = verifyTheCart();
        Assert.assertEquals("Sauce Labs Backpack",productName);
    }



    private String verifyTheCart() {
        page.locator("//a[@class=\"shopping_cart_link\"]").click();
        String val = page.locator("//div[@class=\"inventory_item_name\"]").input_value();
        return val;
    }

    private void addToCart(String string) {
       page.locator("//input[@id=\"add-to-cart-"+ string + "]").click();
    }

    public static void login(String username,String password){
        page.locator("//input[@id=\"user-name]").fill(username);
        page.locator("//input[@id=\"password]").fill(username);
        page.locator("//input[@id=\"login-button]").click();


    }
    

}
