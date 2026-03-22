package com.practice;

import static org.mockito.Mockito.doNothing;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.practice.entity.Products;
import com.practice.repository.ProductRepository;
import com.practice.service.ProductService;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

	@Mock
	ProductRepository productRepository;

	@InjectMocks
	ProductService productService;

	@BeforeAll
	public static void testAll() {
		System.out.println("Before All Executed");
	}

	@BeforeEach
	public void testEach() {
		System.out.println("Before Each Executed");
	}

	@Test
	public void testProduct() {
		System.out.println("Test Product");
	}

	@Test
	public void addProductSuccessfully() {
		System.out.println("addProductSuccessfully");
		Products product = new Products();
		product.setPid("101");
		product.setName("TEST");
		product.setQauntity("15");
		Mockito.when(productRepository.save(product)).thenReturn(product);
		Products addedProducts = productService.createProduct(product);

		Assertions.assertNotNull(addedProducts);
		Assertions.assertEquals(product.getPid(), addedProducts.getPid());
	}

	@Test
	public void addProductThrowAnError() {
		Products product = new Products();
		product.setPid("101");
		product.setName("");
		product.setQauntity("15");

		RuntimeException runTimeException = Assertions.assertThrows(RuntimeException.class,
				() -> productService.createProduct(product));

		Assertions.assertEquals("Invalid Name of Product", runTimeException.getMessage());
	}

	@AfterAll
	public static void afterAll() {
		System.out.println("After All Executed");
	}

	@AfterEach
	public void afterEach() {
		System.out.println("After Each Executed");
	}

	@Test
	public void deleteSuccessfully() {
		doNothing().when(productRepository).deleteById("1");
		productService.deleteProduct("1");
		Mockito.verify(productRepository, Mockito.times(1)).deleteById("1");
	}

	@Test
	public void testPrivateMethod_validateName() throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method validateName = ProductService.class.getDeclaredMethod("validateName", String.class);
		validateName.setAccessible(true);
		Boolean name = (Boolean) validateName.invoke(productService, "Book");
		Assertions.assertTrue(name);
	}

	@Test
	public void testPrivateMethod_InvalidName() throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Method validateName = ProductService.class.getDeclaredMethod("validateName", String.class);
		validateName.setAccessible(true);
		Boolean name = (Boolean) validateName.invoke(productService, "");
		Assertions.assertFalse(name);
	}
}
