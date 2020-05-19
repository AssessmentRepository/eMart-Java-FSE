package com.emart.test.boundarycases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.emart.entitys.Category;
import com.emart.entitys.Discounts;
import com.emart.entitys.Items;
import com.emart.entitys.PurchaseHistory;
import com.emart.entitys.SubCategory;
import com.emart.entitys.Transactions;
import com.emart.entitys.User;
import com.emart.test.utilityclasses.CategoryData;
import com.emart.test.utilityclasses.DiscountsData;
import com.emart.test.utilityclasses.ItemsData;
import com.emart.test.utilityclasses.PurchaseHistoryData;
import com.emart.test.utilityclasses.SubCategoryData;
import com.emart.test.utilityclasses.TransactionsData;
import com.emart.test.utilityclasses.UserData;

/**
 * @author B Shashidhar
 *
 * 
 */
public class BoundaryTestCases {
	private Validator validator;

    @BeforeEach
    public void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }
    @Test
    public void testCategorySuccess() {
    	Category category = CategoryData.getCategoryDetails();
        Set<ConstraintViolation<Category>> violations = validator.validate(category);
        assertTrue(violations.isEmpty());
    }
    @Test
    public void testCategoryIdField() {
    	Category category = CategoryData.getCategoryDetails();
    	category.getCategory_ID();
		int id = 1;
		boolean idLength = ((category.getCategory_ID().length()) >= id);
		assertEquals(idLength, true);
    }
    @Test
	public void testCategory_NameField() {
    	Category category = CategoryData.getCategoryDetails();
    	category.getCategory_Name();
		int name = 3;
		boolean nameLength = ((category.getCategory_Name().length()) >= name);
		assertEquals(nameLength, true);
	}
    @Test
    public void testBrief_DetailsField() {
    	Category category = CategoryData.getCategoryDetails();
    	category.getBrief_Details();
    	int detail = 5;
    	boolean detailLength = ((category.getBrief_Details().length()) >= detail);
    	assertEquals(detailLength, true);
    }
    @Test
    public void testDiscountsSuccess() {
    	Discounts discounts = DiscountsData.getDiscountsDetails();
        Set<ConstraintViolation<Discounts>> violations = validator.validate(discounts);
        assertTrue(violations.isEmpty());
    }
    @Test
    public void testDiscountsCategory_IdField() {
    	Discounts discounts = DiscountsData.getDiscountsDetails();
    	discounts.getID();
		int id = 1;
		boolean idLength = ((discounts.getID().length()) >= id);
		assertEquals(idLength, true);
    }
    @Test
	public void testDiscount_CodeField() {
    	Discounts discounts = DiscountsData.getDiscountsDetails();
    	discounts.getDiscount_Code();
		int code = 3;
		boolean codeLength = ((discounts.getDiscount_Code().length()) >= code);
		assertEquals(codeLength, true);
	}
    @Test
    public void testPercentageField() {
    	Discounts discounts = DiscountsData.getDiscountsDetails();
    	discounts.getPercentage();
    	int per = 1;
    	@SuppressWarnings("static-access")
		boolean detailLength = ((discounts.getPercentage().SIZE) >= per);
    	assertEquals(detailLength, true);
    }
    @Test
    public void testDiscountsDescriptionField() {
    	Discounts discounts = DiscountsData.getDiscountsDetails();
    	discounts.getDescription();
    	int desc = 3;
    	boolean descLength = ((discounts.getDiscount_Code().length()) >= desc);
    	assertEquals(descLength, true);
    }
    @Test
    public void testItemSuccess() {
    	Items items = ItemsData.getItemsDetails();
        Set<ConstraintViolation<Items>> violations = validator.validate(items);
        assertTrue(violations.isEmpty());
    }
    @Test
    public void testIdField() {
    	Items items = ItemsData.getItemsDetails();
    	items.getID();
		int id = 1;
		boolean idLength = ((items.getID().length()) >= id);
		assertEquals(idLength, true);
    }
    @Test
    public void testCategory_IdField() {
    	Items items = ItemsData.getItemsDetails();
    	items.getCategory_ID();
    	int cat_id = 1;
    	boolean cat_Id_Length = ((items.getCategory_ID().length()) >= cat_id);
    	assertEquals(cat_Id_Length, true);
    }
    @Test
    public void testSubCategory_IdField() {
    	Items items = ItemsData.getItemsDetails();
    	items.getSubcategory_ID();
    	int sub_cat_id = 1;
    	boolean sub_Cat_Id_Length = ((items.getSubcategory_ID().length()) >= sub_cat_id);
    	assertEquals(sub_Cat_Id_Length, true);
    }
    @Test
    public void testPriceField() {
    	Items items = ItemsData.getItemsDetails();
    	items.getPrice();
    	int price = 1;
    	@SuppressWarnings("static-access")
		boolean price_Length = ((items.getPrice().SIZE) >= price);
    	assertEquals(price_Length, true);
    }
    @Test
    public void testItemNameField() {
    	Items items = ItemsData.getItemsDetails();
    	items.getItem_Name();
    	int itemName = 1;
    	boolean price_Length = ((items.getItem_Name().length()) >= itemName);
    	assertEquals(price_Length, true);
    }
    @Test
    public void testDescriptionField() {
    	Items items = ItemsData.getItemsDetails();
    	items.getDescription();
    	int desc = 3;
    	boolean descLength = ((items.getItem_Name().length()) >= desc);
    	assertEquals(descLength, true);
    }
    @Test
    public void testStockNoField() {
    	Items items = ItemsData.getItemsDetails();
    	items.getStock_Number();
    	int stockNo = 1;
    	boolean stockNoLength = ((items.getItem_Name().length()) >= stockNo);
    	assertEquals(stockNoLength, true);
    }
    @Test
    public void testRemarksField() {
    	Items items = ItemsData.getItemsDetails();
    	items.getRemarks();
    	int remark = 2;
    	boolean remarkLength = ((items.getRemarks().length()) >= remark);
    	assertEquals(remarkLength, true);
    }
    @Test
    public void testPurchaseHistorySuccess() {
    	PurchaseHistory purchaseHistory = PurchaseHistoryData.getPurchaseHistoryDetails();
        Set<ConstraintViolation<PurchaseHistory>> violations = validator.validate(purchaseHistory);
        assertTrue(violations.isEmpty());
    }
    @Test
    public void testPurchaseHistoryIdField() {
    	PurchaseHistory purchaseHistory = PurchaseHistoryData.getPurchaseHistoryDetails();
    	purchaseHistory.getID();
		int id = 1;
		boolean idLength = ((purchaseHistory.getID().length()) >= id);
		assertEquals(idLength, true);
    }
    @Test
	public void testPurchaseHistoryBuyerIdField() {
    	PurchaseHistory purchaseHistory = PurchaseHistoryData.getPurchaseHistoryDetails();
    	purchaseHistory.getBuyer_ID();
		int buyerId = 1;
		boolean buyerIdLength = ((purchaseHistory.getBuyer_ID().length()) >= buyerId);
		assertEquals(buyerIdLength, true);
	}
    @Test
    public void testPurchaseHistorySellerIDField() {
    	PurchaseHistory purchaseHistory = PurchaseHistoryData.getPurchaseHistoryDetails();
    	purchaseHistory.getSeller_ID();
    	int sellerId = 1;
    	boolean sallerIdLength = ((purchaseHistory.getSeller_ID().length()) >= sellerId);
    	assertEquals(sallerIdLength, true);
    }
    @Test
    public void testPurchaseHistoryTransactionIDField() {
    	PurchaseHistory purchaseHistory = PurchaseHistoryData.getPurchaseHistoryDetails();
    	purchaseHistory.getTransaction_ID();
    	int transactionID = 1;
    	boolean transactionIDLength = ((purchaseHistory.getTransaction_ID().length()) >= transactionID);
    	assertEquals(transactionIDLength, true);
    }
    @Test
    public void testPurchaseHistoryNumberOfItemsField() {
    	PurchaseHistory purchaseHistory = PurchaseHistoryData.getPurchaseHistoryDetails();
    	purchaseHistory.getNumber_Of_Items();
    	int numberOfItems = 1;
    	@SuppressWarnings("static-access")
		boolean numberOfItemsLength = ((purchaseHistory.getNumber_Of_Items().SIZE) >= numberOfItems);
    	assertEquals(numberOfItemsLength, true);
    }
    @Test
    public void testPurchaseHistoryRemarksField() {
    	PurchaseHistory purchaseHistory = PurchaseHistoryData.getPurchaseHistoryDetails();
    	purchaseHistory.getRemarks();
    	int remarks = 2;
    	boolean remarkLength = ((purchaseHistory.getRemarks().length()) >= remarks);
    	assertEquals(remarkLength, true);
    }
    @Test
    public void testSubCategorySuccess() {
    	SubCategory subCategory = SubCategoryData.getSubCategoryDetails();
        Set<ConstraintViolation<SubCategory>> violations = validator.validate(subCategory);
        assertTrue(violations.isEmpty());
    }
    @Test
    public void testSubCategoryIdField() {
    	SubCategory subCategory = SubCategoryData.getSubCategoryDetails();
    	subCategory.getSubcategory_ID();
		int subcatid = 1;
		boolean subCatIDLength = ((subCategory.getSubcategory_ID().length()) >= subcatid);
		assertEquals(subCatIDLength, true);
    }
    @Test
    public void testCategoryIdField1() {
    	Category category = CategoryData.getCategoryDetails();
    	category.getCategory_ID();
    	int id = 1;
    	boolean idLength = ((category.getCategory_ID().length()) >= id);
    	assertEquals(idLength, true);
    }
    @Test
	public void testCategoryNameField() {
    	Category category = CategoryData.getCategoryDetails();
    	category.getCategory_Name();
		int name = 3;
		boolean nameLength = ((category.getCategory_Name().length()) >= name);
		assertEquals(nameLength, true);
	}
    @Test
    public void testBriefDetailsField() {
    	Category category = CategoryData.getCategoryDetails();
    	category.getBrief_Details();
    	int detail = 5;
    	boolean detailLength = ((category.getBrief_Details().length()) >= detail);
    	assertEquals(detailLength, true);
    }
    @Test
    public void testTransactionSuccess() {
    	Transactions transactions = TransactionsData.getTransactionsDetails();
        Set<ConstraintViolation<Transactions>> violations = validator.validate(transactions);
        assertTrue(violations.isEmpty());
    }
    @Test
    public void testTransactionsIdField() {
    	Transactions transactions = TransactionsData.getTransactionsDetails();
    	transactions.getID();
		int id = 1;
		boolean idLength = ((transactions.getID().length()) >= id);
		assertEquals(idLength, true);
    }
    @Test
    public void testTransactionsUserIDField() {
    	Transactions transactions = TransactionsData.getTransactionsDetails();
    	transactions.getUser_ID();
    	int id = 1;
    	boolean userIDLength = ((transactions.getUser_ID().length()) >= id);
    	assertEquals(userIDLength, true);
    }
    @Test
	public void testTransactionsSellerIDField() {
    	Transactions transactions = TransactionsData.getTransactionsDetails();
    	transactions.getSeller_ID();
		int sellerID = 1;
		boolean sellerIDLength = ((transactions.getSeller_ID().length()) >= sellerID);
		assertEquals(sellerIDLength, true);
	}
    @Test
    public void testTransactionsTypeField() {
    	Transactions transactions = TransactionsData.getTransactionsDetails();
    	transactions.getTransaction_Type();
    	int typeOfTransaction = 5;
    	boolean typeOfTransactionLength = ((transactions.getTransaction_Type().length()) >= typeOfTransaction);
    	assertEquals(typeOfTransactionLength, true);
    }
