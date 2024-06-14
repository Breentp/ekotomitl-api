package com.ekotomitl.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcart", nullable=false)
    private int idcart;

    @OneToOne
    @JoinColumn(name = "buyer_idbuyer") //Llave foranea con buyer
    private Buyer buyer;
    
    @OneToMany(mappedBy="cart") //relación cart_has_product
    private Set<CartHasProduct> cartHasProduct;

	public Cart() {
		super();
	}

	public Cart(int idcart, Buyer buyer, Set<CartHasProduct> cartHasProduct) {
		super();
		this.idcart = idcart;
		this.buyer = buyer;
		this.cartHasProduct = cartHasProduct;
	}

	public int getIdCart() {
		return idcart;
	}

	public void setIdCart(int idCart) {
		this.idcart = idCart;
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	public Set<CartHasProduct> getCartHasProduct() {
		return cartHasProduct;
	}

	public void setCartHasProduct(Set<CartHasProduct> cartHasProduct) {
		this.cartHasProduct = cartHasProduct;
	}

	@Override
	public String toString() {
		return "Cart [idcart=" + idcart + ", buyer=" + buyer + ", cartHasProduct=" + cartHasProduct + "]";
	}

}