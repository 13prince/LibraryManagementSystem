package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookPage extends BasePage {
	
	public BookPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@placeholder=\"🔍 Search a Book Title, Author or Genre\"]")
	WebElement searchInput;
	
	public void searchBook(String bookName) {
		searchInput.sendKeys(bookName);
	}
	
	@FindBy(xpath = "//button[text()='All']")
	WebElement allBooks;
	
	public void allBook() {
		allBooks.click();
		allBooks.isDisplayed();
	}
	
	@FindBy(xpath = "//button[text()='Fiction']")
	WebElement fictionBooks;
	
	public void fictionsBook() {
		fictionBooks.click();
		fictionBooks.isDisplayed();
	}
	
	@FindBy(xpath = "//button[text()='Non-Fiction']")
	WebElement nonfictionBooks;
	
	public void nonfictionBook() {
		nonfictionBooks.click();
		nonfictionBooks.isDisplayed();
	}
	
	@FindBy(xpath = "//button[text()='Mystery']")
	WebElement mysteryBooks;
	
	@FindBy(xpath = "//button[text()='Romance']")
	WebElement romanceBooks;
	
	@FindBy(xpath = "//button[text()='Thriller']")
	WebElement thrillerBooks;
	
	@FindBy(xpath = "//button[text()='Fantasy']")
	WebElement fantasyBooks;
	
	@FindBy(xpath = "//button[text()='Horror']")
	WebElement horrorBooks;
	
	@FindBy(xpath = "//button[text()='Anime']")
	WebElement animeBooks;
	

}