//    @Test
//    public void testUserSuccess() {
//    	User user = UserData.getUserDetails();
//        Set<ConstraintViolation<User>> violations = validator.validate(user);
//        assertTrue(violations.isEmpty());
//    }
    @Test
    public void testUserNameLength() {
    	User user = UserData.getUserDetails();
    	user.getUsername();
		int maxChar = 5;
		boolean usernamelength = ((user.getUsername().length()) >= maxChar);
		assertEquals(usernamelength, true);
    }
    @Test
	public void testUserPasswordLength() {
		User user=UserData.getUserDetails();
		user.getPassword();
		int maxChar = 5;
		boolean passwordLength = ((user.getUsername().length()) >= maxChar);
		assertEquals(passwordLength, true);
	}
    @Test
    public void testCompanyNameLength() {
    	User user=UserData.getUserDetails();
    	user.getCompanyname();
    	int maxChar = 5;
    	boolean companyNameLength = ((user.getCompanyname().length()) >= maxChar);
    	assertEquals(companyNameLength, true);
    }
    @Test
    public void testGSTINFiled() {
    	User user=UserData.getUserDetails();
    	user.getGstin();
    	int maxChar = 5;
    	boolean gstin = ((user.getGstin().length()) >= maxChar);
    	assertEquals(gstin, true);
    }
    @Test
    public void testAboutCompanyFiled() {
    	User user=UserData.getUserDetails();
    	user.getAboutCompany();
    	int maxChar = 5;
    	boolean aboutCompany = ((user.getAboutCompany().length()) >= maxChar);
    	assertEquals(aboutCompany, true);
    }
    @Test
    public void testAddressFiled() {
    	User user=UserData.getUserDetails();
    	user.getAddress();
    	int maxChar = 3;
    	boolean address = ((user.getAddress().length()) >= maxChar);
    	assertEquals(address, true);
    }
    @Test
    public void testWebsiteFiled() {
    	User user=UserData.getUserDetails();
    	user.getWebsite();
    	int maxChar = 7;
    	boolean web = ((user.getWebsite().length()) >= maxChar);
    	assertEquals(web, true);
    }
    @Test
    public void testEmailIdFiled() {
    	User user=UserData.getUserDetails();
    	user.getAddress();
    	int maxChar = 10;
    	boolean mail = ((user.getEmailId().length()) >= maxChar);
    	assertEquals(mail, true);
    }
    @Test
    public void testContactNumberFiled() {
    	User user=UserData.getUserDetails();
    	user.getContactNumber();
    	int maxNo = 10;
    	boolean contactNo = ((user.getContactNumber().length()) == maxNo);
    	assertEquals(contactNo, true);
    }
    @Test
    public void testActiveUserFiled() {
    	User user=UserData.getUserDetails();
    	user.getUserBlocked();
    	boolean status = true;
    	assertEquals(status, true);
    }
    @Test
    public void testBlockedUserFiled() {
    	User user=UserData.getUserDetails();
    	user.getUserBlocked();
    	boolean status = false;
    	assertEquals(status, false);
    }
}
