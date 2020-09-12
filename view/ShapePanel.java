package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.ShapeEventListener;

import java.awt.Container;

import java.awt.GridLayout;
import java.awt.BorderLayout;

public class ShapePanel {

	private JFrame window;
	private ShapeCanvas canvas;
	private JButton randomShapeButton;
	private JButton exitButton;

	public ShapePanel(JFrame widnow){
		this.window =widnow;
	}
	public void init(){
		Container cp=  window.getContentPane();
		JPanel southPanel = new JPanel();
		cp.add(BorderLayout.SOUTH, southPanel);
		
		 randomShapeButton = new JButton("Random Shapes");
		 exitButton = new JButton("Exit");
		southPanel.add(randomShapeButton);
		southPanel.add(exitButton);

		// CAnvas
		canvas = new ShapeCanvas(this);
		cp.add(BorderLayout.CENTER,canvas);

		// event Listener
		ShapeEventListener listener = new ShapeEventListener(this);
		randomShapeButton.addActionListener(listener);
		exitButton.addActionListener(listener);
	}


	public JButton getRandomShaButton(){
		return randomShapeButton;
	}
		public JButton getExitButton(){
			return exitButton;
		}

		public ShapeCanvas getCanvas(){
			return canvas;
		}
		
		public JFrame getWindow(){
			return window;
		}

	}
	

