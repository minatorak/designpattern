package demo2.controller;


import demo2.model.Model;
import demo2.view.View;

public class Controller {
	private View view;
	private Model model;
	
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}
	
	
}
