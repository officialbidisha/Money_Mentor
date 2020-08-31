package com.example.demo.model;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
	public class itemlist {
			@Id
			public ObjectId _id;
			public String itemname;
			public String categories;
			public String date;
			public double price;
			public itemlist(ObjectId _id, String itemname, String categories, String date, double price) {
				super();
				this._id=_id;
				this.itemname=itemname;
				this.categories=categories;
				this.date=date;
				this.price=price;
				
			}
			public String get_id() {
				return _id.toHexString();
			}
			public void set_id(ObjectId _id) {
				this._id = _id;
			}
			public String getItemname() {
				return itemname;
			}
			public void setItemname(String itemname) {
				this.itemname = itemname;
			}
			public String getCategories() {
				return categories;
			}
			public void setCategories(String categories) {
				this.categories = categories;
			}
			public String getDate() {
				return date;
			}
			public void setDate(String date) {
				this.date = date;
			}
			public double getPrice() {
				return price;
			}
			public void setPrice(double price) {
				this.price = price;
			}
	}

