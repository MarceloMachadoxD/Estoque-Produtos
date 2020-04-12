package entities;

public class Product {

// -- Atributos
	private String name;
	private double price;
	private int quantity;

//-- metodos construtores

	// permite iniciar com os valores default do java
	public Product() {
	}

	// obriga a iniciar sempre indicando nome e preço, a quantidade é opcional nesse
	// caso e inicia com o valor default do java
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	// obriga a iniciar sempre indicando todos os atributos
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// ---getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	// --Métodos

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}