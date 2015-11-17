package edu.osu.cse5234.controller;

import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.osu.cse5234.entity.*;

@Controller
@RequestMapping("/purchase")
public class Purchase {
	
	@RequestMapping(method = RequestMethod.GET)
	public String viewOrderEntryPage(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		Order myOrder = new Order();
		ArrayList<Item> itemList = new ArrayList<>();
		itemList.add(new Item("Introduction to Algorithm", "0"));
		itemList.add(new Item("Introduction to Architecture", "0"));
		itemList.add(new Item("Introduction to Data Mining", "0"));
		myOrder.setItemList(itemList);
		
		request.setAttribute("order", myOrder);
		return "OrderEntryForm";
	}
	
	@RequestMapping(path = "/submitItems", method = RequestMethod.POST)
	public String submitItems(@ModelAttribute("order") Order order, 
			HttpServletRequest request) throws Exception {
		request.getSession().setAttribute("order", order);
		return "redirect:/purchase/paymentEntry";
	}
	
	@RequestMapping(path = "/paymentEntry", method = RequestMethod.GET)
	public String viewPaymentEntryForm(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		request.setAttribute("payment", new PaymentInfo("", "", "", ""));
		return "PaymentEntryForm";
	}
	
	@RequestMapping(path = "purchase/submitPayment", method = RequestMethod.POST)
	public String submitPayment(@ModelAttribute("payment") PaymentInfo payment, 
			HttpServletRequest request) throws Exception {
		request.getSession().setAttribute("payment", payment);
		return "redirect:/purchase/shippingEntry";
	}
	
	@RequestMapping(path = "/shippingEntry", method = RequestMethod.GET)
	public String viewShippingEntryForm(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		request.setAttribute("shippingInfo", new ShippingInfo("", "", "", "", "", ""));
		return "ShippingEntryForm";
	}
	
	@RequestMapping(path = "/submitShippingInfo", method = RequestMethod.POST)
	public String submitShippingInfo(@ModelAttribute("shippingInfo") ShippingInfo shippingInfo, 
			HttpServletRequest request) throws Exception {
		request.getSession().setAttribute("shippingInfo", shippingInfo);
		return "redirect:/purchase/viewOrder";
	}
	
	@RequestMapping(path = "/viewOrder", method = RequestMethod.GET)
	public String viewOrderForm(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		return "ViewOrder";
	}
	
	@RequestMapping(path = "/confirmOrder", method = RequestMethod.POST)
	public String submitConfirmation(HttpServletRequest request) throws Exception {
		return "redirect:/purchase/viewConfirmation";
	}
	
	@RequestMapping(path = "/viewConfirmation", method = RequestMethod.GET)
	public String viewConfirmation(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		return "Confirmation";
	}
}
